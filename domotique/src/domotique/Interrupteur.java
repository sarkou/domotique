package domotique;
// cette classe peut etre utilisé pour la TV, par detecteur fumee etc
public class Interrupteur {
	private Commande eclairage;
	private Commande obscurite;
	
	
	public Interrupteur (Commande eclairage,Commande obscurite) {
		this.eclairage=eclairage;
		this.obscurite=obscurite;
	}
	public void allumer() {
		eclairage.execute();
	}
    public void eteindre() {
		obscurite.execute();
	}
    
}
