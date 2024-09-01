import java.util.Scanner;
public class Bankacc {
    static int a=wel();
    static String pas="2276";
    static int balance=1000;
    static String name="venkatesh";
    static String phonenumber="6302824848";
    static String acc="767488081610";
    static int otp=1221;
    static String add="Kadapa";
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your pin: ");
        String pas=sc.nextLine();
        if(pas.equals(Bankacc.pas)){
        while(true){
            System.out.println("1.Check bank balance");
            System.out.println("2.withdraw");
            System.out.println("3.Dposite");
            System.out.println("4.Mobile banking");
            System.out.println("5.UPI transction");
            System.out.println("please select your choice: ");
            int num=sc.nextInt();
            switch(num){
                case 1:{
                    balance();
                    break;
                }
                case 2:{
                   withdraw();
                   break;

                }
                case 3:{
                    deposite();
                    break;
                }
                case 4:{
                    mobilebank();
                    break;
                }
                case 5:{
                  upi();
                  break;
                }
                    
                }
            }
            
        }else{
            System.out.println("Incorrect pin try again");
        }
    }
    public static int wel(){
        System.out.println("Welcome to Atm");
        System.out.println("please insert your atm");
        return 50;
    }
    public static int balance(){
        System.out.println("Available balance is: "+balance);
        System.out.println("Thank you visit our Atm");
        return balance;
    }
    public static int withdraw(){
        System.out.println("Enter amount please: ");
        Scanner w=new Scanner(System.in);
        int with=w.nextInt();
        if(balance>=with){
            balance=balance-with;
            System.out.println("withdraw successful");
            
        }else{
            System.out.println("Insuffiecient balance");
        }
        return balance;
        
    }
    public static int deposite(){
        Scanner d=new Scanner(System.in);
        System.out.println("Enter amount please: ");
        int dep=d.nextInt();
        if(dep<=100000){
            balance=balance+dep;
            System.out.println("Successfully deposited");
        }
        return dep;
    }
    public static void mobilebank(){
        Scanner m=new Scanner(System.in);
        
        System.out.println("1.ministatement");
        System.out.println("2.account details");
        System.out.println("3.Mobile number change");
        int n=m.nextInt();
        switch(n){
            case 1:{
                ministatement();
                break;
          }
          case 2:{
            accdet();
            break;

          }
          case 3:{
            pin();
            break;
          }
        }
    }
    public static void ministatement(){
        System.out.println("account Holder name: "+name);
        System.out.println("Account number is : "+acc);
        System.out.println("Available balance is: "+balance);
    }
    public static void accdet(){
        System.out.println("Account number is: "+acc);
        System.out.println("Account Holder name: "+name);
        System.out.println("Phone number is : "+phonenumber);
        System.out.println("Address is: "+add);
    }
    public static void pin(){
        Scanner mn=new Scanner(System.in);
        System.out.println("Enter your old mobile number: ");
        String pn=mn.nextLine();
        if(pn.equals(Bankacc.phonenumber)){
            System.out.println("Enter OTP please: ");
            int otp=mn.nextInt();
            if(otp==1221){
                System.out.println("Enter new mobile number: ");
                Scanner sc=new Scanner(System.in);
                Bankacc.phonenumber=sc.nextLine();
                System.out.println("successful updated");
            }
        }else{
            System.out.println(" Enter valid number");
        }

    }
    public static void upi(){
        System.out.println("Enter upi number");
        Scanner up=new Scanner(System.in);
        String number=up.nextLine();
        System.out.println("Enter amount please: ");
        int amount=up.nextInt();
        if(amount<=Bankacc.balance){
            balance=balance-amount;
            System.out.println("Transction successful");
        }else{
            System.out.println("Insufficient balance");
        }
    }
        
    }

