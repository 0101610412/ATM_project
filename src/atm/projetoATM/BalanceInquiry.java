package atm.projetoATM;
// Representa uma consulta de dados

public class BalanceInquiry extends Transaction {

    public BalanceInquiry( int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase ){

        super( userAccountNumber, atmScreen, atmBankDatabase );
    }// fim do construtor

    // realiza a transação
    @Override
    public void execute() {
        // obtém as referências ao banco de dados e tela do banco
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        // obtém o saldo disponível da conta envolvida
        double availableBalance = bankDatabase.getAvailableBalance( getAccountNumber() );

        // obtém o saldo total da conta envolvida
        double totalBalance = bankDatabase.getTotalBalance( getAccountNumber() );

        // exibe as informações sobre o saldo da tela
        screen.displayMessageLine( "\nBalance information:" );
        screen.displayMessage( " - Available balance: " );
        screen.displayDollarAmout( availableBalance );
        screen.displayMessage( "\n - Total balance: " );
        screen.displayDollarAmout( totalBalance );
        screen.displayMessageLine( "" );
    }// fim do execute
}
