/**
 * 
 */

/**
 * @author ABDOU
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Triangulaire t = new Triangulaire("Jaune",3,3,5,4);
        t.calcul_Perim�tre(3,5);
        t.calcul_Surface(5,4);
        t.affiche();
        
        Carr�e C = new Carr�e("Rouge",4,4,3);
        C.calcul_Perim�tre(4,3);
        C.calcul_Surface(3);
        C.affiche();
	}

}
