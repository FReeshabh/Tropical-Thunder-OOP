//Author - Samuel Adetunji
//Class - CS 2365-002

public class Card{
	boolean isAction;
	int repNum;
	String exercise;
	String action;

	Card(){
		System.out.println("You didn't pass any parameters. Check your code and try again");
	}

	//Constructor for number cards - given the number and color/workout
	Card(int reps, String workout){
		setType(false);
		setWorkout(workout);
		setReps(reps);
		setAction("null");
	}

	//Constructor for Special cards - needs to be given the type of card and its color.
	//Wild cards are considered rainbow
	Card(String specific, String Color){
		setType(true);
		setWorkout(Color);
		setReps(0);
		setAction(specific);
	}

	//sets the Action string to something to something
	//Like wildcard or draw 2
	private void setAction(String name){
		action = name;
	}

	//sets the number of reps for this individual card
	private void setReps(int reps){
		repNum = reps;
	}

	//sets the isAction boolean for future use
	private void setType(boolean type){
		isAction = type;
	}

	//sets the exercise String for future use
	private void setWorkout(String workout){
		exercise = workout;
	}

	//returns the particular action for this card
	private String getAction(){
		return action;
	}

	//returns the reps aka the number on the card
	private int getReps(){
		return repNum;
	}

	//returns whether or not the card is an action card
	private boolean getType(){
		return isAction;
	}

	//returns the workout aka the color of the current card
	private String getWorkout(){
		return exercise;
	}
}