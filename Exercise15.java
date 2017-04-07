/*
* Name: David Rodriguez
* Section: COSC/ITSE 1336
* Homework: Excercise 14
* Description: Switch Excercise
*/

/*
* -------------------------------PSUDO CODE---------------------------------------------
* Get userinput
*   while(intIndex <word.length)
*   
*---------------------------------------------------------------------------------------
*/
import java.util.Scanner;
public class Exercise15 {

    public static void main(String [] strArgs){
        Scanner newScanner = new Scanner(System.in);
        int intUsernumber = 0;
        int intStartNumber = 0;
        int sumNumber = 0;
    

        System.out.println("Please enter only even integers.");
            intUsernumber = newScanner.nextInt();

            if(intUsernumber < 2){

                System.err.println("The integers entered are less than 2.");
                }
            
            for(intStartNumber=2; intUsernumber<=2; intUsernumber+=2){
        }
    }
}