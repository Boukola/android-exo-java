
public class Carrée extends Forme {
	      public String Couleur;
		  private int  Nbrescôtés;
		  private int Nbressommets;
		  private int côtés;
		  
	public Carrée(String Couleur, int Nbrescôtés, int Nbressommets,int côtés) {
		     this.côtés=côtés;
			 this.Couleur=Couleur;
			 this.Nbrescôtés=Nbrescôtés;
			 this.Nbressommets=Nbressommets;
	}

	public String getCouleur() {
		return Couleur;
	}

	public void setCouleur(String couleur) {
		Couleur = couleur;
	}

	public int getNbrescôtés() {
		return Nbrescôtés;
	}

	public void setNbrescôtés(int nbrescôtés) {
		Nbrescôtés = nbrescôtés;
	}

	public int getNbressommets() {
		return Nbressommets;
	}

	public void setNbressommets(int nbressommets) {
		Nbressommets = nbressommets;
	}

	public int getCôtés() {
		return côtés;
	}

	public void setCôtés(int côtés) {
		this.côtés = côtés;
	}

	public double calcul_Perimètre(int côtés ,int nbrescôtés) {
		double P;
		P = côtés * nbrescôtés;
		System.out.println("Le perimètre est :" + P + "cm ,");
		System.out.println("");
		return P;
	}
    
	public double calcul_Surface(int côtés) {
		double S;
		S = (côtés * côtés);
		System.out.println("L'aire de la surface est :" + S + "cm2 ,");
		System.out.println("");
		return S;
	}
	
    public void affiche() {
    	String a;
    	a= this.Couleur;
    	System.out.println("Ce carrée est de couleur " + a + ".");
    	System.out.println("");
    }
}
