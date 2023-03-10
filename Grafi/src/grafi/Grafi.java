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
        
        List<Arco> b = Arrays.asList(
                new Arco(0, 1), new Arco(0, 2),
                new Arco(1, 2),
                new Arco(2, 0), new Arco(2, 1)
        );
        Grafo go = new Grafo(b);
        
	// stampa delle adiacenze
        Grafo.stampaGrafo(go);
        
        // esegui test e stampa de nuevo
        System.out.println("\n");
        go.addNodo(3);
        go.addArco(2, 3);
        go.addArco(3, 0);
        Grafo.stampaGrafo(go);
        
    }
    
}
