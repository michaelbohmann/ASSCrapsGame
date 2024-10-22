import java.util.Random;
import java.util.Scanner;

class CrapsGameAssignment {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        boolean playAgain;

        do
        {

            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;

            System.out.println("You rolled: " + die1 + " + " + die2 + " = " + crapsRoll);


            if (crapsRoll == 7 || crapsRoll == 11)
            {

                System.out.println("Natural! You win!");
            }
            else if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)
            {

                System.out.println("Craps! You lose.");
            }
            else
            {

                int point = crapsRoll;
                System.out.println("Your point is " + point + ". Try to hit it again!");

                boolean keepRolling = true;


                while (keepRolling)
                {

                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    int newRoll = die1 + die2;

                    System.out.println("You rolled: " + die1 + " + " + die2 + " = " + newRoll);


                    if (newRoll == 7)
                    {

                        System.out.println("You rolled a 7. You lose!");
                        keepRolling = false;
                    }
                    else if (newRoll == point)
                    {

                        System.out.println("You got your point! You win!");
                        keepRolling = false;
                    }
                    else
                    {

                        System.out.println("Keep rolling...");
                    }
                }
            }


            String response;
            while (true)
            {
                System.out.print("Do you want to play again? (Y/N): ");
                response = scanner.nextLine();
                if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("N")) {
                    break;
                }
                else
                {
                    System.out.println("Invalid input. Please type 'Y' or 'N'.");
                }
            }
            playAgain = response.equalsIgnoreCase("Y");

        }
        while (playAgain);

        System.out.println("Thanks for playing Craps!");
    }
}