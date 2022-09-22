/**
 * This program is inspired from a Question in my 9th Grade Computer Science Book:
 */

//imports
import java.util.*;

//code
public class TheMall {
    public static void main(String[] args) {
        //declare floors as variables
        String flr1 = "[1]Ground Floor: Kids Wear";
        String flr2 = "[2]First Floor: Ladies Wear";
        String flr3 = "[3]Second Floor: Designer Sarees";
        String flr4 = "[4]Third Floor: Men's Wear";

        //entrance message
        Scanner in = new Scanner(System.in);
        System.out.println("***INPUT ONLY INT***");
        System.out.println("Welcome to The Mall, where we serve all your fashion needs.");
        System.out.println("We currently have:");
        System.out.println(flr1);
        System.out.println(flr2);
        System.out.println(flr3);
        System.out.println(flr4);

        //input floor
        System.out.println("Which floor would you like to go? ");
        int f = in.nextInt();

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
            System.exit(0);
        }

        //list of items available
        //kids
        int k_hoodies = 1000;
        int k_pajamas = 800;
        int k_trousers = 700;
        int k_denim_outfit = 1200;
        int k_shirts_skirts = 700;
        int k_footwear = 800;
        //ladies
        int l_skirts = 900;
        int l_kurta = 600;
        int l_pyjama = 900;
        int l_saree = 300;
        //designer
        int d_halfSaree = 6000;
        int d_lehenga = 7500;
        int d_pattuSaree = 30000;
        //mens
        int m_jeans = 1500;
        int m_shirts = 1000;
        int m_kurtas = 1000;
        int m_suits = 4000;
        int m_ties = 500;
        int m_footwear = 1300;

        //output the items available
        if(f == 1) {
            System.out.println("In the Kids Section, we have:");
            System.out.println("[1]Aisle 1: Hoodies for "+k_hoodies+" Credits \n[2]Aisle 2: Pajamas for "+k_pajamas+" Credits \n[3]Aisle 3: Shirts + Skirts for "+k_shirts_skirts+" Credits \n[4]Aisle 4: Trousers for "+k_trousers+" Credits \n[5]Aisle 5: Denim Wear for "+k_denim_outfit+" Credits \n[6]Aisle 6: Footwear for "+k_footwear+" Credits");
        }
        else if(f == 2) {
            System.out.println("In the Ladies Section, we have: ");
            System.out.println("[1]Aisle 1: Skirts for "+l_skirts+" Credits \n[2]Aisle 2: Sarees for "+l_saree+" Credits \n[3]Aisle 3: Kurtas for "+l_kurta+" Credits \n[4]Aisle 4: Pyjamas for "+l_pyjama+" Credits");
        }
        else if(f == 3) {
            System.out.println("In the Designer Sarees Section, we have:");
            System.out.println("[1]Aisle 1: Half Sarees for "+d_halfSaree+" Credits \n[2]Aisle 2: Lehengas for "+d_lehenga+" Credits \n[3]Aisle 3: Pattu Sarees for "+d_pattuSaree+" Credits");
        }
        else {
            System.out.println("In the Men's Section, we have:");
            System.out.println("[1]Aisle 1: Shirts for "+m_shirts+" Credits \n[2]Aisle 2: Jeans for "+m_jeans+" Credits \n[3]Aisle 3: Suits for "+m_suits+" Credits \n[4]Aisle 4: Ties for "+m_ties+" Credits \n[5]Aisle 5: Kurtas for "+m_kurtas+" Credits \n[6]Aisle 6: Footwear for "+m_footwear+" Credits");
        }
        System.out.println("Where would you like to go?");
        int a = in.nextInt();

        if(a == 1 && f == 1){
            System.out.println("How many Hoodies would you like to buy?");
        }
        else if(a == 2 && f == 1){
            System.out.println("How many Pajamas would you like to buy?");
        }
        else if(a == 3 && f == 1){
            System.out.println("Would you like to buy [1]Shirts or [2]Skirts?");
            int x = in.nextInt();
            if(x == 1){
                System.out.println("How many Shirts would you like to buy?");
            }
            else if(x == 2){
                System.out.println("How many Skirts would you like to buy?");
            }
            else{
                System.exit(0);
            }
        }
        else if(a == 4 && f == 1){
            System.out.println("How many Trousers would you like to buy?");
        }
        else if(a == 5 && f == 1){
            System.out.println("How many pairs of Denim Clothing would you like to buy?");
        }
        else if(a == 6 && f == 1){
            System.out.println("How many pairs of Footwear would you like to buy?");
        }
    }
}