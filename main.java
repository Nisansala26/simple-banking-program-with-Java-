import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        // JAA BANKING PROGRAM FOR BEGINNER

        //declare ariables


        double balance = 0;
        boolean isRunning = true;
        int  choice;

      while(isRunning){
          //display menu
          System.out.println("****************");
          System.out.println("BANKING PROGRAM");
          System.out.println("****************");
          System.out.println("1.Show balance");
          System.out.println("2.Deposit");
          System.out.println("3.Withdraw");
          System.out.println("4.Exit");
          System.out.println("****************");

          // GET and Process user choice

          System.out.println("Enter your choice (1-4)");
          choice = sc.nextInt();
          switch (choice){
              //show balance
              case 1 : showBalance(balance);
              break;
              case 2 :balance = balance + deposit();
              break;
              case 3 :balance= balance- withdraw(balance);
              break;
              case 4 : isRunning = false;
              break;
              default:System.out.println("Invalid choice");
          }
      }
        System.out.println("*****************");
        System.out.println("Thank you nice day");
        System.out.println("******************");
      sc.close();
    }
    static void showBalance(double balance){
        System.out.printf("$%.2f\n" , balance);
    }
    static double deposit(){
        double amount ;
        System.out.print("Enter amount to deposit");
        amount = sc.nextDouble();
        if(amount < 0 ){
            System.out.println("Invalid amount");
            return 0;
        }else {

            System.out.println("done");
            return amount;
        }
    }
    static double withdraw(double balance){
        double amount ;

        System.out.println("Enter amount to withdraw");
        amount = sc.nextDouble();
        if(balance < amount ){
            System.out.println("Not enough balance");
            return 0;
        } else if (amount<0) {
            System.out.println("Invalid amount cannot be negative");
            return 0; // need to return  something at least 0

        } else {
            System.out.println("done");
            return amount;
        }
    }
}
