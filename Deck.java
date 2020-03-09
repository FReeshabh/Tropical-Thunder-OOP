import java.util.Random;

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
class deck {
    public int num_decks;
    public boolean action_cards;
    boolean shuffle_together;

    //Enter Description Here
    Card[] populate_deck() {
        int num_cards;
        if (action_cards) {
            num_cards = num_decks * 108;
        } else {
            num_cards = num_decks * 76;
        }

        Card[] raw_deck = new Card[num_cards];
        int n = 0;

        for (int j = 0; j < num_decks; j++) {
            Card c = new Card();

            c.setWorkout("Push Ups"); // Add 10
            c.setAction("null");
            c.setType(false);
            for (int i = 0; i < 10; i++) {
                c.setReps(i);
                raw_deck[n++] = c;
            }
            for (int i = 1; i < 10; i++) { // Add 9
                c.setReps(i);
                raw_deck[n++] = c;
            }

            c.setWorkout("Squat");
            c.setAction("null");
            c.setType(false);
            for (int i = 0; i < 10; i++) { // Same
                c.setReps(i);
                raw_deck[n++] = c;
            }
            for (int i = 1; i < 10; i++) { // Same
                c.setReps(i);
                raw_deck[n++] = c;
            }

            c.setWorkout("Sit Ups");
            c.setAction("null");
            c.setType(false);
            for (int i = 0; i < 10; i++) { // Same
                c.setReps(i);
                raw_deck[n++] = c;
            }
            for (int i = 1; i < 10; i++) { // Same
                c.setReps(i);
                raw_deck[n++] = c;
            }

            c.setWorkout("Lounges");
            c.setAction("null");
            c.setType(false);
            for (int i = 0; i < 10; i++) { // Same
                c.setReps(i);
                raw_deck[n++] = c;
            }
            for (int i = 1; i < 10; i++) { // Same
                c.setReps(i);
                raw_deck[n++] = c;
            }

            if (action_cards) {
                Card a = new Card();
                a.setWorkout("Push Ups");
                a.setType(true);
                a.setReps(null);
                for (int i = 0; i < 2; i++) { // Add 8
                    a.setAction("SKIP");
                    raw_deck[n++] = a;
                    a.setAction("DRAW TWO");
                    raw_deck[n++] = a;
                    a.setAction("REVERSE");
                    raw_deck[n++] = a;
                }
                a.setWorkout("Squat");
                a.setType(true);
                a.setReps(null);
                for (int i = 0; i < 2; i++) { // Same
                    a.setAction("SKIP");
                    raw_deck[n++] = a;
                    a.setAction("DRAW TWO");
                    raw_deck[n++] = a;
                    a.setAction("REVERSE");
                    raw_deck[n++] = a;
                }
                a.setWorkout("Sit Ups");
                a.setType(true);
                a.setReps(null);
                for (int i = 0; i < 2; i++) { // Same
                    a.setAction("SKIP");
                    raw_deck[n++] = a;
                    a.setAction("DRAW TWO");
                    raw_deck[n++] = a;
                    a.setAction("REVERSE");
                    raw_deck[n++] = a;
                }
                a.setWorkout("Lounges");
                a.setType(true);
                a.setReps(null);
                for (int i = 0; i < 2; i++) { // Same
                    a.setAction("SKIP");
                    raw_deck[n++] = a;
                    a.setAction("DRAW TWO");
                    raw_deck[n++] = a;
                    a.setAction("REVERSE");
                    raw_deck[n++] = a;
                }
                a.setWorkout("Rainbow");
                a.setType(true);
                a.setReps(null);
                for (int i = 0; i < 4; i++) {
                    a.setAction("Wild");
                    raw_deck[n++] = a;
                    a.setAction("Wild Draw 4");
                    raw_deck[n++] = a;
                }
            }
        }
        return raw_deck;
    }

    // Enter description here
    Stack shuffle(Card[] raw_deck) {
        Stack draw_deck = new Stack();
        Random rand = new Random();
        int num_cards;

        if (action_cards) {
            num_cards = 108;
        } else {
            num_cards = 76;
        }

        if (!shuffle_together) {
            switch (num_decks) {
                case 1:
                    for (int i = 0; i < num_cards; i++) {
                        int r = i + rand.nextInt(num_cards - i);

                        Card temp = raw_deck[r];
                        raw_deck[r] = raw_deck[i];
                        raw_deck[i] = temp;
                    }
                case 2:
                    for (int i = 0; i < num_cards; i++) {
                        int r = i + rand.nextInt(num_cards - i);

                        Card temp = raw_deck[r];
                        raw_deck[r] = raw_deck[i];
                        raw_deck[i] = temp;
                    }
                    for (int i = num_cards; i < (2 * num_cards); i++) {
                        int r = i + rand.nextInt(num_cards - i);

                        Card temp = raw_deck[r];
                        raw_deck[r] = raw_deck[i];
                        raw_deck[i] = temp;
                    }
                case 3:
                    for (int i = 0; i < num_cards; i++) {
                        int r = i + rand.nextInt(num_cards - i);

                        Card temp = raw_deck[r];
                        raw_deck[r] = raw_deck[i];
                        raw_deck[i] = temp;
                    }
                    for (int i = num_cards; i < (2 * num_cards); i++) {
                        int r = i + rand.nextInt(num_cards - i);

                        Card temp = raw_deck[r];
                        raw_deck[r] = raw_deck[i];
                        raw_deck[i] = temp;
                    }
                    for (int i = (2 * num_cards); i < (3 * num_cards); i++) {
                        int r = i + rand.nextInt(num_cards - i);

                        Card temp = raw_deck[r];
                        raw_deck[r] = raw_deck[i];
                        raw_deck[i] = temp;
                    }
            }
        } else {
            for (int i = 0; i < num_cards * num_decks; i++) {
                int r = i + rand.nextInt((num_cards * num_decks) - i);

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

    Card[] drawNextHand(Stack draw_deck) {
        Card[] hand = new Card[7];
        for (int i = 0; i < 7; i++) {
            if (!(draw_deck.isEmpty())) hand[i] = draw_deck.pop();
        }
        return hand;
    }

}
