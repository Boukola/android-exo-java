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
        t.calcul_Perimètre(3,5);
        t.calcul_Surface(5,4);
        t.affiche();
        
        Carrée C = new Carrée("Rouge",4,4,3);
        C.calcul_Perimètre(4,3);
        C.calcul_Surface(3);
        C.affiche();
	}

}
