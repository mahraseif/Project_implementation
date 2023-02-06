import java.util.*;
class LoginRegister { 
    public  void Login(){
        Scanner input = new Scanner(System.in);
        System.out.println("*********************WELCOME IN OUR LIBRARY MANAGEMENT SYSTEM**********************");
        System.out.println("if you are registerd,click 1 to login.");
        System.out.println("And if you are not registerd,click 2 to be registerd");
        int number = input.nextInt();
        if(number==1){
            System.out.println("Enter your username");
            String username = input.nextLine();
            String usernam = input.nextLine();
        if(usernam.isEmpty()){
            System.out.println("You haven't enter your username,please enter your username");
            String usernamein = input.nextLine();
            }
            System.out.println("Enter your password");
             String password = input.nextLine();
            if (password.isEmpty()) {
                System.out.println("You haven't enter your password, Please enter your password");
                String passwordin = input.nextLine();
            }
            System.out.println("LOGIN SUCCESS");
        }
            else{
            if(number ==2){
                System.out.println("**********WELCOME TO BE OUR MEMBER**********");
                System.out.println("Enter your username to be registerd");
                String inm = input.next();
            if(inm.isEmpty()){
                System.out.println("You haven't enter yuor username,please enter your username");
                String usernamein = input.nextLine();
            }
            System.out.println("Enter your password");
                 String pasword = input.next();
                if (pasword.isEmpty()) {
                    System.out.println("You haven't enter your password,Please enter your password");
                    String passwordin = input.nextLine();
                }
                System.out.println("Enter your email");
                String ema = input.next();
                if(ema.isEmpty()){
                    System.out.println("you haven't enter your email,please enter your email");
                    String emailin = input.nextLine();
                }
                System.out.println("You will have to remember your username and password for login next time");
                System.out.println("REGISTER SUCCESS");
            }
        }
       
    }
}