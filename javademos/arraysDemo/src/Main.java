public class Main {

    public static void main(String[] args) {
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Said";
        ogrenciler[1] = "Ali";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Mustafa";

        for (int i = 0; i<ogrenciler.length;i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("------------------------------------------");
        //Bu yöntem daha çok kullanılır.
        for (String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }

    }
}
