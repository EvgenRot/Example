package Day_60_FinalKeyWordAndVariableMethod.PokerCard;

/*
Объект типа Card представляет собой игральную карту из стандартной колоды покера, включая джокеров.
У карты есть масть: пики, червы, бубны, крести или джокер. Пика, черва, бубна или крести имеют одно из 13 значений:
туз, 2, 3, 4, 5, 6, 7,8, 9, 10, валет, дама или король. Обратите внимание, что «туз» считается наименьшим значением.
Джокер также может иметь связанное значение; это значение может быть любым и может использоваться для отслеживания
нескольких разных джокеров.
 */
public class Card {

    public static final int SPADES = 0; // пики
    public static final int HEARTS = 1; // черви
    public static final int DIAMONDS = 2; // бубны
    public static final int CLUBS = 3; // крести
    public static final int JOKER = 4; // Жокер

    public final static int ACE = 1;      // Коды для нецифровых карт.
    public final static int JACK = 11;    //Карты со 2 по 10 имеют числовые значения своих кодов.
    public final static int QUEEN = 12;   //
    public final static int KING = 13;

    /*
    Масть этой карты, одна из констант ПИКИ, ЧЕРВИ, БУБНЫ, КРЕСТИ или ДЖОКЕР.
    Масть не может быть изменена после создания карты.
     */
    private final int suit;
    /*
    Значение карты. Для обычной карты это одно из значений
    от 1 до 13, где 1 представляет ТУЗ. Для ДЖОКЕРА значение
    может быть что угодно. Значение не может быть изменено после создания карты.
     */
    private final int value;

    /*
    Создает джокер со связанным значением 1. (Обратите внимание, что «new Card()»
     эквивалентно «new Card(1,Card.JOKER)».)
     */
    public Card(){
        suit = JOKER;
        value = 1;
    }

    public Card(int theValue,int theSuit){
        if (theSuit != SPADES && theSuit != HEARTS && theSuit != DIAMONDS && theSuit != CLUBS && theSuit != JOKER)
            throw new IllegalArgumentException("Недействительная масть");
        if (theSuit != JOKER && (theValue<1 || theSuit>13))
            throw new IllegalArgumentException("Недействительное значение");
        value = theValue;
        suit = theSuit;

    }

    public int getSuit(){
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String getSuitAsString(){
        switch (suit){
            case SPADES: return "Spades";
            case HEARTS: return "Hearts";
            case DIAMONDS: return "Diamonds";
            case CLUBS: return "Clubs";
            default: return "Joker";
        }
    }

    public String getValueAsString(){
        if (suit == JOKER)
            return "" + value;
        else {
            switch (value){
                case 1: return "Ace";
                case 2: return "2";
                case 3: return "3";
                case 4: return "4";
                case 5: return "5";
                case 6: return "6";
                case 7: return "7";
                case 8: return "8";
                case 9: return "9";
                case 10: return "10";
                case 11: return "Jack";
                case 12: return "Queen";
                default:return "King";
            }
        }
    }

    @Override
    public String toString() {
        if (suit == JOKER){
            if (value == 1)
                return "Joker";
            else
                return "Joker #" + value;
        }else
            return getValueAsString() + " of " + getSuitAsString();
    }
}