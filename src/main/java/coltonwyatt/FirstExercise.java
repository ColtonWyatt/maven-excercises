package coltonwyatt;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter something");
        String userInput = sc.nextLine();
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println((StringUtils.isNumeric(userInput)));
        System.out.println(StringUtils.reverse(userInput));
        System.out.println(userInput);


    }
}
