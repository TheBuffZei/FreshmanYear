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
            System.out.println("Aisle 1: Hoodies for "+k_hoodies+" Credits \nAisle 2: Pajamas for "+k_pajamas+" Credits \nAisle 3: Shirts + Skirts for "+k_shirts_skirts+" Credits \nAisle 4: Trousers for "+k_trousers+" Credits \nAisle 5: Denim Wear for "+k_denim_outfit+" Credits \nAisle 6: Footwear for "+k_footwear+" Credits");
        }
        else if(f == 2) {
            System.out.println("In the Ladies Section, we have: ");
            System.out.println("Aisle 1: Skirts for "+l_skirts+" Credits \nAisle 2: Sarees for "+l_saree+" Credits \nAisle 3: Kurtas for "+l_kurta+" Credits \n Aisle 4: Pyjamas for "+l_pyjama+" Credits");
        }
        else if(f == 3) {
            System.out.println("In the Designer Sarees Section, we have:");
            System.out.println("Aisle 1: Half Sarees for "+d_halfSaree+" Credits \nAisle 2: Lehengas for "+d_lehenga+" Credits \nAisle 3: Pattu Sarees for "+d_pattuSaree+" Credits");
        }
        else if(f == 4) {
            System.out.println("In the Men's Section, we have:");
            System.out.println("Aisle 1: Shirts for "+m_shirts+" Credits \nAisle 2: Jeans for "+m_jeans+" Credits \nAisle 3: Suits for "+m_suits+" Credits \nAisle 4: Ties for "+m_ties+" Credits \n Aisle 5: Kurtas for "+m_kurtas+" Credits \nAisle 6: Footwear for "+m_footwear+" Credits");
        }
    }
}