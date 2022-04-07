package espm.poo.ex2;

public class Cliente {
   private String cpf;
   private String nome;

   public void setNome(String nome) {
       this.nome = nome;
   }

   public String getNome(){
       return nome;
   }

   public void setCpf(String cpf) {
       this.cpf = cpf;
   }

   public String getCpf() {
       return cpf;
   }

   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return "{nome: " + nome + " cpf: "+ cpf +"}";
   } 
}
