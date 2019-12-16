package Project1;

import java.util.Scanner;

public class Skills {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1-Creat Test Plans");
        System.out.println("2-Creat Testing Process");
        System.out.println("3-Craet analytical skills");
        System.out.println("4-Creat communication skills");
        System.out.println("5-Creat analyze test result");
        System.out.println("6-Testing tools and technologies");
        System.out.println("How many skills do you know?");
        int nums = input.nextInt();
        if(nums<6){
            System.out.println("You should have 6 skills");

        }
        if(nums>6){
            System.out.println("Your skills will be approve to start work");
        }






}}

