/*
4) Como trocar o valor de duas variáveis numéricas sem criar uma terceira variável?
 */
package questao4;

/**
 *
 * @author d
 */
public class TrocarValor {
    
    public static void main(String[] args)
    {   
        int a = 66;
        int b = 10;
        
        System.out.println("A-Antes:"+a);
        System.out.println("B-Antes:"+b);
        
        b = b + a;
        a = b - a;
        b = a - b;
        
        if (a < 0)
          a *= -1;
        
        if (b < 0)  
            b *= -1;
        
        System.out.println("A-Depois:"+a);
        System.out.println("B-Depois:"+b);
    }
    
}
