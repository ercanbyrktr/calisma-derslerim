package day04_test;

public class C03_test {
    public static void main(String[] args) {
        // bir onceki swap sorusunu bos kova kullanmadan yapin

        int sayi1=10;
        int sayi2=20;

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println("swap'dan sonra sayi1 : " + sayi1); // 20
        System.out.println("swap'dan sonra sayi2 : " + sayi2); // 10
    }
}
