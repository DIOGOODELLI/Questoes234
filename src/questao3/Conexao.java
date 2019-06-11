/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;

/**
 * Criando o DB usando a db4o
 * @author d
 */

public class Conexao {
    
    public ObjectContainer conn = null;
    
    public void openDB(){
        conn = Db4o.openFile("restaurante");
    }
    
    public void fechaDB(){
        conn.close();
    }    
   
}
