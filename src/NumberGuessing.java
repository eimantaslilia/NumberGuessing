
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guess = 0;
        int usernum = 0;
        
        while (true) {
            System.out.println("Guess a number: ");
            usernum = reader.nextInt();
            guess++;
        if (usernum < numberDrawn){
            System.out.println("The number is greater, guesses made: " + guess );
        }
        else  if (usernum > numberDrawn) {
            System.out.println("The number is lesser, guesses made: " + guess);  
        } else //if (usernum == numberDrawn) 
        {
            System.out.println("Congratulations, your guess is correct!");
            break;
        }
        }   
    }
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
