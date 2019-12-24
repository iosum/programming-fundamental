import java.util.Random;
import java.util.Scanner;

public class RealEstateTransaction {
    // private variables including n1 and n2 from the user
    private String streetNumber;
    private String streetName;
    private String city;
    private String purchasePrice;
    private int n1;
    private int n2;

    // constructors
    public RealEstateTransaction() {

    }

    public RealEstateTransaction(String streetNumber, String streetName, String city, String purchasePrice) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.purchasePrice = purchasePrice;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String lowerUpper() {
        String s = getStreetNumber() + getStreetName() + getCity() + getPurchasePrice();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i < charArray.length / 2) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            } else {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        return String.valueOf(charArray);
    }

    public String subLowerUpper() {
        String s = getStreetNumber() + getStreetName() + getCity() + getPurchasePrice();
        char[] charArray = s.toCharArray();
        Random rand = new Random();
        int lowerLetter = rand.nextInt();
        int upperLetter = rand.nextInt();
        if (lowerLetter >= 0 && upperLetter < charArray.length) {
            for (int i = 0; i < charArray.length; i++) {
                if (i < lowerLetter) {
                    charArray[i] = Character.toLowerCase(charArray[i]);
                }
                if (i >= lowerLetter && i <= upperLetter) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                }
            }

            return String.valueOf(charArray);
        } else {
            return new String("the number is not valid");
        }


    }


    public String encryptedString() {

        String s = getStreetNumber() + getStreetName() + getCity() + getPurchasePrice();
        char[] charArray = s.toCharArray();

        if(n1 > 0 && n1 < charArray.length && n2 > 0 && n2 < charArray.length) {
            for (int i = n2; i < charArray.length; i += 3) {
                charArray[i] = charArray[n1];
            }

            return String.valueOf(charArray);
        }

        return new String("please enter valid numbers");


    }


}
