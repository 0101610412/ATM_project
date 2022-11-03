package atm.projetoATM;

import java.util.Scanner; // o programa utiliza Scanner para a entrada de usuário
public class Keypad {

    private Scanner input; // lê os dados na linha de comando

    public Keypad(){

        input = new Scanner( System.in );
    }
    // retorna um valor inteiro inserido pelo usuário
    public int getInput(){

        return input.nextInt();
    }
}
