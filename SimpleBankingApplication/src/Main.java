import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bank1=new BankAccount();
        bank1.mainScreen();
    }
}
class BankAccount{
    Scanner scan=new Scanner(System.in);
        int balance;
        void deposit(){
            System.out.println("Enter amount to deposit: ");
            int deposit_amount=scan.nextInt();
            if( deposit_amount>0){
                balance=balance+deposit_amount;
                System.out.println("Deposited Amount: "+ deposit_amount);
                System.out.println("Available Balance: "+balance);
                System.out.println();
            }
            else {
                System.out.println("Invalid Amount");

            }
        }
        void withdraw() {
            System.out.println("Enter amount to withdraw:");
            int withdraw_amount=scan.nextInt();
            if(withdraw_amount!=0&& withdraw_amount<=balance){
                balance=balance-withdraw_amount;
                System.out.println("Withdrawn Amount: "+ withdraw_amount);
                System.out.println("Available Balance: "+balance);
                System.out.println();
            }
            else {
                System.out.println("No Available Balance");
            }

        }
        void mainScreen(){
            int option;
            do {
                System.out.println("Welcome to the bank");
                System.out.println();
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4.Exit");
                System.out.println();
                System.out.println("Enter an option: ");
                option = scan.nextInt();

                switch (option) {
                    case 1:
                        System.out.println();
                        System.out.println("Available Balance:" + balance);
                        System.out.println();

                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        withdraw();
                        break;
                    case 4:
                        System.out.println("Thank you for banking with us");
                        break;
                    default:
                        System.out.println("Invalid Option");
                        break;

                }
            }while (option!=4);



        }


}