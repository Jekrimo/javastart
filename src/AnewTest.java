/**
 * Created by JeKriMo on 9/28/2016.
 */

import java.util.Random;
import java.util.Scanner;

public class AnewTest {
    public static void main(String[] args){
//        System.out.println("Tell Me THings!");
////        int something = 4;
////        int gear = 13;
////        System.out.println(something * gear);
////        int anew = gear + something;
////        System.out.println(anew);
////        int taken = anew - 3;
////        System.out.println(taken);
////        System.out.println("more words" + " " + anew);
//
//        Scanner jeffFart = new Scanner(System.in);
//        double fnum, snum, answer;
//        System.out.print("enter num: ");
//        fnum = jeffFart.nextDouble();
//        System.out.print("enter num: ");
//        snum = jeffFart.nextDouble();
//        Scanner inputmonth = new Scanner(System.in);
//        System.out.print("Enter Month Number:");
//        int month = inputmonth.nextInt();
//        String monthString;
//        switch (month) {
//            case 1:  monthString = "January";
//                break;
//            case 2:  monthString = "February";
//                break;
//            case 3:  monthString = "March";
//                break;
//            case 4:  monthString = "April";
//                break;
//            case 5:  monthString = "May";
//                break;
//            case 6:  monthString = "June";
//                break;
//            case 7:  monthString = "July";
//                break;
//            case 8:  monthString = "August";
//                break;
//            case 9:  monthString = "September";
//                break;
//            case 10: monthString = "October";
//                break;
//            case 11: monthString = "November";
//                break;
//            case 12: monthString = "December";
//                break;
//            default: monthString = "Invalid month";
//                break;
//        }
//        System.out.println(monthString);
//        answer = fnum * snum;
//        System.out.println(answer);
////        if(answer % 4 == 0){
////            System.out.println("It worked!!!!!!!!!!!!!!!");
////        }
////        else{
////            System.out.println("It didn't work yo!!");
////        }
//
//        int i;
//        int a;
//        int temp;
//        for(i = 0; i <= "six"; i++){
//            for(a = 1; a < "four"; a++) {
//                System.out.println("this one is " + (i * a));
//            }
//        }
        int guess;
        Random randomGenerator = new Random();
        int answer = randomGenerator.nextInt(100);
        Scanner userGuess = new Scanner(System.in);
        System.out.println("Welcome to number game! I'm thinking of a number between 1 and 100. What's the number?");
        answer = randomGenerator.nextInt(100);
        guess = userGuess.nextInt();
        System.out.println("works, your guess is: " + guess);
        System.out.println("well now, we will just see about that won't we....");

        while(answer != guess){
            if(answer > guess){
                System.out.println("Nope! Too low do do.");
                System.out.print("Guess again if you dare.");
                guess = userGuess.nextInt();
            }
            else if(answer < guess){
                System.out.println("Nope! Too high ho ho.");
                System.out.print("Guess again if you dare.");
                guess = userGuess.nextInt();
            }

        }
        if(answer == guess){
            System.out.println("Wow! You actually did it. I am a little surprised, I'll admit it.");
        }
    }
}

