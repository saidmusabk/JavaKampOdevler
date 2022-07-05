public class Main {

    public static void main(String[] args) {
        char harf = 'C';

        //Uygulamada Bug var

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harf.");
                break;
            default:
                System.out.println("İnce Sesli Harf.");
        }
    }
}
