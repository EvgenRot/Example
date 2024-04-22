package Day_60_FinalKeyWordAndVariableMethod.PokerCard;
    /*
    Объект типа Hand представляет карточную комбинацию.
    Карты относятся к классу Card. Рука при создании пуста, и к ней можно добавить любое количество карт.
    */

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand; // Карты в руке.

    //Создайте руку, которая изначально пуста.
    public Hand() {
        hand = new ArrayList<>();
    }

    //Удаляет все карты из руки, оставив ее пустой.
    public void clear() {
        hand.clear();
    }

    public void addCard(Card c) {
        if (c == null)
            throw new NullPointerException("Невозможно добавить в руку нулевую карту.");
        hand.add(c);
    }

    public void removeCard(Card c) {
        hand.remove(c);
    }

    public void removeCard(int position) {
        if (position < 0 || position >= hand.size())
            throw new IllegalArgumentException("Позиция не существует в наличии:" + position);
        hand.remove(position);
    }

    public int getCardCount() {
        return hand.size();
    }

    public Card getCard(int position) {
        if (position < 0 || position >= hand.size())
            throw new IllegalArgumentException("Позиция не существует в наличии:" + position);
        return hand.get(position);
    }

    /*
    Сортирует карты в руке так, чтобы карты одной масти
    сгруппированы вместе, а внутри масти карты отсортированы по значению.
    Обратите внимание, что считается, что тузы имеют наименьшее значение 1.
     */
    public void sortBySuit() {
        ArrayList<Card> newHand = new ArrayList<>();
        while (hand.size() > 0) {
            int pos = 0; // Позиция минимальной карты.
            Card c = hand.get(0); //Минимальная карта.
            for (int i = 1; i < hand.size(); i++) {
                Card c1 = hand.get(i);
                if (c1.getSuit() < c.getSuit() || (c1.getSuit() == c.getSuit() && c1.getValue() < c.getValue())) {
                    pos = i;
                    c = c1;
                }
            }
            hand.remove(pos);
            newHand.add(c);
            hand = newHand;
        }
    }

    public void sortByValue() {
        ArrayList<Card> newHand = new ArrayList<Card>();
        while (hand.size() > 0) {
            int pos = 0;  // Position of minimal card.
            Card c = hand.get(0);  // Minimal card.
            for (int i = 1; i < hand.size(); i++) {
                Card c1 = hand.get(i);
                if (c1.getValue() < c.getValue() ||
                        (c1.getValue() == c.getValue() && c1.getSuit() < c.getSuit())) {
                    pos = i;
                    c = c1;
                }
            }
            hand.remove(pos);
            newHand.add(c);
        }
        hand = newHand;
    }


}
