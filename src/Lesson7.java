import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson7 {
    public static final double PI = 3.14;
    public double pi = 3.14;
    public static void main(String[] args) {

        String hello = "Hello World";
        int value = 100;
        String formatedString =
                String.format("Java program with word = %s " +
                        "is best program with value = %d", hello, value);
        System.out.println(formatedString);


//        Lesson7 program = new Lesson7();
//
//        int circleLength = 9;
//        double radius1 = circleLength/ (2 * PI);
//        double radius2 = circleLength/ (2 * program.pi);
//
//        System.out.println(radius1);
//
//
//
//
//        Random random = new Random();
//        Scanner scaner = new Scanner(System.in);
//
//        int[] arr1 = initializeArray(new int[6]);
//        int[] arr2 = initializeArray(new int[12]);
//        int[] arr3 = initializeArray(4);

//        int a = 0;
//        initializeNumber(a);
//
//        System.out.println(a);
//
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));

    }

//    public static void initializeNumber(int number){
//        number = 10;
//    }

    public static int[] initializeArray(int[] array){
        Random random = new Random();
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt( 10);

        }
        return array;
    }
    public static int[] initializeArray(int lengthArray){
        Random random = new Random();
        int[] array = new int[lengthArray];
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt( 10);

        }
        return array;
    }
    public double calculateRadius(int lengthCircle){
        double radius = lengthCircle / (2 * pi);
        return radius;
    }
}