package Day_40_Review;

import java.util.Random;

public class Dice_mein {
    public static void main(String[] args) {

        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Player oleg = new Player("Олег");
        Player denis = new Player("Денис");

        oleg.playerRoll(dice1);
        System.out.println("===================");
        denis.playerRoll(dice2);

        if (dice1.getTotal() > dice2.getTotal()){
            System.out.println("=====================\n"+ oleg.getName() + " выиграл");
        }else if (dice2.getTotal() > dice1.getTotal()){
            System.out.println("=====================\n"+ denis.getName() + " выиграл");
        }else {
            System.out.println("=====================\nНичья");
        }

    }
}
 class Dice {

    public int die1;
    public int die2;

    public Dice() {

    }

    public void roll(){
        Random random = new Random();
        die1 = random.nextInt(6-1) + 1;
        die2 = random.nextInt(6-1) + 1;
    }

    public int getDie1(){
        return die1;
    }

    public int getDie2(){
        return die2;
    }

    public int getTotal(){
        return die1 + die2;
    }
}
 class Player {

    public String name;

    public Player(String name) {
        this.name = name;
    }

    public void playerRoll(Dice dice){
        System.out.println("Игрок " + name + " бросает кости");
        dice.roll();
        System.out.println("У игрока " + name + " очки " + dice.getDie1() + " + " + dice.getDie2() + " = " + dice.getTotal() );
    }

    public String getName(){
        return name;
    }
}
