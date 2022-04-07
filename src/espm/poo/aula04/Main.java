package espm.poo.aula04;


public class Main {
    public static void main(String[]args){
            Aluno a1=new Aluno(10,"Seumini");
            System.out.println(a1);
            //to.String imprime as informações+espaço de memoria
            
            Aluno a2=new Aluno(10,"Céumini");
            System.out.println(a2);
    
            //Aluno.tostring n funfa desse jeito pq só funciona com objeto pq n é static

            if(a1==a2){
                System.out.println("iguais");;
            }else{
                System.out.println("n são iguais");
            }
           
            if(a1.equals(a2)){
                System.out.println("iguais");;
            }else{
                System.out.println("n são iguais");
            }

        }
    
}
