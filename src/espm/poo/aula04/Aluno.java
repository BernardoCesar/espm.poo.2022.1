package espm.poo.aula04;

import java.util.Arrays;

public class Aluno{

        String nome=null;
        
        Integer ra=null;//Long é classe e assim permite nulo

        public Aluno(Integer ra,String nome){
            this.ra=ra;
            this.nome=nome;

        }

        @Override //reescreve método pai pro método filho
        public String toString() {
        // TODO Auto-generated method stub
        //return super.toString();
        return "{ra:"+ra+ " nome: "+nome+"}";
        }

        public double media(double... notas){
            double soma=0;
            
            for(double n:notas){
                soma+=n;
            }
           double media=soma/notas.length;
           return Arrays.stream(notas).average().getAsDouble();

        }

        @Override
        public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return obj!=null 
        && obj instanceof Aluno 
        && ra.equals(((Aluno) obj).ra);
        }

        @Override
        public int hashCode() {
        // TODO Auto-generated method stub
        return ra.hashCode();
        }
        
}
