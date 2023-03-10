package grafi;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Lella
 */
public class Grafi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Input: Lista degli archi
	List<Arco> a = Arrays.asList(
                new Arco(0, 1),
                new Arco(1, 2),
                new Arco(2, 0)
        );

	// costruzione di un grafo da una lista di archi
	GrafoNO gno = new GrafoNO(a);
        
        List<Arco> b = Arrays.asList(
                new Arco(0, 1), new Arco(0, 2),
                new Arco(1, 2),
                new Arco(2, 0), new Arco(2, 1)
        );
        Grafo go = new Grafo(b);
        
	// stampa delle adiacenze
	GrafoNO.stampaGrafo(gno);
        Grafo.stampaGrafo(go);
    }
    
}
