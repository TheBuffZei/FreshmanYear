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
            System.out.println("You are now in the Kids Wear Section.");
        }
        else if(f == 2) {
            System.out.println("You are now in the Ladies Wear Section.");
        }
        else if(f == 3) {
            System.out.println("You are now in the Designer Sarees Section.");
        }
        else if(f == 4) {
            System.out.println("You are now in the Men's Wear Section.");
        }
        else{
            System.out.println("We currently do not have that amount of floors, sorry.");
        }
/*list of items available
        int k_hoodies = 1000;
        int k_pajamas = 880;
        int k_shirts = 700;
        int k_trousers = 700;
        int k_denim_outfit = 1200;
        int k_skirts = 650;
        int k_footwear = 600;

        int l_skirts = 800;
        int l_kurta = 500;
        int l_pyjama = 400;
        int l_saree = 300;

        int d_halfSaree = 3000;
        int d_lehanga = 5500;
        int d_pattuSaree =30000;

        int m_jeans = 0;
        int m_shirts = 0;
        int m_kurtas = 0;
        int m_coats = 0;
        int m_ties = 0;
        int m_footwear = 0;
*/
        //output the items available

    }
}