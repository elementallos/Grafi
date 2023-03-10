package grafi;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Lella
 */
public class Grafo {
    // La lista di adiacenza è rappresentata da una lista di liste
    List<List<Integer>> adjList = new ArrayList<>();

    // Costruttore
    public Grafo(List<Arco> archi){
        // trovo il vertice con etichetta max
        int n = 0;
        for (Arco a: archi) {
            n = Integer.max(n, Integer.max(a.src, a.dest));
        }

        // Alloca la memoria per la lista di adiacenza
        for (int i = 0; i <= n; i++) {
            adjList.add(i, new ArrayList<>());
        }

        // aggiunge nodi al grafo orientato
        for (Arco current: archi){
            // alloca il nuovo arco nella lista di adiacenza da src a dest
            adjList.get(current.src).add(current.dest);


        }
    }
    // Stampa della lista di adiacenza
    public static void stampaGrafo(Grafo grafo){
        int src = 0;
        int n = grafo.adjList.size();

        System.out.print("\nGrafo orientato\n");
        while (src < n){
            // stampa un vertice e tutti i suoi vicini
            for (int dest: grafo.adjList.get(src)) {
                System.out.print("(" + src + " --> " + dest + ")\t");
            }
            System.out.println();
            src++;
        }
    }
}