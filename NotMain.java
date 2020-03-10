//Rishabh Tewari
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;

public class NotMain {
    //Main(){
    //}

    public static void main(String[] args) throws Exception{

        //Print a header to a file
        String filename = "OUTPUT_uno.html";
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write("<html>\n<head>\n\t<title>Uno Project</title>\n</head>\n<body>\n<p>\n<h1><b>UNO Project 2 - Rishabh Tewari" +
                " Mushfique Khan, Hasan Md. Walid, Oghenevwefe Ojigho, Samuel Adetunji </b></h1>");

        System.out.println("Welcome to Uno, how many Decks do you want?\n");
        Scanner scan = new Scanner(System.in);
        int numDecks = scan.nextInt();
        writer.write("<h1>There are - " + numDecks + " decks </h1>");

        System.out.println("Do you want Action Cards?\n");
        boolean BoolDeck = scan.nextBoolean();
        writer.write("<h1>Special cards - " + BoolDeck + "</h1>");

        System.out.println("Do you want to shuffle together?\n");
        boolean BoolShuffle = scan.nextBoolean();
        writer.write("<h1>Shuffling together - " + BoolShuffle + "</h1>");

        Deck new_deck = new Deck(numDecks, BoolDeck, BoolShuffle);
        //new_deck.shuffle_together = BoolShuffle;
        Card[] raw_deck = new_deck.populate_deck();
        Stack deck = new_deck.shuffle(raw_deck);
        Card[] hand = new_deck.drawNextHand(deck);

        //Stats stats = new Stats();

        while(deck.top >= 7){
            ArrayList<String> getActionArr = new ArrayList<String>();
            ArrayList<String> getWorkoutArr= new ArrayList<String>();
            ArrayList<Integer> getReps= new ArrayList<Integer>();

            for(int i = 0; i < 7; i++){
                getActionArr.add(hand[i].getAction());
                getWorkoutArr.add(hand[i].getWorkout());
                getReps.add(hand[i].getReps());
            }

            writer = new BufferedWriter(new FileWriter(filename));
            writer.write("<html>\n<head>\n\t<title>Uno Project</title>\n</head>\n<body>\n<p>\n<h1><b>UNO Project 2 - Rishabh Tewari" +
                    " Mushfique Khan, Hasan Md. Walid, Oghenevwefe Ojigho, Samuel Adetunji </b></h1>");
            writer.write(("\n<h3> Get Action: </h3>" + getActionArr));
            writer.write(("\n<h3> Get Workout: </h3>" + getWorkoutArr));
            writer.write(("\n<h3> Get Reps: </h3>" + getReps));
            hand = new_deck.drawNextHand(deck);

        }
            //for (int i =0; i < 7; i++){
                //stats.putHand(hand);
                //Card item= new Card(0,"null");
                //check if we have special cards
                //for(int c = 0; c< 7; c++){
                    //Null pointer exception @ line 46
                    /*
                    if(hand[c].getAction().equals("Wild Draw 4") || hand[c].getAction().equals("DRAW TWO") || hand[c].getAction().equals("Wild") || hand[c].getAction().equals("Skip")){
                        if(hand[c].getAction().equals("Wild Draw 4")){
                            for(Card item2: hand){
                                if(!item2.getType()) {
                                    hand[c].setReps(hand[c].getReps()*4);
                                }
                            }
                            //Set up draw 2
                        } else if(hand[c].getAction().equals("DRAW TWO")){
                            for(Card item2: hand){
                                if(item2.getWorkout().equals(hand[c].getWorkout()) && !item2.getType())
                                    item2.setReps(item2.getReps()*2);
                            }
                            //Set up Skip
                        } else if(hand[c].getAction().equals("SKIP")){
                            for(Card item2: hand){
                                if(item2.getWorkout().equals(hand[c].getWorkout())){
                                    hand[c].setReps(0);
                                    hand[c].setAction("skipped");
                                    hand[c].setType(false);
                                    hand[c].setWorkout("skipped");
                                }
                            }
                            //Set up Wild cards
                        } else if(hand[c].getAction().equals("Wild")){
                            hand[c].setAction("Burpees");
                            hand[c].setReps(10);
                            hand[c].setWorkout("Burpees");
                            hand[c].setType(false);
                        }
                    }

                }



            }
        }*/
        writer.write("\n</p> \n</body>\n</html>");
        writer.close();
    }
}
