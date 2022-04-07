package espm.poo.ex2Humberto;

import org.omg.PortableInterceptor.ClientRequestInfo;

public class Ex1 {

    public static void main(String[] args) {
        PessoaJuridica pj1 =new PessoaJuridica();
    
        Cliente pj2= new PessoaJuridica();
    
        Banco maryBank= new Banco("Maryane Bank");
        maryBank.addCliente(pj1);
        Cliente pj3= new PessoaFisica();
        Cliente aux;
        

     
    }
    public Cliente Teste(Cliente pj1, Cliente pj2){
        return pj1;
    }


}
