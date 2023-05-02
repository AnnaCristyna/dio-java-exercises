/** 
 * Bank Account
 * @param clienteName
 * @param agency
 * @param number
 * @param balance
 */
package bankAccount;

public class Account {
    String clienteName;
    String agency;
    Long number;
    Double balance;

    public Account (String clientName, String agency, Long number, Double balance) throws Exception{
        this.clienteName = clientName;
        this.agency = agency;
        this.number = number;
        this.balance = balance;

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", clientName, agency, number, balance);
    }
}