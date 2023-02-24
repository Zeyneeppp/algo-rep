import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("demande de connexion....");
			Socket c = new Socket("localhost",2004); // demande de connexion
			System.out.println("ma cnx a ete accepté");
			
			
			//le msg qu'on veut envoyé au serveur
			ObjectOutputStream out = new ObjectOutputStream(c.getOutputStream()); // cree lobj output
			out.writeObject("RSD"); //ecrire le msg
			
			// si on recoit la rep du serveur on fait la meme chose pour l INPUT 
			//ObjectInputStream is= new ObjectInputStream(c.getInputStream()); //cree lobj input pour recevoir le msg 
			//String ch = (String) is.readObject();//lire le msg 
			
			//System.out.println("Reception au niveau de client de :"+ch); 
			c.close();out.close();
			
		}
		catch(Exception e){System.out.println("Exception dans le client"+e.toString());}
	}

}
