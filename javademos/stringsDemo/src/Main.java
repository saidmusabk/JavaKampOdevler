public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5.eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!")); //Birleştirmeye yarar
        System.out.println(mesaj.startsWith("b"));  // ne ile başlıyor
        System.out.println(mesaj.endsWith("."));   // ne ile bitiyor
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a')); // elemanın kaçıncı eleman olduğunu verir ilk bulduğu elemanı verir // fazla kullanılır
        System.out.println(mesaj.lastIndexOf("e"));

        String yeniMesaj = mesaj.replace(' ','_');
        System.out.println(yeniMesaj); //alttaki ile aynı işe yarar
        System.out.println(mesaj.replace(' ','_'));

        System.out.println(mesaj.substring(2)); // 2.indeksten sonra başla
        System.out.println(mesaj.substring(2,5)); // şuradan şuraya kadar yaz

        for (String kelime : mesaj.split(" ")){ //girilen sembol vs. ile ayırmak
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); //mesajı küçük harfe çevirir
        System.out.println(mesaj.toUpperCase()); // tersini yapar

        System.out.println(mesaj.trim()); //Baiındaki ve sonundaki boşlukları atmaya yarar.


    }
}
