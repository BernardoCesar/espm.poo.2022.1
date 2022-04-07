package espm.poo.ex2;

import java.util.Scanner;

public class Main {

        private static Banco banco=null;

        public static void main(String[] args) {

            banco=new Banco("ESPM BANK");

            Scanner scan= new Scanner(System.in);
            boolean exit=false;
            while(!exit){
                System.out.print("ESPM> ");
                String input=scan.nextLine().trim().toLowerCase();
            
                //System.out.println(input);


                if("".equals(input)){
                }else if ("exit".equals(input)){
                    exit=true;

                }else if("help".equals(input)){
                
                    help();

                }else if("list".equals(input)){

                    listCustomer(banco);
                
                }else  if("add".equals(input)){

                    addCustomer(banco);
                    
                }else{
                    System.err.println("Comando inválido");
                }
               
            }
            System.out.println("Bye Bye!");
            scan.close();
        }

        private static void help(){
            System.out.println("ESPM Sistema de clientes");
            System.out.println("------------------------");
           
            System.out.println("add-> Cadastrar Clientes");
            System.out.println("list-> Listar Clientes");
            System.err.println("del-> Apagar Cliente");
            System.out.println("find-> Localiza Cliente");
            System.out.println();
            System.out.println("exit-> Sair do Sistema");

        }

        private static void listCustomer(Banco banco){
            
            banco.getClientes().forEach(c -> System.out.println(c.toString()));
          
            }
        
        private static void addCustomer(Banco banco){
           Scanner scan = new Scanner(System.in);
           System.out.print("Nome: ");
           String nome=scan.nextLine();
           System.out.print("CPF: ");
           String cpf=scan.nextLine();
           
            Cliente c = new Cliente();
            c.setCpf(cpf);
            c.setNome(nome);

            banco.addCliente(c);

        }

        }
    

