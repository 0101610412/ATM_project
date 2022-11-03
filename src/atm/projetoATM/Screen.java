package atm.projetoATM;

public class Screen {
    public void displayMessage( String message ){

        System.out.print( message );

    }// fim do método displayMessage

    public  void displayMessageLine( String message ){

        System.out.println( message );
    }// fim do método displayMessageLine

    // exibe um valor em dólares
    public void displayDollarAmout( double amount ){

        System.out.printf( "$%,.2f", amount);
    }
}
