//Pooja would like to withdraw X $US from an ATM. The cash machine will
// only accept the transaction if X is a multiple of 5, and
// Pooja's account balance has enough cash to perform the withdrawal
// transaction (including bank charges). For each successful withdrawal
// the bank charges 0.50 $US. Calculate Pooja's account balance after
// an attempted transaction.

class Atm {
    public static void main(String[] args)
    {
        float bal=120,with=1300;
        System.out.println(" amount pooja has "+bal);
        System.out.println(" amount pooja wants to withdraw "+with);
        if (with%5==0 && with>0 && with<bal)
        {
            bal = (float) (bal - with - 0.5);
            System.out.println(" Your new balance is " + bal);
        }
            System.out.println(" Your balance is  "+bal);
    }
}