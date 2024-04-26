import java.util.*;
 class ATM{
    float Balance;
    int PIN = 1379;

    public void checkpin(){
        System.out.println("Please Enter Your PIN: ");
        Scanner sc = new Scanner(System.in);
        try{
        int enteredpin = sc.nextInt();
        if(enteredpin == PIN){
            menu();
        }
        else{
            System.out.println("Enter valid Pin");
            checkpin();
        }}finally{
            sc.close();
        }
    
       
    }
    public void menu(){
        System.out.println("PLEASE CHOOSE ONE TO PERFORM!");
        System.out.println("1. CHECK BALANCE");
        System.out.println("2. WITHDRAW BALANCE");
        System.out.println("3. DEPOSIT BALANCE");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        try{
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2){
            withdraMoney();
        }
        else if(opt == 3){
            depositMoney();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("PLEASE SELECT VALID OPTION");
        }}finally{
            sc.close();
        }
    }
    public void checkBalance(){
        System.out.println("BALANCE: " + Balance);
        menu();
    }
    public void withdraMoney(){
        System.out.println("ENTER MONEY TO WITHDRAW: ");
        Scanner sc = new Scanner(System.in);
        try{
        float amount = sc.nextFloat();
        if(amount > Balance){
            System.out.println("Insufficent Money!");
        }
        else{
            Balance = Balance - amount;
            System.out.println("MONEY WITHDRAW SUCCESSFULLY!");
            menu();
        }
        }
        finally{
            sc.close();
        }
    }
    public void depositMoney(){
        System.out.println("PLEASE ENTER AMOUNT TO DEPOSIT: ");
        Scanner sc = new Scanner(System.in);
        try{
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("MONEY DEPOSIT SUCCESSFULLY!");
        menu();
        }
        finally{
            sc.close();
        }
    }
    
}
public class ATMMachine extends ATM{
    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine();
        atm.checkpin();
    }
}