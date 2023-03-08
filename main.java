import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
       ArrayList<Integer> envelopeFilled = new ArrayList<>();
       ArrayList<Integer> nextSeven = new ArrayList<>();
       ArrayList<Integer> unstuffed = new ArrayList<>();
        int total = 0;
        int total2 = 0;
        int total3 = 0;

        System.out.println("Hey Donye', Its pay week! I am going to select 7 envelopes for you to stuff. \nHow many envelopes have you filled already?");
        int envelopes = scan.nextInt();
        if(envelopes > 1){
            System.out.println("Great you are on the road to a financial stability.");
            for(int i =1; i <= envelopes; i++){
                System.out.println("What are the " + i + " envelope you have filled?");
                int filled = scan.nextInt();
                envelopeFilled.add(filled);
            }
            for(int newEnvelope:envelopeFilled){
                total += newEnvelope;
            }
            for(int i=0; i<7; i++){
                nextSeven.add(ran.nextInt(100));

            }
            for(int number:nextSeven){
                total2 += number;
            }
            System.out.println("Good Job, you have filled " + envelopeFilled+ "\nYou should have $" + total + " saved.");
            //Add the total numbers in the arraylist.
            System.out.println("Good Job, you have filled " + envelopeFilled);
            System.out.println("Here is your your next seven envelopes" + nextSeven);

            //envelopeFilled.forEach((n) -> System.out.println(n));


        }else if(envelopes == 0){
            //generate randomly 7 numbers 1 to 100.
            for(int i=0; i<7; i++){
                nextSeven.add(ran.nextInt(100));

            }
            for(int number:nextSeven){
                total2 += number;
            }

            System.out.println("Here is your first seven envelopes" +nextSeven);
            System.out.println("The 7 number you are to save this week is: "+ total2);

        }
        System.out.println("Have you completed the challenge?");
        String answer = scan.next();

        if(answer .equals("Yes")){
            System.out.println("You have complete the challenge and should have saved $5,050!");
            System.out.println("Lets un-stuff the envelopes together.");
            System.out.println("Grab an envelope and tell me what amount is inside.");
            for(int i=0; i <=5; i++){
                int unstuffedE;
                System.out.println("Envelope: "+ i);
                unstuffedE = scan.nextInt();
                unstuffed.add(unstuffedE);
            }
            for(int stuffed : unstuffed){
                total3 += stuffed;

            }
            System.out.println("You have a total savings of" + total3);
        }

         if(answer .equals("No")){
            System.out.println("How many envelopes you have left to fill?");
            int lopes = scan.nextInt();

            if(lopes <=14){
                System.out.println("You are almost there \n See you in 2 weeks.");
            }else {
                System.out.println("Keep it going. You got this!!");
            }
        } else {
             System.out.println("Error");
         }


    }
}
