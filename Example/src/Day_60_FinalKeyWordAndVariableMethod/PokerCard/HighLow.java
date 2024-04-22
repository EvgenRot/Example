package Day_60_FinalKeyWordAndVariableMethod.PokerCard;

/*
Эта программа позволяет пользователю играть в HighLow, простую карточную игру,
описанную в операторе вывода в начале метода main(). После того, как пользователь
сыграет несколько игр, сообщается средний балл пользователя.
 */

import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Эта программа позволяет вам играть в простую карточную игру HighLow. 
                Карта сдается из колоды карт. Вам предстоит предугадать, будет ли следующая
                карта выше или ниже. Ваш очки в игре — это количество правильных предсказаний, 
                которые вы сделали, прежде чем ошиблись.
                """);

        int gamesPlayed = 0; //Количество игр, в которые сыграл пользователь.
        int sumOfScores = 0; //Сумма всех очков во всех сыгранных играх.
        double averageScore; // Средний балл, вычисляемый путем деления sumOfScores на количество сыгранных игр.
        char playAgain; // сораняет ответ пользователя, когда его спрашивают, хочет ли он сыграть в другую игру.

        do{
            int scoreThisGame;
            scoreThisGame = play();
            sumOfScores+=scoreThisGame;
            gamesPlayed++;
            System.out.println("Хотите играть еще ?");
            playAgain = scanner.next().charAt(0);
            playAgain = Character.toUpperCase(playAgain);
            if (playAgain != 'Y' && playAgain != 'N')
                System.out.println("Пожалуйста, ответьте Y или N: ");
        } while (playAgain != 'N');
    }

    private static int play() {
        Deck deck = new Deck(); //Получить новую колоду карт и сохранить ссылку на нее в переменной deck.
        Card currentCard; // Текущая карта, которую видит пользователь.
        Card nextCard; // Следующая карта в колоде. Пользователь пытается предсказать, будет ли это выше или ниже текущей карты.
        int correctGuesses; //Количество правильных угаданий, сделанных пользователем. В конце игры это будет очки пользователя
        char guess; //Предположение пользователя. «H», если пользователь прогнозирует, что следующая карта будет выше, «L», если
        // пользователь прогнозирует, что она будет ниже.

        deck.shuffle();
        correctGuesses = 0;
        currentCard = deck.dealCard();
        System.out.println("Первая карта – это " + currentCard);

        while (true) {
            /* Получите предсказание пользователя: «H» или «L» (или «h» или «l»).*/
            System.out.println("Будет ли следующая карта выше (H) или ниже (L)?");
            Scanner scanner = new Scanner(System.in);
            do {
                guess = scanner.next().charAt(0);
                guess = Character.toUpperCase(guess);
                if (guess != 'H' && guess != 'L')
                    System.out.println("Пожалуйста, ответьте H или L: ");
            } while (guess != 'H' && guess != 'L');

            /* Получите следующую карточку и покажите ее пользователю.*/
            nextCard = deck.dealCard();
            System.out.println("Следующая карта " + nextCard);

            /*Проверьте прогноз пользователя.*/
            if (nextCard.getValue() == currentCard.getValue()) {
                System.out.println("Значение такое же, как и у предыдущей карты.");
                System.out.println("Ничья. Вы проиграли");
                break;
            } else if (nextCard.getValue() > currentCard.getValue()) {
                if (guess == 'H') {
                    System.out.println("Ваш прогноз верный.");
                    correctGuesses++;
                } else {
                    System.out.println("Ваш прогноз оказался неверным.");
                    break;
                }
            }else {
                if (guess == 'L'){
                    System.out.println("Ваш прогноз верный.");
                    correctGuesses++;
                }else {
                    System.out.println("Ваш прогноз оказался неверным.");
                    break;
                }
            }
            currentCard = nextCard;
            System.out.println();
            System.out.println("карта " + currentCard);
        } // end while loop

        System.out.println();
        System.out.println("Игра окончена.");
        System.out.println("Вы сделали " + correctGuesses + " правильные прогнозы");
        System.out.println();
        return correctGuesses;
    }

}
