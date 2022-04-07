package espm.poo.aula02;

public class Main {

        public static void main(String[] args){
            Pessoa p1= new Pessoa();
            p1.nome="Humberto";
            p1.idade=15;
            p1.salario=800.12;

            Pessoa p2= new Pessoa();
            p2.nome="Sandra";
            p2.idade=22;
            p2.salario=45000;

            Pessoa p3= p1;
            System.out.println(p3.nome);
            p3.nome="Selmini";
            System.out.println(p1.nome);
            

            p1.imprimir();
            p2.imprimir();
            p3.imprimir();

            System.out.println(p1 == p2);
            System.out.println(p1 == p3);

            String nome="Humberto";
            if(nome=="Humberto"){//compara posição de memoria
                System.out.println("Levantar da cama");
            }
            if(nome.equals("Humberto")){//compara conteúdo
                System.out.println("Levantar da cama");
            }
        }
    
}
