public class Main {

    public static void main(String[] args) {
	    //220-284
        int number = 220;
        int number2 = 284;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }

        if (total == number2) {
            System.out.println("Arkadaş sayıdır");
        } else {
            System.out.println("Arkadaş sayı değildir");
        }


    }
}
