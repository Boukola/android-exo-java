
public class Triangulaire extends Forme{
	      public String Couleur;
		  private int  Nbrescôtés;
		  private int Nbressommets;
		  private int côtés;
		  private int hauteur;
		  
	public Triangulaire(String Couleur, int Nbrescôtés, int Nbressommets,int Nbresbases,
	  int hauteur) {
			 this.hauteur=hauteur;
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

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
 
	public double calcul_Perimètre(int côtés,int Nbrescôtés) {
		double P;
		P = côtés * Nbrescôtés;
		System.out.println("Le perimètre est :" + P + "cm ,");
		System.out.println("");
		return P;
	}
	
	public double calcul_Surface(int côtés ,int hauteur) {
		double S;
		S = (côtés * hauteur)/2;
		System.out.println("L' aire de la surface est :" + S + "cm2 ,");
		System.out.println("");
		return S;
	}
	
	public void affiche() {
    	String a;
    	a= this.Couleur;
    	System.out.println("Ce triangle est de couleur " + a + ".");
    	System.out.println("");
    }


	
}