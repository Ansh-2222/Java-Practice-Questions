import java.util.*;

public class Atm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = 0;  
        int i = 1;
        while (i == 1) {
            System.err.println(
                    " ATM \n Enter 1 to Deposite money \n Enter 2 to withdraw the money \n Enter 3 to  check the balance \n Enter 4 to EXIT \n Choose the operation you want to perform:  ");
            int s = sc.nextInt();
            switch (s) {
                case 1:
                    System.err.print("Enter money to be deposited ");
                    money = sc.nextInt();
                    break;
                case 2:
                    System.err.print("Enter money to be withdrawn ");
                    int m = sc.nextInt();
                    money = money - m;
                    System.out.println("Please collect your money");
                    break;

                case 3:
                    System.err.println(" current Balance is " + money);
                    break;
                case 4:
                    i = 0;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.err.println("Invalid option. Please try again ");
                    break;
            }
        }

        sc.close();
    }

}
