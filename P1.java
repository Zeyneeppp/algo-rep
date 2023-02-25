import java.io.ObjectOutputStream;
import java.net.Socket;

public class P1 {

	public static void main(String[] args) {
		try {
			Socket c = new Socket("localhost", 2008);
			ObjectOutputStream out = new ObjectOutputStream(c.getOutputStream());
			out.writeObject("RSD");
			c.close();out.close();			
		}
		catch(Exception e){System.out.println("Exception dans le P1"+e.toString());}

	}

}
