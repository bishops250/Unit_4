/* Creator: Aron Bishop
Date: November 18, 2019(11/18/19)

                                                   ////Piglet Game////

Piglet is a small single player game, Where the user types "y" to roll a one six sided dice and "n" to stop rolling. The
First Roll is automatically done for the user.The goal is to achieve the largest number, before rolling a "one"(1).
If the User rolls a one the players score is automatically set to "zero"(0). Otherwise each roll is added to the users total.

Small Notes: The letters are not case sensitive, a user can enter UpperCase or Lowercase it will be evaluated either
way.

Dice Roll:
1=0 -End Game(Automatic Loss)
2=2
3=3
4=4
5=5
6=6


 */

import java.util.Scanner;


public class Piglet {


    private static void piglet_query() { //Method Containing Piglet Game
        Scanner user_input = new Scanner(System.in);
        int piglet_score = 0;
        System.out.println("Welcome to Piglet!");

        System.out.println("Please type \"Y\" roll a dice or \"N\" to quit:  ");
        /*offers user choice to roll or quit.
        Option 1("Y")-If the user chooses "Y: game initializes and rolls first number.
        Option 2("N")-If the user chooses "N" game automatically ends with GAME OVER.
        */
        String user_roll_choice = user_input.next().toLowerCase(); //gets User Input

        if (user_roll_choice.equals("y")) { //Choose To either Start or not start game
            while (user_roll_choice.equals("y")) {
                int dice_number = (int) (Math.random() * 6) + 1; //dice roll only options are 1,2,3,4,5,6

                if (dice_number == 1) { //if roll=1 Game is Over, Tell the user their points are now zero.
                    System.out.println("You rolled a 1!\n You got 0 points.\n GAME OVER!!");
                    return;

                } else { //As Long as the dice_number is not 1 the else is executed
                    piglet_score += dice_number; //adds to piglet score
                    System.out.println("Current Piglet Score: " + piglet_score); /*Informs the users of their current
                     Score
                    */
                    System.out.println("Please type \"Y\" roll a dice or \"N\" to quit:  "); /* re-prompts the user
                    to either quit or roll again. */
                    user_roll_choice = user_input.next().toLowerCase();

                    if (user_roll_choice.equals("n")) { /* If the user chooses "N" the game ends and lists the
                    users current score*/
                        System.out.println("GAME OVER!!\n User Quited\n You got " + piglet_score + " points.");
                        return;
                    }
                }

            }
        } else if (user_roll_choice.equals("n")) { /*Only Executes if the First Input is "N". If the input is "N"
        the game Immediately ends and provides user with unique output*/

            System.out.println("GAME OVER!!!\n The User's Piglet Score is " + piglet_score +
                    "\n The User Never Rolled!!!");
            return;
        } else {
            System.out.println("Invalid Input??"); //Only Occurs If Input is not a "Y" or "N"
            return;
        }

    }


    public static void main(String[] args) {

        piglet_query();

    }


}

