package domotique;

//cette classe permet d'eteindre la lumière

public class EteindreLumiere implements Commande{
	private Lumiere sombre;
	public EteindreLumiere(Lumiere sombre) {
		this.sombre=sombre;
	}
	public void execute() {
		sombre.jeteins();
	}
}
