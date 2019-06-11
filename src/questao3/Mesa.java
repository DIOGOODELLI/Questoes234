/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author d
 */
public class Mesa {
    
   private int numero;
   private String bebida;
   private Double valor;

    @Override
    public String toString() {
        return "Mesa{" + "numero=" + numero + ", bebida=" + bebida + ", valor=" + valor + '}';
    }
    
    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
 
}
