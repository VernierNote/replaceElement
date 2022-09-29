
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Random rnd = new Random();

        int[] newArray = new int[10];
        int[] resultMass = new int[10];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = rnd.nextInt(10);
        }
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] != 1){
                resultMass[i] = newArray[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(resultMass));
    }
}