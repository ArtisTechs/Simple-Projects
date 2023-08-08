package groupproject;
//Group of EJ Suarez, Niel Gorobat, & Jayvee Bautista
import java.util.Scanner;
public class GroupProject {

    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n[Menu]");
        System.out.println("[1] Create New Account ");
        System.out.println("[2] Load ");
        System.out.println("[3] E Games ");
        System.out.println("[4] Shopping ");
        System.out.println("[5] Send Money ");
        System.out.println("Choose: ");
        int choice = input.nextInt();
        switch(choice) {
            case 1:
                prog1();
                break;
            case 2:
                prog2();
                break;
            case 3:
                prog3();
                break;
            case 4:
                prog4();
                break;
            case 5:
                prog5();
                break;
            default:
                System.out.print("\nNone of the choices,please retry \n");
                menu();
        }
    }
     public static void prog1() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nCreate New Account ");
        
        System.out.print("\nEnter Your Name: ");
        System.out.print("\nFirst Name: ");
        String name1 = input.nextLine();
        System.out.print("Middle Name: ");
        String name2 = input.nextLine();
        System.out.print("Surname Name: ");
        String name3 = input.nextLine();
        System.out.print("Enter Your Phone Number: ");
        String number = input.nextLine();
        int numlength = number.length();
        int length1 = name1.length(),length2 = name2.length(),length3 = name3.length();
        String caps1 = name1.toUpperCase(),caps2 = name2.toUpperCase(),caps3 = name3.toUpperCase();
        if (numlength == 11){
        System.out.print("\nChoose Your user name: \n*If You want to Change name, Enter any key\n");
        String usn1 = caps1.substring(0,1)+name1.substring(1, length1)+caps2.substring(0,1)
                +caps3.substring(0,1)+number.substring(numlength-4,numlength);
        String usn2 = caps2.substring(0,1)+name2.substring(1, length2)+caps3.substring(0,1)
                +caps1.substring(0,1)+number.substring(numlength-8,numlength-3);
        String usn3 = caps3.substring(0,1)+name3.substring(1, length3)+caps1.substring(0,1)
                +caps2.substring(0,1)+number.substring(0,numlength-6);
        System.out.println("[1] "+ usn1);
        System.out.println("[2] "+ usn2);
        System.out.println("[3] "+ usn3);
        int choice = input.nextInt();
        switch (choice){
            case 1:
               System.out.print("\nType Your Password: \n"); 
               String pass1;
               pass1 = input.nextLine();
               pass1 = input.nextLine();
               System.out.print("\nCongratulations!! You now Created a new Account");
               System.out.print("\nYour Account name is:\n");
               System.out.print(caps1+" "+caps2+" "+caps3+" ");
               System.out.print("\nYour Username: "+usn1);
               System.out.print("\nYour Password: "+pass1);
               System.out.print("\n*Make Sure to Remember Your Account");
               break;
            case 2:
               System.out.print("\nType Your Password: \n"); 
               String pass2;
               pass2 = input.nextLine();
               pass2 = input.nextLine();
               System.out.print("\nCongratulations!! You now Created a new Account");
               System.out.print("\nYour Account name is:\n");
               System.out.print(caps1+" "+caps2+" "+caps3+" ");
               System.out.print("\nYour Username: "+usn1);
               System.out.print("\nYour Password: "+pass2);
               System.out.print("\n*Make Sure to Remember Your Account");
               break;
            case 3:
               System.out.print("\nType Your Password: \n"); 
               String pass3;
               pass3 = input.nextLine();
               pass3 = input.nextLine();
               System.out.print("\nCongratulations!! You now Created a new Account");
               System.out.print("\nYour Account name is:\n");
               System.out.print(caps1+" "+caps2+" "+caps3+" ");
               System.out.print("\nYour Username: "+usn1);
               System.out.print("\nYour Password: "+pass3);
               System.out.print("\n*Make Sure to Remember Your Account");
               break;
            default:
               System.out.print("\nYou Enter Any Key, Please Restart \n");
               prog1();
        }
        }
        else{
        System.out.print("\nThe Number You Enter is Incorrect, please retry \n");
            prog1();
        }
        System.out.print("\n\n[Y] Create another [M] Menu [otherwise] Exit");
        System.out.print("\nChoose: ");
        char choice = input.next().charAt(0);
        switch (choice) {
            case 'y':
            case 'Y':
                prog1();
                break;
            case 'm':
            case 'M':
                menu();
                break;
            default:
                System.out.print("\n\nThank you!Come again.....\n");
                System.exit(0);
        }
    }
     public static void prog2() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nLoad ");
        System.out.print("\nAny Network Is Available");
        System.out.print("\nEnter Number: \n");
        String number = input.nextLine();
        int numLength = number.length();
        
        if (numLength == 11) {
            System.out.print("\nChoose Promos: \n");
            System.out.println("[1] Surfing");
            System.out.println("[2] Combo");
            System.out.println("[3] Regular");
            int choice = input.nextInt();
        switch (choice){
            case 1:
               System.out.print("\nSurf");
               System.out.print("\nChoose: \n*If You want to Restart, Enter any key\n");
               System.out.println("[1] Mb");
               System.out.println("[2] Unli");
               int surfChoice = input.nextInt();
               switch (surfChoice) {
                   case 1:
                       System.out.print("\nHow many mb?\n");
                       int mb = input.nextInt();
                       int mbCost = mb / 20;
                       System.out.print("This will cost: ₱"+mbCost);
                       System.out.print("\nEnter Your Cash \n₱");
                       int cash = input.nextInt();
                       if (cash >= mbCost) {
                           int change = cash-mbCost;
                           System.out.print("\nChange is: \n₱"+change);
                           System.out.print("\nThank You for Purchasing! \n");
                       }
                       else {
                           System.out.print("\nYour Cash is Not Enough ");
                           System.out.print("\nPlease Retry \n");
                           prog2();
                       }   
                   break;
                   case 2:
                        System.out.print("\nUnli");
                        System.out.print("\nHow Many Days? \n");
                        int days = input.nextInt();
                        int cost = days*50;
                        System.out.print("This will cost: ₱"+cost);
                        System.out.print("\nEnter Your Cash: \n₱");
                        int cash2 = input.nextInt();
                        if (cash2 >= cost) {
                            int change = cash2-cost;
                           System.out.print("\nChange is: \n₱"+change);
                           System.out.print("\nThank You for Purchasing! \n");
                        }
                        else {
                           System.out.print("\nYour Cash is Not Enough ");
                           System.out.print("\nPlease Retry \n");
                           prog2();
                        }
                    break;
                    default:
                        System.out.print("\nNone of the Choices, Please Retry \n");
                        prog2();
               }
               break;
            case 2:
                System.out.print("\nCombo");
                System.out.print("\nChoose: \n*If You want to Restart, Enter any key\n");
                System.out.println("[1] Call,Text and mb");
                System.out.println("[2] Unli call and text");
                int comboChoice = input.nextInt();
                switch (comboChoice) {
                   case 1:
                       System.out.print("How many Minutes?\n");
                       int min = input.nextInt();
                       System.out.print("How many Text\n");
                       int text = input.nextInt();
                       System.out.print("How many Mb\n");
                       int mb = input.nextInt();
                       int mbCost = mb / 20;
                       int mincost = min*2;
                       int textcost = text/5;
                       int allcost = mbCost+mincost+textcost;
                       System.out.print("This will cost: ₱"+allcost);
                       System.out.print("\nEnter Your Cash \n₱");
                       int cash = input.nextInt();
                       if (cash >= allcost) {
                           int change = cash-allcost;
                           System.out.print("\nChange is: \n₱"+change);
                           System.out.print("\nThank You for Purchasing! \n");
                       }
                       else {
                           System.out.print("\nYour Cash is Not Enough ");
                           System.out.print("\nPlease Retry \n");
                           prog2();
                       }   
                   break;
                   case 2:
                        System.out.print("\nUnli Call and Text");
                        System.out.print("\nHow Many Days? \n");
                        int days = input.nextInt();
                        int cost = days*50;
                        System.out.print("This will cost: ₱"+cost);
                        System.out.print("\nEnter Your Cash: \n₱");
                        int cash2 = input.nextInt();
                        if (cash2 >= cost) {
                            int change = cash2-cost;
                           System.out.print("\nChange is: \n₱"+change);
                           System.out.print("\nThank You for Purchasing! \n");
                        }
                        else {
                           System.out.print("\nYour Cash is Not Enough ");
                           System.out.print("\nPlease Retry \n");
                           prog2();
                        }
                    break;
                    default:
                        System.out.print("\nNone of the Choices, Please Retry \n");
                        prog2();
               }
               break;
               case 3:
                        System.out.print("\nRegular");
                        System.out.print("\nEnter Amount: \n");
                        int reg = input.nextInt();
                        int cost = reg+2;
                        System.out.print("This will cost: ₱"+cost);
                        System.out.print("\nEnter Your Cash: \n₱");
                        int cash2 = input.nextInt();
                        if (cash2 >= cost) {
                            int change = cash2-cost;
                           System.out.print("\nChange is: \n₱"+change);
                           System.out.print("\nThank You for Purchasing! \n");
                        }
                        else {
                           System.out.print("\nYour Cash is Not Enough ");
                           System.out.print("\nPlease Retry \n");
                           prog2();
                        }
        }
        }
        else {
            System.out.print("\nYou Entered An Incorrect Number, Please Retry\n");
            prog2();
        }
        System.out.print("\n\n[Y] Try another [M] Menu [otherwise] Exit");
        System.out.print("\nChoose: ");
        char choice = input.next().charAt(0);
        switch (choice) {
            case 'y':
            case 'Y':
                prog2();
                break;
            case 'm':
            case 'M':
                menu();
                break;
            default:
                System.out.print("\n\nThank you!Come again.....\n");
                System.exit(0);
        }
      }
     public static void prog3() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nE Games ");
        System.out.print("\nChoose your Game: \n");
        System.out.println("[1] Mobile Legends ");
        System.out.println("[2] Steam ");
        System.out.println("[3] Garena ");
        int game = input.nextInt();
        switch (game) {
            case 1:
                System.out.println("\n[1] Mobile Legends ");
                System.out.println("Enter Your IGN: ");
                String ign;
                ign = input.nextLine();
                ign = input.nextLine();
                System.out.println("How Many Diamonds? ");
                double dias = input.nextInt();
                double diasCost = (dias*2)*.4;
                System.out.print("This will cost: ₱"+diasCost);
                System.out.print("\nEnter Your Cash \n₱");
                int cash = input.nextInt();
                if (cash >= diasCost) {
                        double change = cash-diasCost;
                        System.out.print("\nIGN: "+ign);
                        System.out.print("\nDiamonds: "+dias);
                        System.out.print("\nMoney: ₱"+cash);
                        System.out.print("\nChange is: \n₱"+change);
                        System.out.print("\nThank You for Purchasing! \n");
                     }
                else {
                        System.out.print("\nYour Cash is Not Enough ");
                        System.out.print("\nPlease Retry \n");
                        prog3();
                     }
            break;
            case 2:
                System.out.println("\n[2] Steam ");
                System.out.println("Enter Your UserName: ");
                String usn;
                usn = input.nextLine();
                usn = input.nextLine();
                System.out.println("How Many Steam Wallet? ");
                int sWallet = input.nextInt();
                int sWalletCost = sWallet + 5;
                System.out.print("This will cost: ₱"+sWalletCost);
                System.out.print("\nEnter Your Cash \n₱");
                int cash2 = input.nextInt();
                if (cash2 >= sWalletCost) {
                        double change = cash2-sWalletCost;
                        System.out.print("\nUserName: "+usn);
                        System.out.print("\nSteam Wallet: "+sWallet);
                        System.out.print("\nMoney: ₱"+cash2);
                        System.out.print("\nChange is: \n₱"+change);
                        System.out.print("\nThank You for Purchasing! \n");
                     }
                else {
                        System.out.print("\nYour Cash is Not Enough ");
                        System.out.print("\nPlease Retry \n");
                        prog3();
                     }
            break;
            case 3:
                System.out.println("\n[3] Garena ");
                System.out.println("Enter Your UserName: ");
                String garena;
                garena = input.nextLine();
                garena = input.nextLine();
                System.out.println("How Many Garena Coins? ");
                int gCoins = input.nextInt();
                int gCoinsCost = gCoins + 6;
                System.out.print("This will cost: ₱"+gCoinsCost);
                System.out.print("\nEnter Your Cash \n₱");
                int cash3 = input.nextInt();
                if (cash3 >= gCoinsCost) {
                        double change = cash3-gCoinsCost;
                        System.out.print("\nUserName: "+garena);
                        System.out.print("\nGarena Coins: "+gCoins);
                        System.out.print("\nMoney: ₱"+cash3);
                        System.out.print("\nChange is: \n₱"+change);
                        System.out.print("\nThank You for Purchasing! \n");
                     }
                else {
                        System.out.print("\nYour Cash is Not Enough ");
                        System.out.print("\nPlease Retry \n");
                        prog3();
                     }
            break;
            default:
                System.out.print("\nNone of the Choices, Please Retry \n");
                prog3();
        }
        
        System.out.print("\n\n[Y] Try another [M] Menu [otherwise] Exit");
        System.out.print("\nChoose: ");
        char choice = input.next().charAt(0);
        switch (choice) {
            case 'y':
            case 'Y':
                prog3();
                break;
            case 'm':
            case 'M':
                menu();
                break;
            default:
                System.out.print("\n\nThank you!Come again.....\n");
                System.exit(0);
        }
     }
     public static void prog4() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nShopping ");
        System.out.print("\nWhat Item Do You Want? \n");
        String item = input.nextLine();
        System.out.print("Enter the Price: \n");
        double price = input.nextDouble();
        System.out.print("How Many? \n");
        int noItem = input.nextInt();
        double totalCost = price*noItem;
        System.out.print("Total Cost: \n₱" + String.format("%.2f", totalCost));
        System.out.print("\nEnter the Cash: \n₱");
        double cash = input.nextDouble();
        
        if (cash >= totalCost) {
            double change = cash - totalCost;
            System.out.print("\nYour Purchase is Succesful! ");
            System.out.print("\nItem: " + item);
            System.out.print("\nCost per Item: " + String.format("%.2f", price));
            System.out.print("\nTotal Items: " + noItem);
            System.out.print("\nTotal Cost: ₱" + String.format("%.2f", totalCost));
            System.out.print("\nChange: ₱" + String.format("%.2f", change));
            System.out.print("\nThank You for Purchasing! \n");
        }
        else {
            System.out.print("\nYour Cash is Not Enough ");
            System.out.print("\nPlease Retry \n");
            prog4();
        }
        
        System.out.print("\n\n[Y] Try another [M] Menu [otherwise] Exit");
        System.out.print("\nChoose: ");
        char choice = input.next().charAt(0);
        switch (choice) {
            case 'y':
            case 'Y':
                prog4();
                break;
            case 'm':
            case 'M':
                menu();
                break;
            default:
                System.out.print("\n\nThank you!Come again.....\n");
                System.exit(0);
        }
      }
     public static void prog5() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nSend Money ");
        System.out.print("\n\nReceiver \nEnter First Name:");
        String name1 = input.nextLine();
        System.out.print("Enter Middle Initial:");
        String name2 = input.nextLine();
        System.out.print("Enter Surname:");
        String name3 = input.nextLine();
        System.out.print("Enter The Mobile No. Of Receiver:");
        String num = input.nextLine();
        String caps1 = name1.toUpperCase(),caps2 = name2.toUpperCase(),caps3 = name3.toUpperCase();
        System.out.print("\nAre You Sure You Want to Send It To " + caps1+" "+caps2+" "+caps3);
        System.out.print("\n[Y] Yes [otherwise] No");
        System.out.print("\nChoose: ");
        char choice1 = input.next().charAt(0);
        int length1 = name1.length(),length2 = name2.length(),length3 = name3.length();
        int mid1 = length1/2,mid2 = length2/2,mid3 = length3/2;
        int numlength = num.length();
        String code = caps1.substring(0,1)+caps1.substring(1, mid1)+caps2.substring(0,1)
                +caps3.substring(0,1)+caps3.substring(1, mid3)+caps2.substring(0,1)
                +caps3.substring(0,1)+num.substring(numlength-4,numlength);
        switch (choice1){
            case 'y':
            case 'Y':
                System.out.print("Enter the Money You Will Send: \n₱");
                double money = input.nextDouble();
                System.out.print("Enter Cash: \n₱");
                double cash = input.nextDouble();
                if (cash >= money) {
                    double change = cash - money;
                    System.out.print("\nYour Transaction is Successful!!");
                    System.out.print("\nReceiver: "+ caps1+" "+caps2+" "+caps3);
                    System.out.print("\nMoney You Send: "+ String.format("%.2f", money));
                    System.out.print("\nCash: "+ String.format("%.2f", cash));
                    System.out.print("\nChange: "+ String.format("%.2f", change));
                    System.out.print("\nTransaction Code: "+ code);
                }
                else {
                    System.out.print("\nYour Cash is Not Enough ");
                    System.out.print("\nPlease Retry \n");
                    prog5();
                }
            break;
            default:
                System.out.print("\n\nYou Choose No, Please Re-Enter Again the Receiver");
                prog5();
        }
        
        System.out.print("\n\n[Y] Try another [M] Menu [otherwise] Exit");
        System.out.print("\nChoose: ");
        char choice = input.next().charAt(0);
        switch (choice) {
            case 'y':
            case 'Y':
                prog5();
                break;
            case 'm':
            case 'M':
                menu();
                break;
            default:
                System.out.print("\n\nThank you!Come again.....\n");
                System.exit(0);
        }
      }
     
}
