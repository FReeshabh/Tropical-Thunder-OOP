import java.util.Random;
// This class is still incomplete and should include a getNextHand() method
// Documentation needs to be added for all the methods.

// This is a stack for storing the deck of cards
// The hand is drawn by using pop() method 7 times.
class Stack {
    static final int MAX = 324;
    int top;
    Card[] a = new Card[MAX];

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Card c) {
        if (top >= MAX - 1) {
            a[++top] = c;
        }
    }

    Card pop() {
        if (top == -1) return null;
        return a[top--];
    }
}

// Enter Description Here
class Deck {
    int num_decks;
    boolean action_cards;
    boolean shuffle_together;

    //Enter Description Here
    Card[] populate_deck() {
        int num_cards;

        if (action_cards) {
            num_cards = 108 * num_decks;
        } else {
            num_cards = 76 * num_decks;
        }

        Card[] raw_deck = new Card[num_cards];
        int n = 0;
        while (n < num_cards) {
            Card c = new Card();

            c.setWorkout("BLUE");
            for (int i = 0; i < 10; i++) {
                c.setReps(i);
                raw_deck[n++] = c;
            }
            for (int i = 1; i < 10; i++) {
                c.setReps(i);
                raw_deck[n++] = c;
            }

            c.setWorkout("YELLOW");
            for (int i = 0; i < 10; i++) {
                c.setReps(i);
                raw_deck[n++] = c;
            }
            for (int i = 1; i < 10; i++) {
                c.setReps(i);
                raw_deck[n++] = c;
            }

            c.setWorkout("RED");
            for (int i = 0; i < 10; i++) {
                c.setReps(i);
                raw_deck[n++] = c;
            }
            for (int i = 1; i < 10; i++) {
                c.setReps(i);
                raw_deck[n++] = c;
            }

            c.setWorkout("GREEN");
            for (int i = 0; i < 10; i++) {
                c.setReps(i);
                raw_deck[n++] = c;
            }
            for (int i = 1; i < 10; i++) {
                c.setReps(i);
                raw_deck[n++] = c;
            }

            if (action_cards) {
                c.setWorkout("BLUE");
                for (int i = 0; i < 2; i++) {
                    c.setAction("Push Ups");
                    raw_deck[n++] = c;
                    c.setAction("Squats");
                    raw_deck[n++] = c;
                    c.setAction("Sit Ups");
                    raw_deck[n++] = c;
                    c.setAction("Lounges");
                    raw_deck[n++] = c;
                }
            }
        }
        return raw_deck;
    }

    // Enter description here
    Stack shuffle(Card[] raw_deck, boolean shuffle_together) {
        Stack draw_deck = new Stack();
        Random rand = new Random();
        int num_cards;
        // Edit code for individual shuffling

        if (action_cards) {
            num_cards = 108;
        } else {
            num_cards = 76;
        }

        if (!shuffle_together) {
            switch(num_decks) {
                case 1:
                    for (int i = 0; i < num_cards; i++) {
                        int r = i + rand.nextInt(num_cards - 1);

                        Card temp = raw_deck[r];
                        raw_deck[r] = raw_deck[i];
                        raw_deck[i] = temp;
                    }
                case 2:
                    for (int i = 0; i < num_cards; i++) {
                        int r = i + rand.nextInt(num_cards - 1);

                        Card temp = raw_deck[r];
                        raw_deck[r] = raw_deck[i];
                        raw_deck[i] = temp;
                    }
                    for (int i = num_cards; i < (2 * num_cards); i++) {
                        int r = i + rand.nextInt(num_cards - 1);

                        Card temp = raw_deck[r];
                        raw_deck[r] = raw_deck[i];
                        raw_deck[i] = temp;
                    }
                case 3:
                    for (int i = 0; i < num_cards; i++) {
                        int r = i + rand.nextInt(num_cards - 1);

                        Card temp = raw_deck[r];
                        raw_deck[r] = raw_deck[i];
                        raw_deck[i] = temp;
                    }
                    for (int i = num_cards; i < (2 * num_cards); i++) {
                        int r = i + rand.nextInt(num_cards - 1);

                        Card temp = raw_deck[r];
                        raw_deck[r] = raw_deck[i];
                        raw_deck[i] = temp;
                    }
                    for (int i = (2 * num_cards); i < (3 * num_cards); i++) {
                        int r = i + rand.nextInt(num_cards - 1);

                        Card temp = raw_deck[r];
                        raw_deck[r] = raw_deck[i];
                        raw_deck[i] = temp;
                    }
            }
        }

        else {
            for (int i = 0; i < num_cards * num_decks; i++) {
                int r = i + rand.nextInt(num_cards - 1);

                Card temp = raw_deck[r];
                raw_deck[r] = raw_deck[i];
                raw_deck[i] = temp;
            }
        }

        for (int i = 0; i < num_cards; i++) {
            draw_deck.push(raw_deck[i]);
        }

        return draw_deck;
    }

    Card[] draw_Hand(Stack draw_deck) {
        Card[] hand = new Card[7];
        for (int i = 0; i < 7; i++) {
            if (!(draw_deck.isEmpty())) hand[i] = draw_deck.pop();
        }
        return hand;
    }
}


