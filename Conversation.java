/**
 *Filename: Conversation.java
*Description: Creating a chatbot for A3 in CSC 120.
     Author: Logan Hankla (@loganhankla)
       Date: 15 February 2023
 */

import java.util.Scanner;
import java.util.Random;

class Conversation {

  public static void main(String[] arguments) {
    Scanner round_scan = new Scanner(System.in);
    System.out.println("How many chat rounds would you like?");
    //gets user input for number of chat rounds
    Short num_rounds = round_scan.nextShort();

    //start conversation
    System.out.println("Hey friend! What's up?");
  
    // allocate static array of canned responses
    String[] canned_responses = {"Gotcha.", "For sure.", "Tell me more!", "What do you mean?", "Mmhmm..."};

    //loop for user chats for number of rounds
    for(int i = 0; i < num_rounds; i++){
      Scanner user_input = new Scanner(System.in);
      String input = user_input.nextLine();

      //split into words then go through words in a loop within the loop
      String[] words = input.split(" ");


//Q: should I make an array for computer response with mirror words?

      //check for mirror words and replace
      for(int j = 0; j <words.length; j++){
        if(words[j].equals("I")){
          words[j].replace("I", "you");
          System.out.print(words[j]);
        }

        else{
          System.out.println("Random response.");
        }
      
      }

    

    }

    //creating transcript
   // String[] transcript = new String[]
  }
}
