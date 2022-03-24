//package scalaratm;
import java.text.DecimalFormat;
import java.util.*;
import java.io.IOException;

public class MainMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00"); //defining format of money to be displayed
    
    HashMap<Integer , Integer> data = new HashMap<Integer , Integer>();

    public void getLogin() throws IOException{
        int x =1;
        do {
            try{
                data.put(987678, 990089);  //customerno, pin no
                data.put(887569, 682276);
                data.put(923365, 744563);
                data.put(989076, 324356);

                System.out.println("welcome to SBI ATM");
                System.out.println("Enter you customer number");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter your PIN Number");
                setPinNumber(menuInput.nextInt());
            }
            catch(Exception e){
                System.out.println("\n"+"Invalid character(s). Only Numbers"+"\n");
                x=2;
            }
            int cn = getCustomerNumber();
            int pn = getPinNumber();
           /* if(data.containskey(cn) && data.get(cn) == pn){
                getAccountType();
            }
            else{
                System.out.println("\n" + "Wrong Customer Number or Pin number"+ "\n");
            }*/
            getAccountType();
        } while (x == 1);
    }

    public void getAccountType(){
        System.out.println("select the Account you want to access : ");
        System.out.println("Press 1 - current Account");
        System.out.println("Press 2 - savings Account");
        System.out.println("Press 3 - Exit");
        int selection = menuInput.nextInt();

        switch(selection){
            case 1:
                getCurrent();
                break;
            case 2:
                getSaving();
                break;
            case 3:
               System.out.println("Thank you for using this ATM. \n\n");
                break;
            default:
               System.err.println("\n" + "Invalid Choice." + "\n");
               getAccountType();
        }
    }

    public void getCurrent(){
        System.out.println("Current Account : ");
        System.out.println("Press 1 - view Balance");
        System.out.println("Press 2 - withdraw Funds");
        System.out.println("Press 3 - Deposit Funds");
        System.out.println("Press 4 - Exit");
        System.out.println("choice: ");
        
        int selection = menuInput.nextInt();
        switch(selection){
            case 1:
                System.out.println("current Account Balance: " + moneyFormat.format(getCurrentBalance()));
                getAccountType();
                break;
            case 2:
                getCurrentWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCurrentDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using this ATM.");
                break;
            default:
                System.err.println("\n" + "Invalid Choice." + "\n");

        }
    }

    
    public void getSaving(){
        System.out.println("Saving Account : ");
        System.out.println("Press 1 - view Balance");
        System.out.println("Press 2 - withdraw Funds");
        System.out.println("Press 3 - Deposit Funds");
        System.out.println("Press 4 - Exit");
        System.out.println("choice: ");
        
        int selection = menuInput.nextInt();
        switch(selection){
            case 1:
                System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getsavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using this ATM.");
                break;
            default:
                System.err.println("\n" + "Invalid Choice." + "\n");

        }
    }



}
