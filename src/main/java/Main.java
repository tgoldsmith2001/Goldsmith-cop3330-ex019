/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String holder;
        double weight, height, bmi;
        while (true) {
            try {
                System.out.print("Enter your weight: ");
                holder = input.nextLine();
                weight = Double.parseDouble(holder);
            } catch (Exception e) {
                System.out.println("Invalid input, try again");
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.print("Enter your Height: ");
                holder = input.nextLine();
                height = Double.parseDouble(holder);
            } catch (Exception e) {
                System.out.println("Invalid input, try again");
                continue;
            }
            break;
        }
        bmi=conversion(weight,height);
        System.out.format("Your BMI is %.1f\n",bmi);
        if(bmi>=18.5&bmi<=25)
            System.out.println("You are within the ideal weight range.");
        else if(bmi>25)
            System.out.println("You are overweight. You should see your doctor.");
        else
            System.out.println("You are underweight. You should see your doctor.");
    }

    public static double conversion(double weight,double height){
        return(weight/(height*height)*703);
    }
}
