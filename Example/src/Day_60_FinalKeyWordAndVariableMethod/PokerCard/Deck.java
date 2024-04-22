package Day_60_FinalKeyWordAndVariableMethod.PokerCard;

public class Deck {
    //Массив из 52 или 54 карт. Колода из 54 карт содержит два джокера в дополнение к 52 картам обычной покерной колоды.
    private Card[] deck;

    //Отслеживает количество карт, которые были сданы из колоды на данный момент.
    private int cardUsed;

    //Конструктор. Создайте неперетасованную колоду карт.
    public Deck(){
        this(false);

    }

    public Deck(boolean includeJokers){
        if (includeJokers)
            deck = new Card[54];
        else
            deck = new Card[52];
        int cardCt = 0; //Сколько карт было создано на данный момент.
        for (int suit = 0; suit<=3; suit ++){
            for (int value = 1; value<=13; value++){
                deck[cardCt] = new Card(value,suit);
                cardCt++;
            }
        }
        if (includeJokers){
            deck[52] = new Card(1, Card.JOKER);
            deck[53] = new Card(2, Card.JOKER);
        }
        cardUsed = 0;
    }
    //Положите все использованные карты обратно в колоду и перетасуйте ее в случайном порядке.
    public void shuffle(){
        for (int i = deck.length-1; i>0; i--){
            int rand = (int) (Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardUsed = 0;

    }
    //По мере раздачи карт из колоды количество оставшихся карт уменьшается.
    // Эта функция возвращает количество карт, оставшихся в колоде.
    public int cardsLeft(){
        return deck.length - cardUsed;
    }
    //Сдает одну карту из колоды и возвращает ее. @throws IllegalStateException, если карта больше не осталась.
    public Card dealCard(){
        if (cardUsed == deck.length)
            throw new IllegalStateException("В колоде не осталось карт.");
        cardUsed++;
        return deck[cardUsed-1];

    }

    public boolean hasJokers(){
        return deck.length == 54;
    }


}
