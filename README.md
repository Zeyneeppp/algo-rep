# algo-rep
## Type de connexion
**1. Mode connecté TCP**

**2. Mode Deconnecté UDP**

### Porogramm client 
Demande de cnx : 

Cree un obj de type socket c=new socket.

acceptation de la demande par le serveur 

cree un flux de sortie// ObjectOutputStream out = new ObjectOutputStream(c.getOutputStream());

send le msg: out.writeObject(le msg qu'on veut envoyé);

fermeture de la cnx.;


### Porogramm server 

cree obj s de type socket SERVER/ s= new server socket

met le serveur en attente

accepter la demande Socket cnx = s.accept();

creat an obj input pour etablir la cnx

creat ch new obj

recuperer la chaine (de msg)pour etalir la cnx 


try {  }
catch (exeption e) {  sys.out.println("exception de p1" +e.tostring()§§ interprettion de lexecution /by zero }

### COMMUNICATION 
Les socket coté client  socket c = new socket("localhost",num de port 2004); demande de connextion sexecute sur le port 2004
Les socket coté serveur serveursocket s = new serversocket(2004); //attaché la cnx au port 2004

socket cnx = s.accept() //accepté la dem de cnx dans le prog serveur p2 return un obj de type socket 

//methode bloquante psq sil elle ne recoit pas une dem de cnx elle reste bloqué 

P1 envoi et recp de msg
client envoyer un msg RSD vers P2
Flux f'information en sorti
ObjectOutputStream out = new ObjectOutputStream(c.getOutput);


P2 recoit le msg
Flux f'information en entréé
accusé d reception 

### fermeture des connexion
c.close ; out.close();
