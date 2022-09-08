//imports
import java.util.*;

//code
public class TheMall {
    public static void main(String[] args) {
        //declare floors as variables
        String flr1 = "Ground Floor: Kids Wear";
        String flr2 = "First Floor: Ladies Wear";
        String flr3 = "Second Floor: Designer Sarees";
        String flr4 = "Third Floor: Men's Wear";

        //entrance message
        Scanner inFloor = new Scanner(System.in);
        System.out.println("Welcome to The Mall, where we serve all your fashion needs.");
        System.out.println("We currently have:");
        System.out.println(flr1);
        System.out.println(flr2);
        System.out.println(flr3);
        System.out.println(flr4);

        //input floor
        System.out.println("Which floor would you like to go? ");
        int f = inFloor.nextInt();

        //display floor
        if(f == 1) {
            System.out.println("You are now in the Kids Wear Section");
        }
        else if(f == 2) {
            System.out.println("You are now in the Ladies Wear Section");
        }
        else if(f == 3) {
            System.out.println("You are now in the Designer Sarees Section");
        }
        else if(f == 4) {
            System.out.println("You are now in the Men's Wear Section");
        }
        else{
            System.out.println("We currently do not have that amount of floors, sorry");
        }

        //list of items available
        //kids
        String k_aisle1 = "Hoodies for 1000 Credits";
        String k_aisle2 = "Pajamas for 800 Credits";
        String k_aisle3 = "Trousers for 700 Credits";
        String k_aisle4 = "Denim Wear for 1200 Credits";
        String k_aisle5 = "Shirts for 650 Credits";
        String k_aisle6 = "Shirts for 700 Credits";
        String k_aisle7 = "Footwear for 600 Credits";
        //ladies
        String l_aisle1 = "Skirts for 800 Credits";
        String l_aisle2 = "Kurtas for 500 Credits";
        String l_aisle3 = "Pajamas for 900 Credits";
        String l_aisle4 = "Sarees for 300 Credits";
        //designer
        String d_aisle1 = "Half Sarees for 3000 Credits";
        String d_aisle2= "Lehangas for 5500 Credits";
        String d_aisle3 = "Pattu Sarees for 30000 Credits";
        //mens
        String m_aisle1 = "Jeans for 1500 Credits";
        String m_aisle2 = "Shirts for 1000 Credits";
        String m_aisle3 = "Kurtas for 1000 Credits";
        String m_aisle4 = "Coats for 3500 Credits";
        String m_aisle5= "Ties for 500 Credits";
        String m_aisle6 = "Footwear for 1000 Credits";

        //output the items available
        if(f == 1) {
            System.out.println("In the Kids Section, we have:");
            System.out.println("Aisle 1: "+k_aisle1+"\nAisle 2: "+k_aisle2+"\nAisle 3: "+k_aisle3+"\nAisle 4: "+k_aisle4);
        }
    }
}