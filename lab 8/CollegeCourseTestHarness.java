import java.util.Random;
import java.util.Scanner;

public class CollegeCourseTestHarness {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        // new list to generate a course number
        int randomNum[] = {11111, 22222, 33333, 44444, 55555};

        // create an array fill with first 100 rows to the 0
        CollegeCourse c1[][] = new CollegeCourse[200][10];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                c1[i][j] = new CollegeCourse(0, 0);
            }
        }
        // create an array fill with secind 100 rows to the 9999
        for (int i = 100; i < 200; i++) {
            for (int j = 0; j < 10; j++) {
                c1[i][j] = new CollegeCourse(9999, 9999);
            }
        }

        // print out all array elements
        for (int i = 0; i < c1.length; i++) {
            for (int j = 0; j < c1[i].length; j++) {
                System.out.println("i:" + i);
                System.out.println("j:" + j);
                System.out.println("Course number : " + c1[i][j].getCourseNumber());
                System.out.println("Course Reference number : " + c1[i][j].getCourseReferenceNumber());
                System.out.println("-----------");
            }
        }




        int k = 1000000;
        // generate course number randomly
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 10; j++) {
                c1[i][j] = new CollegeCourse();

                   c1[i][j].setCourseReferenceNumber(++k);
                   int rnd = new Random().nextInt(randomNum.length);

                   c1[i][j].setCourseNumber(randomNum[rnd]);
                   System.out.println("i:" + i);
                   System.out.println("j:" + j);


                   System.out.println("Course number : " + c1[i][j].getCourseNumber());
                   System.out.println("Course Reference number : " + c1[i][j].getCourseReferenceNumber());
                   System.out.println("-----------");

            }
        }


        // ask the user to input the row and column
        System.out.println("Please put the rows");
        int row = sc.nextInt();
        System.out.println("Please put the columns");
        int column = sc.nextInt();

        try {
            System.out.println(row);
            System.out.println(column);
            System.out.println("Your course reference number: " + c1[row][column].getCourseReferenceNumber());
            System.out.println("Your course number: " + c1[row][column].getCourseNumber());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erroe: Please provide a row from 0 - 199 or a column between 0 - 9");
        }



    }
}
