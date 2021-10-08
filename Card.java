public class Card {
    private int number;

    public Card(int number) {
        this.number = number;
    }

    enum Suit {
        Club,
        Spade,
        Diamond,
        Heart
    }

    public Suit getSuit() {
        int suitNum = this.number / 13;
        Suit suit = null;
        switch(suitNum) {
            case 0:
                suit = Suit.Club;
                break;
            case 1:
                suit = Suit.Spade;
                break;
            case 2:
                suit = Suit.Diamond;
                break;
            case 3:
                suit = Suit.Heart;
                break;
        }
        return suit;
    }

    enum Color {
        Black,
        Red
    }

    public Color getColor() {
        if (this.number / 26 == 0) {
            return Color.Black;
        }
        else {
            return Color.Red;
        }
    }

    public int getValue() {
        return this.number % 13;
    }

    @Override
    public String toString() {
        int value = this.getValue();
        char face;
        if (value == 0) {
            face = 'A';
        }
        else if (value == 10) {
            face = 'J';
        }
        else if (value == 11) {
            face = 'Q';
        }
        else if (value == 12) {
            face = 'K';
        }
        else {
            face = (char) value;
        }
        return face + this.getColor().toString();
    }
}
