import java.util.Scanner;

public class TestRealEstate {
    public static void main(String[] args) {
        RealEstateTransaction r1 = new RealEstateTransaction("a","bcd","efg","h");
        RealEstateTransaction r2 = new RealEstateTransaction("abc","def","gh","ij");
        Scanner input = new Scanner(System.in);

        // ask the user to enter number 1
        System.out.println("Enter number 1: ");
        int n1 = input.nextInt();
        r2.setN1(n1);
        // ask the user to enter number 2
        System.out.println("Enter number 2: ");
        int n2 = input.nextInt();
        r2.setN2(n2);
        System.out.println(r2.encryptedString());
    }
}
