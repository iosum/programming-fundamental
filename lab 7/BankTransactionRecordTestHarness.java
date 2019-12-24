import java.util.Random;
import java.util.Scanner;

public class BankTransactionRecordTestHarness {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        // instanitate an array
        BankTransactionRecord records[] = new BankTransactionRecord[500];
        for(int i = 0; i< 500; i++) {
            records[i] = new BankTransactionRecord(rand.nextBoolean(), rand.nextDouble(),rand.nextInt(), rand.nextLong());
                System.out.printf("Iteration number: %d%n", i);
                System.out.println(records[i].isCanadianFunds());
                System.out.println(records[i].getExchangeRate());
                System.out.println(records[i].getTransactionNumber());
                System.out.println(records[i].getTransactionReferenceNumber());
                System.out.println("-----------------------------------------");
        }

        String input = sc.next();

        if(input.equals("yes")) {


            BankTransactionRecord record[] = new BankTransactionRecord[500];
            for(int i = 0; i< 500; i++) {
                record[i] = new BankTransactionRecord(false, 100.0,100, 90);
                System.out.printf("Iteration number: %d%n", i);
                System.out.println(record[i].isCanadianFunds());
                System.out.println(record[i].getExchangeRate());
                System.out.println(record[i].getTransactionNumber());
                System.out.println(record[i].getTransactionReferenceNumber());
                System.out.println("-----------------------------------------");
            }

        }





    }
}
