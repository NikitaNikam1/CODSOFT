import java.util.Scanner;
class CustomerBank {
    String customerName;
    int customerAge;
    int accountid;
    String accountType;
    double balance = 0;
    Scanner sc = new Scanner(System.in);

    void createAccount() {
        System.out.println("Enter the Name:");
        customerName = sc.nextLine();
        System.out.println("Enter the account type:");
        accountType = sc.nextLine();
        System.out.println("Enter the accountid:");
        accountid = sc.nextInt();
        System.out.println("Enter the Balance:");
        balance = sc.nextDouble();
        System.out.println("Enter the Age:");
        customerAge = sc.nextInt();
        if (customerAge < 18) {
            do {
                System.out.println("Minimum Age should be 18 to create account. \nPlease enter valid age:");
                customerAge = sc.nextInt();

            } while (customerAge < 18);
            System.out.println("Account is created successfully!!!");
        }


    }

    void displayAccountInformation() {
        System.out.println("WELCOME\n" + customerName + "  \n following are your Account details:");
        System.out.println("Age:" + customerAge);
        System.out.println("Account Id :" + accountid);
        System.out.println("Account Type:" + accountType);
        System.out.println("Balance:" + balance);
        System.out.println("");
    }

    void depositAmount() {
        double deposit;
        System.out.println("Enter money to be Deposited:");
        deposit = sc.nextDouble();
        balance = balance + deposit;
        System.out.println("Your Money has been Successfully deposited!!");
        System.out.println("Your total Balance is :"+ balance);
    }

    void withdrawAmount() {
        double withdraw;

        System.out.println("Enter the Amount you want to withdraw :");
        withdraw = sc.nextDouble();

        if (balance <= withdraw) {
            System.out.println("Insufficient Balance");
            System.out.println("Transaction Decline !!");
            System.out.println("============================================================");

        } else {
            balance = balance - withdraw;
            System.out.println("Remaining balace in the Account :" + balance);
            System.out.println("============================================================");
        }
    }

    void totalBalance() {
        System.out.println("Total balance :" + balance);
    }
}
public class Task3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        CustomerBank b = new CustomerBank();
        do {
            System.out.println("1.Create Account");
            System.out.println("2.Display Account Information");
            System.out.println("3.Check Balance");
            System.out.println("4.Deposit Amount");
            System.out.println("5.Withdraw Amount");
            System.out.println("6.Exit");
            System.out.println("==============================================");
            System.out.println("Enter your choice:");
            int choice = a.nextInt();
            switch (choice) {
                case 1:
                    b.createAccount();
                    System.out.println("---------------------------------------");
                    break;
                case 2:
                    b.displayAccountInformation();
                    System.out.println("---------------------------------------");
                    break;
                case 3:
                    b.totalBalance();
                    System.out.println("---------------------------------------");
                    break;
                case 4:
                    b.depositAmount();
                    System.out.println("---------------------------------------");
                    break;
                case 5:
                    b.withdrawAmount();
                    System.out.println("---------------------------------------");
                    break;
                case 6:
                    System.out.println("---------------------------------------");
                    return;
                default:
                    System.out.println("INVALID INPUT !!!");
                    System.out.println("============================================");
                    break;
            }
        } while (true);
    }
}


