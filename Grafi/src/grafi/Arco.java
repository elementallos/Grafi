package grafi;

/**
 *
 * @author Lella
 */
public class Arco {
    int src, dest, peso;

    Arco(int src, int dest){
	this.src = src;
	this.dest = dest;
        this.peso = 1; // default
    }
    
    Arco(int src, int dest, int peso){
	this.src = src;
	this.dest = dest;
        this.peso = peso;
    }
}