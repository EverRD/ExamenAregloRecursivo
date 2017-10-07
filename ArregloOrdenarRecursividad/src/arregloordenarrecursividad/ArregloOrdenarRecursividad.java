/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloordenarrecursividad;

/**
 *
 * @author GATEWAY
 */
public class ArregloOrdenarRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int tam,a1;




       int arreglo[] = {5,6,7,1000,-78,65,100};

        for (int a = 0; a < arreglo.length ; a++) {
            for (int b = 0; b < arreglo.length; b++) {
                if (arreglo[a] < arreglo[b]) {
                    a1 = arreglo[a];
                    arreglo[a] = arreglo[b];
                    arreglo[b] = a1;
                }
            }
        }

        for (int a = 0; a< arreglo.length; a++) {
            System.out.print(arreglo[a] + " ");
        }

    }
    
}
