import java.util.Random;
import java.util.Scanner;
public class randomNumberGuess {
    public static void main(String args[])
    {

        Random rand=new Random();//taking a random class.In java it is the best way to get a random element
        int randomNumber= rand.nextInt(101);//now this takes a parameter as i've given 101 that means it will generate a random number between 1-100
        Scanner sc=new Scanner(System.in);
        int playerNumber;
        while (true)
        {
            System.out.println("Please enter a number between (1-100):");
            playerNumber= sc.nextInt();
            if(playerNumber>=1 && playerNumber<=100 )
            {
                break;
            }
            System.out.println("Your guess is out of range");
        }
        if(randomNumber==playerNumber)
        {
            System.out.println("Congratulations you guessed the correct number!!");
        }
        else if(randomNumber<playerNumber)
        {
            System.out.println("The answer is less than the answer you guessed");
        }
        else if(randomNumber>playerNumber)
        {
            System.out.println("The answer is greater than the answer you guessed");
        }
        System.out.println("The random number was "+ randomNumber);
    }
}
