
public class Carr�e extends Forme {
	      public String Couleur;
		  private int  Nbresc�t�s;
		  private int Nbressommets;
		  private int c�t�s;
		  
	public Carr�e(String Couleur, int Nbresc�t�s, int Nbressommets,int c�t�s) {
		     this.c�t�s=c�t�s;
			 this.Couleur=Couleur;
			 this.Nbresc�t�s=Nbresc�t�s;
			 this.Nbressommets=Nbressommets;
	}

	public String getCouleur() {
		return Couleur;
	}

	public void setCouleur(String couleur) {
		Couleur = couleur;
	}

	public int getNbresc�t�s() {
		return Nbresc�t�s;
	}

	public void setNbresc�t�s(int nbresc�t�s) {
		Nbresc�t�s = nbresc�t�s;
	}

	public int getNbressommets() {
		return Nbressommets;
	}

	public void setNbressommets(int nbressommets) {
		Nbressommets = nbressommets;
	}

	public int getC�t�s() {
		return c�t�s;
	}

	public void setC�t�s(int c�t�s) {
		this.c�t�s = c�t�s;
	}

	public double calcul_Perim�tre(int c�t�s ,int nbresc�t�s) {
		double P;
		P = c�t�s * nbresc�t�s;
		System.out.println("Le perim�tre est :" + P + "cm ,");
		System.out.println("");
		return P;
	}
    
	public double calcul_Surface(int c�t�s) {
		double S;
		S = (c�t�s * c�t�s);
		System.out.println("L'aire de la surface est :" + S + "cm2 ,");
		System.out.println("");
		return S;
	}
	
    public void affiche() {
    	String a;
    	a= this.Couleur;
    	System.out.println("Ce carr�e est de couleur " + a + ".");
    	System.out.println("");
    }
}
