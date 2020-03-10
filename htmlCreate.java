import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class htmlCreate{
  htmlCreate(){
    System.out.println("Filename not provided");
  }
  htmlCreate(String filename) throws Exception{
      BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
      writer.write("<html>\n<head>\n\t<title>Uno Project</title>\n</head>\n<body>\n\t<p>This is Body</p>\n</body>\n</html>");
	  writer.close();
  }


  //public static void html_interpret_card(Deck deck_used) throws Exception{
  //    Card[] raw_deck = deck_used.populate_deck();
  //    Stack deck = raw_deck.shuffle(raw_deck);
  //    Card[] hand = deck_used.drawNextHand(deck);
  //    ArrayList<String> getActionArr = new ArrayList<String>();
  //    ArrayList<String> getWorkoutArr= new ArrayList<String>();
  //    ArrayList<Integer> getReps= new ArrayList<Integer>();
  //    for(int i = 0; i < 7; i++){
  //        getActionArr.add(hand[i].getAction());
  //        getWorkoutArr.add(hand[i].getWorkout());
  //        getReps.add(hand[i].getReps());
  //    }
  //}

    public static void main(String [] args) throws Exception{
        int numDecks = 2;
        boolean BoolDeck = true;
        boolean BoolShuffle = true;
        stats cardStats = new stats();

        String filename = "OUTPUT_uno.html";
        //htmlCreate sox = new htmlCreate(filename);

        Deck new_deck = new Deck(numDecks, BoolDeck, BoolShuffle);
        Card[] raw_deck = new_deck.populate_deck();
        Stack deck = new_deck.shuffle(raw_deck);
        Card[] hand = new_deck.drawNextHand(deck);



        ArrayList<String> getActionArr = new ArrayList<String>();
        ArrayList<String> getWorkoutArr= new ArrayList<String>();
        ArrayList<Integer> getReps= new ArrayList<Integer>();

        for(int i = 0; i < 7; i++){
                    getActionArr.add(hand[i].getAction());
                    getWorkoutArr.add(hand[i].getWorkout());
                    getReps.add(hand[i].getReps());
        }
        System.out.println(getActionArr);
        System.out.println(getReps);
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write("<html>\n<head>\n\t<title>Uno Project</title>\n</head>\n<body>\n<p>\n<h1><b>UNO Project 2 - Rishabh Tewari" +
                " Mushfique Khan, Hasan Md. Walid, Oghenevwefe Ojigho, Samuel Adetunji </b></h1>");
        writer.write(("\n<h3> Get Action: </h3>" + getActionArr));
        writer.write(("\n<h3> Get Workout: </h3>" + getWorkoutArr));
        writer.write(("\n<h3> Get Reps: </h3>" + getReps));
        writer.write("\n</p> \n</body>\n</html>");
        writer.close();

    }
}
