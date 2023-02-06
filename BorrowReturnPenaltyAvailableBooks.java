import java.util.*;
class BorrowReturnPenaltyAvailableBooks {
    public void Activity(){
        Scanner get = new Scanner(System.in);
        System.out.println("click 1 to see books available");
        System.out.println("click 2 to borrow book");
        System.out.println("click 3 to return book");
        System.out.println("click 4 to pay penalty");     
        int num = get.nextInt();
        if(num ==1){
            System.out.println("************BOOKS AVAILABLE***********");
            System.out.println("java");
            System.out.println("Information technology");
            System.out.println("Account");
            System.out.println("Economy");
            System.out.println("website");
        } 
        else{
            if(num==2){
                System.out.println("********WELCOME TO BORROW BOOK********");
                System.out.println("enter the name of the book you borrow");
                String namein = get.nextLine();
                String name = get.nextLine();
        System.out.println("return our book after 5 days.Otherwise yuo will have to pay penalty");
                System.out.println("*************THANK YOU************");
            }
        } 
        if(num ==3){
            System.out.println("********WELCOME TO RETURN BOOK*********");
                System.out.println("enter the name of the book you return");
                String name = get.nextLine();
                String nae = get.nextLine();
                System.out.println("*************THANK YOU FOR RETURN OUR BOOK************");
        }
        if(num ==4){
            System.out.println("********WELCOME TO PAY PENALTY*********");
                System.out.println("enter the name of the book you late to return");
                String late = get.nextLine();
                String latein = get.nextLine();
                System.out.println("you will have to pay 500");
                System.out.println("*************THANK YOU************");
        }
    }
}
