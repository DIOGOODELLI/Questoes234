/*
2) Dadas duas listas ordenadas A e B, onde A é suficientemente grande para armazenar 
o conteúdo de A e B, escreva uma função para copiar o conteúdo de B para A de forma ordenada.

A = {1,3,5,7}
B = {2,4,6}
A + B = {1,2,3,4,5,6,7}
 */
package questao2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author d
 */
public class Lista {
    
    public static void main(String[] args) {
        /*
        FORMA USANDO OS RECURSOS DO JAVA :D
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        A.add(1);
        A.add(3);
        A.add(5);
        A.add(7);
        
        B.add(2);
        B.add(4);
        B.add(6);
        A.addAll(B);
        Collections.sort(A);
        //System.out.println("Forma Simples:" +A);
        */


        /*Ordenando - Acredito que assim esse era o pedido do exercicio*/
         int[] Lista1 = new int[7];
         int[] Lista2 = new int[3];
         
         Lista1[0] = 1;
         Lista1[1] = 3;
         Lista1[2] = 5;
         Lista1[3] = 7;
         Lista1[4] = 0;   
         Lista1[5] = 0;    
         Lista1[6] = 0;   
         
         Lista2[0] = 2;
         Lista2[1] = 4;
         Lista2[2] = 6;
         
         System.out.println("Lista A Antes:"+ Arrays.toString(Lista1));
         System.out.println("Lista B:"+ Arrays.toString(Lista2));
         
         //Pegamos cada elemento da lista e chamamos a metodo que insere ordenando
         for (int i = 0; i < Lista2.length; i++) {
             Lista1 = inserirOrdenado(Lista1, Lista2[i]);
         }
         System.out.println("Depois Juntando:"+ Arrays.toString(Lista1));    
    }
    
    
    public static int[] inserirOrdenado(int[] Lista1, int numero) {
        
        //passamos a lista como parametro e retornamos para sobreescrever a lista não ordeanada
        //percorremos a lista do final para o começo
        for (int i = Lista1.length - 1 ;  i >= 0 ; i--) {
            
            if (Lista1.length - 1 == i && numero > Lista1[i]) {
                //aqui seria o última elemento do array não tem um do lado
                Lista1[i] = numero;
            }  
            else {
                if (numero <  Lista1[i] || Lista1[i] == 0)
                {
                    //se o numero do parametro for menor que o do indecie ele assume a posição, isso até o final do laço
                    int auxValor = Lista1[i];
                    Lista1[i] = numero;
                    Lista1[i + 1] =  auxValor;
                } 
            }
        }
        return Lista1;
    }
}
