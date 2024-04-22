package Day_31_Random_Math_Date;

public class Random {
    public static void main(String[] args) {


        java.util.Random random = new java.util.Random();
        int randomInt = random.nextInt();
        System.out.println("Random zahle in diapason Int: " + randomInt);

        int randomIntLimited = random.nextInt(10);
        System.out.println("Random bis 10: " + randomIntLimited);

        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);

        boolean randomBoulean = random.nextBoolean();
        System.out.println("Random Boulean : " + randomBoulean);

        int low = 5;
        int max = 10;
        int zahle = random.nextInt(max - low) + low;
        System.out.println("Random : " + zahle);
    }

}
