import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class P2 {  // Serveur de P1 et Client de P3

	public static void main(String[] args) {
		try {
			ServerSocket s = new ServerSocket(2008);
			Socket con = s.accept();
			ObjectInputStream in = new ObjectInputStream(con.getInputStream());
			String ch = (String) in.readObject();
			System.out.println("ch = "+ ch);
			
			Socket c2 = new Socket("localhost",2010);
			ObjectOutputStream out2=new ObjectOutputStream(c2.getOutputStream());
			out2.writeObject(ch);
			s.close();con.close();in.close();c2.close();out2.close();
		}
		catch(Exception e){System.out.println("Exception dans le P1"+e.toString());}

	}

}
