
public abstract class Forme {
  public String Couleur;
  private int  Nbrescôtés;
  private int Nbressommets;
  
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
/* 
public void dessiner() {
	System.out.println("Avec un crayon et une règle dessiner une forme géometrique est un jeu");
}
public void observer() {
	System.out.println("Donne tes observations");
}
*/
}
		 
