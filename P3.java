import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class P3 { // S= {P1, P2, P3}  
	// -  P1 est le client de P2
	// -P2 est serveur de P1.
	// P3 est un sevreur de P2
	// P2 est un cleint de P3.
	// P1-----P2-----P3

	public static void main(String[] args) {
		try {
			ServerSocket s = new ServerSocket(2010);
			Socket cn = s.accept();
			ObjectInputStream in3 = new ObjectInputStream(cn.getInputStream());
			String str = (String) in3.readObject();
			System.out.println(str);
			s.close();cn.close();in3.close();
			
		}catch(Exception e){System.out.println("Exception dans le P1"+e.toString());}

	}

}
