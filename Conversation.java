/**
 *Filename: Conversation.java
*Description: Creating a chatbot for A3 in CSC 120.
     Author: Logan Hankla (@loganhankla)
       Date: 15 February 2023
 */

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/**Conversation creates a chatbot that responds to a user with a specified number of rounds. */
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

// array for transcript?
    String[] transcript = new String[num_rounds*2 + 2];
    transcript[0] = "-----TRANSCRIPT-----";
    transcript[1] = "Hey friend! What's up?";
    
    /**transcript index for user input*/
    int tr_ind = 2;
    
    /**computer response index for transcript */
    int cr_ind = 3;

    //loop for user chats for number of rounds
    for(int i = 0; i < num_rounds; i++){
      Scanner user_input = new Scanner(System.in);
      String input = user_input.nextLine();
      transcript[tr_ind] = input;
      //System.out.print(transcript[tr_ind]);
      //tr_ind++;
      tr_ind+=2;

      //split into words then go through words in a loop within the loop
      String[] words = input.split(" ");

      //create empty string for computer response
      String bot = "";

      //check for mirror words and replace
      for(int j = 0; j <words.length; j++){
        
        if(words[j].equals("I")){
          bot = bot + "you ";
        }
        
        else if(words[j].equals("me")){
          bot = bot + "you "; 
        }

        else if(words[j].equals("I'm")){
          bot = bot + "you're "; 
        }

        else if(words[j].equals("You're")){
          bot = bot + "I'm "; 
        }

        else if(words[j].equals("am")){
          bot = bot + "are ";
        }

        else if(words[j].equals("you") || words[j].equals("you.")){
          bot = bot + "I ";
        }



        else if(words[j].equals("my")){
          bot = bot + "your ";
        }

        else if(words[j].equals("your")){
          bot = bot + "my ";
        }

        else{
          bot += words[j];
          bot += " ";
        }
        
      }

      //if bot still empty at end, do a Random message
      if(bot.equals(input + " ")){
        Random random = new Random();
        int index = random.nextInt(canned_responses.length);
        System.out.println(canned_responses[index]);
        transcript[cr_ind] = canned_responses[index]; //check, goodish for first one
        cr_ind+=2;
      }

      else{System.out.println(bot);
        transcript[cr_ind] = bot; //check, goodish for first one
        cr_ind+=2;
      }
    

    }
    
    for(int k = 0; k < transcript.length; k++){
      System.out.println(transcript[k]);
    }

    //System.out.println(Arrays.toString(transcript));
  }
  
}
