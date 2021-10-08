import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class Deck {
    Stack<Card> deck;
    
    public Deck() {
        ArrayList<Card> list = new ArrayList<Card>();

        for(int i = 0; i < 52; i++) {
            Card card = new Card(i);
            list.add(card);
        }

        this.deck = shuffle(list);
    }

    private Stack<Card> shuffle(ArrayList<Card> list) {
        Stack<Card> stack = new Stack<Card>();
        while (list.size() > 0) {
            Random random = new Random();
            int randomIndex = random.nextInt(list.size());
            stack.add(list.remove(randomIndex));
        }
        return stack;
    }

    public Card drawCard() {
        return this.deck.pop();
    }
}
