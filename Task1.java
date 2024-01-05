

import java.util.Scanner;
import java.util.Random;
    public class Task1 {
        public static void main(String args[]) {
            //generate random number between 1 and 100
            Random Random_number= new Random();
            int right_guess=Random_number.nextInt(100);
            //number of trials that user has to guess the number
            int turns=0;


            System.out.println("Guess a number between 1 to 100\n You will have 10 turns!" );
            Scanner scan=new Scanner(System.in);
            System.out.println("BEST OF LUCK!!!");

            int guess;
            int i=0;
            boolean win=false;
            while(win==false) {
                guess=scan.nextInt();
                turns++;
                if(guess==right_guess) {
                    win=true;

                }
                else if(i>11){
                    System.out.println("You loose! the right answer was: "+right_guess);
                    return;
                }
                else if(guess<right_guess){
                    i++;
                    System.out.println("Yor Guess is lower than the right guess! Turns left: "+(10-i));



                }
                else if(guess>right_guess) {
                    i++;
                    System.out.println("Your Guess Is Higher Than THe Right Guess! Turns left: "+(10-i));

                }



            }
            System.out.println("You win!");
            System.out.println("then  number was "+right_guess);
            System.out.println("You used "+turns+"turns to guess the right number");
            System.out.println("Your score is  "+((11-turns)*10)+" out of 100");


        }
    }




