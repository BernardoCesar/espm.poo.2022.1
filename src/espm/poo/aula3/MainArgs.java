package espm.poo.aula3;

import java.util.Arrays;

public class MainArgs {

    public static void main(String[] args){

        for(String a:args){
            System.out.println(a);
        }
        Arrays.asList(args).forEach(a-> System.out.println(a));
    }
    //Compilando na mão
    //javac espm/poo/aula03/MainArgs.java
    //Executando na mão:
    //java espm.poo.aula03.MainArgs ola mundo
}
