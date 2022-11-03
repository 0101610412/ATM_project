package atm.projetoATM;
// Representa uma conta bancária

public class Account {

    private int accountNumber;
    private int pin;
    private double availableBalance; // fundos disponíveis para saque
    private double totalBalance; // fundos disponíveis

    public Account( int theAccountNumber, int thePIN, double theAvailableBalance, double theTotalBalance ){

        accountNumber = theAccountNumber;
        pin = thePIN;
        availableBalance = theAvailableBalance;
        totalBalance = theTotalBalance;
    }

    // valida pin
    public boolean validadePIN( int userPIN ){

        if( userPIN == pin ){
            return true;
        }
        else {
            return false;
        }
    }

    // retorna o saldo disponível
    public double getAvailableBalance(){

        return availableBalance;
    }

    // retorna o saldo total
    public double getTotalBalance(){

        return totalBalance;
    }

    // credita uma quantia à conta
    public void credit( double amount ){

        totalBalance += amount; // adiciona ao saldo total
    }

    // debita uma quantia
    public void debit( double amount ){

        availableBalance -= amount; // subtrai do saldo disponível
        totalBalance -= amount; // subtrai do saldo total
    }

    // retorna o número da conta
    public int getAccountNumber(){

        return accountNumber;
    }
}

