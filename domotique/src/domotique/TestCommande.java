package domotique;

public class TestCommande {
	public static void main (String[] args) {
		Lumiere ampoule = new Lumiere();
		Commande lum = new  AllumerLumiere(ampoule);
		Commande somb  =new EteindreLumiere(ampoule);
		Interrupteur s = new Interrupteur(lum,somb);
		s.allumer();
		s.eteindre();
	}
}
