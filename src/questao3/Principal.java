
/*
3) Crie um sistema de reserva de mesa para um restaurante. O atendente pode fazer uma reserva, 
cancelar uma reserva ou alterar uma reserva. O sistema é extremamente simples, 
utilizado localmente apenas por um terminal e sem conexão de rede, 
mas deve ser modelado usando orientação a objetos. 
*/
package questao3;

import java.util.List;
import java.util.Scanner;

public class Principal {
    
    
    int operacao;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Conexao conn = new Conexao();
        conn.openDB();
        conn.fechaDB();
        
        MesaDao dao = new MesaDao();
        
        System.out.println("--------------------------");
        System.out.println("Digite a Opção dejasejada!");
        System.out.println("1 -> Inserir");
        System.out.println("2 -> Atualizar");
        System.out.println("3 -> Listar Todos");
        System.out.println("4 -> Listar Mesa");
        System.out.println("5 -> Deletar Mesa");
        System.out.println("(-99) - Sair");
        System.out.println("---------------------------");
        System.out.println("Opção:");
        
        int op = 99;
        
        while(op > 0) {
                    
        Scanner operacao = new Scanner(System.in);
        op = operacao.nextInt();
        Mesa mesa = new Mesa();
        
        switch (op){
            case 1:
                System.out.println("Digite a Mesa/Comida/Bebida/Valor:");
                
                Scanner Mesa = new Scanner(System.in);
                Scanner Comida = new Scanner(System.in);
                Scanner Bebida = new Scanner(System.in);
                Scanner Valor = new Scanner(System.in);
                
                mesa.setNumero(Mesa.nextInt());
                mesa.setComida(String.valueOf(Comida.next()));
                mesa.setBebida(String.valueOf(Bebida.next()));
                mesa.setValor(Valor.nextDouble());
                dao.InserirMesa(mesa);
                
                System.out.println("Inserido!");
                
                break;
                
            case 2:
           
                System.out.println("----------------------------------");
                System.out.println("Digite a Mesa/Comida/Bebida/Valor:");
                Scanner MesaU = new Scanner(System.in);
                Scanner ComidaU = new Scanner(System.in);
                Scanner BebidaU = new Scanner(System.in);
                Scanner ValorU = new Scanner(System.in);
                System.out.println("-----------------------------------");
                
                //atualizar pedido
               int novoNumero = MesaU.nextInt();
               String novoBebida = String.valueOf(BebidaU.next());
               String novaComida = String.valueOf(ComidaU.next());
               Double novoValor = ValorU.nextDouble();
               
               dao.atulizaPedido(novoNumero, novaComida, novoBebida, novoValor);
            
               mesa.setNumero(novoNumero);
               Mesa m = dao.retornaMesa(mesa);
               System.out.println(m);
               
                break;
                
            case 3:
                 System.out.println("Listar Mesas");
                 List<Mesa> Mesas= dao.ListarMesas();
                 Mesas.forEach((Res) -> {
                     System.out.println(Res);  
                });
                break;
                
            case 4:        
                System.out.println("---------------------------");
                System.out.println("Digite a Mesa a ser listada!");
                Scanner MesaL = new Scanner(System.in);
                System.out.println("---------------------------");
                
                mesa.setNumero(MesaL.nextInt());
                Mesa m2 = dao.retornaMesa(mesa);
                System.out.println(m2);
                
                break;    
                
            case 5:
                System.out.println("---------------------------");
                System.out.println("Digite a Mesa a ser Deletada!");
                Scanner MesaD = new Scanner(System.in);
                System.out.println("---------------------------");
                int NumeroD = MesaD.nextInt();
                dao.deletaPedido(NumeroD);   
                break;     
            default:
                System.out.println("Essa não é uma opção válida!");    
                
        }    
    }    
        

        
   
            
                    
        
        
        
        

        

        
        
       //update where 
       // mesa.setNumero(99);
       // Mesa m = conn.retornaMesa(mesa);
       // System.out.println(m);

       
       
        //atualizar pedido
        //int novoNumero = 10;
        //String novoBebida = "Pepsi";
        //Double novoValor = 3.5;
        //conn.atulizaPedido(novoNumero, novoBebida, novoValor);
        //mesa.setNumero(10);
        //Mesa m = conn.retornaMesa(mesa);
        //System.out.println(m);
        
    
        
        /*
        deletar pedido
        int novoNumero = 10;
        String novoBebida = "Pepsi";
        Double novoValor = 3.5;
        conn.deletaPedido(novoNumero, novoBebida, novoValor);
        mesa.setNumero(10);
        Mesa m = conn.retornaMesa(mesa);
        System.out.println(m);
        
        */
        
        
        
        

    }
}
