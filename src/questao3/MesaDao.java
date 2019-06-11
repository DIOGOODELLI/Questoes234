/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import com.db4o.ObjectSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author d
 */
public class MesaDao {
    
    Conexao conex = new Conexao();
    
    public void InserirMesa(Mesa m) {
       conex.openDB();
       conex.conn.set(m);  
       conex.fechaDB();
    }  
    
    
    //select * from mesas
    public List<Mesa>ListarMesas() {
        conex.openDB();
        ObjectSet Mesas = conex.conn.query(Mesa.class);
        List<Mesa> M = new ArrayList<>();
        
        Mesas.forEach((Res) -> {
            M.add((Mesa)Res);
        });
        conex.fechaDB();
        return M;
    }
    
    
    //select * from mesa where mesa = ?
    public Mesa retornaMesa(Mesa m) {
        conex.openDB();
        ObjectSet ret = conex.conn.get(m);
        Mesa mesa = (Mesa) ret.next();
        conex.fechaDB();   
        return mesa;
    }
    
    
 
    //update mesa set 
    public void atulizaPedido(int numero,String comida, String bebida, Double valor) {
        conex.openDB();
        Mesa mesa = new Mesa();
        mesa.setNumero(numero);
        ObjectSet ret = conex.conn.get(mesa);
        Mesa novaMesa = (Mesa) ret.next();
        novaMesa.setComida(comida);
        novaMesa.setBebida(bebida);
        novaMesa.setNumero(numero);
        novaMesa.setValor(valor);
        conex.conn.set(novaMesa);
        conex.fechaDB();
    }        
    
    
    
    public void deletaPedido(int numero)
    {
        conex.openDB();
        Mesa mesa = new Mesa();
        mesa.setNumero(numero);
        ObjectSet ret = conex.conn.get(mesa);
        Mesa mesaDel = (Mesa) ret.next();
        conex.conn.delete(mesaDel);
        conex.fechaDB();
    }
    
}
