import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			ServerSocket s = new ServerSocket(2004);
			System.out.println("Server is waiting .....");  // Client 1
			Socket connection = s.accept();
			System.out.println("Client accepted .....");
			
			//pour lire les donnés du client
			ObjectInputStream is= new ObjectInputStream(connection.getInputStream()); //cree lobj input pour recevoir le msg 
			String ch = (String) is.readObject();//lire le msg 
			
			System.out.println("Reception au niveau de client de :"+ch); // afficher le msg 
			
			//pour envoyé au client des reponse
			//ObjectOutputStream os =new ObjectOutputStream(connection.getOutputStream());
			//os.writeObject("msg demande");
			s.close(); //os.close(); 
			is.close();
			
		}
		catch(Exception e){System.out.println("Exception dans le server"+e.toString());}

	}

}
