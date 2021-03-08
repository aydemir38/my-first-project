public class metodlar {
    public static void main(String[] args) {
       mesajVer();
       mesajVer();
       mesajVer();
       mesajVer("ALI");
       topla(6,3);
        topla(9,3);
        topla(68,3);
    }



    // DRY -Do not Repeat Yourself





    public static void mesajVer(){
        System.out.println("Merhaba ");
        // onlarca satir oldugunu düsün

    }
    public static void mesajVer(String isim){
        System.out.println("Merhaba "+ isim);
    }
    public static void topla(int sayi1,int sayi2){
        int toplam =sayi1 + sayi2;
        System.out.println("Toplam : "+ toplam);

    }
    //toplanan iki sayinin % 10 unu bul
}
