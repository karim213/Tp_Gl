
package exo1;

public class Emprunter {
    public Client client;
    public Livre livre;
    
    Emprunter(Client c , Livre l){
        this.client = c;
        this.livre = l ;
    } 

    public void setClient(Client client) {
        this.client = client;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public Client getClient() {
        return client;
    }

    public Livre getLivre() {
        return livre;
    }
    
}
