package domotique;


// cette classe permet d'allumer la lumière

public class AllumerLumiere implements Commande{
	private Lumiere lumineux;
	public AllumerLumiere(Lumiere lumineux) {
		this.lumineux=lumineux;
	}
	public void execute() {
		lumineux.jallume();
	}
}
