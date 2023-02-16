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

      String bot = "";

//Q: should I make an array for computer response with mirror words?

      //check for mirror words and replace
      for(int j = 0; j <words.length; j++){
        
        //get rid of original word and repeats
        
        if(words[j].equals("I")){
          //bot = bot + words[j];
          bot = bot + "you ";

          //words[j] = words[j].replace("I", "you");
          //System.out.print(words[j]);
        }
        
        if(words[j].equals("me")){
          bot = bot + "you ";
          
          //words[j] = words[j].replace("me", "you");
          //System.out.print(words[j]);
        }

        if(words[j].equals("am")){
          bot = bot + "are ";
          
          //words[j] = words[j].replace("am", "are");
         // System.out.print(words[j]);
        }

        if(words[j].equals("you")){
          bot = bot + "I ";
          
          //words[j] = words[j].replace("you", "I");
          //System.out.print(words[j]);
        }

        if(words[j].equals("my")){
          bot = bot + "your ";
          
          //words[j] = words[j].replace("my", "your");
          //System.out.print(words[j]);
        }

        if(words[j].equals("your")){
          bot = bot + "my ";
          
          //words[j] = words[j].replace("your", "my");
          //System.out.print(words[j]);
        }

        if(bot.equals("")){
          System.out.println("RANDOMIZE THIS.");
        }
        //if bot still empty at end, do a Random message

        else{
          bot += words[j]; // bot = bot + words[j]
          //System.out.println("Random response.");
        }
        System.out.println(bot);
      }

    

    }

    //creating transcript
   // String[] transcript = new String[]
  }
}
