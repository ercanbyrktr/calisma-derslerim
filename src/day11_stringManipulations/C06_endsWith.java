package day11_stringManipulations;

public class C06_endsWith {
    public static void main(String[] args) {
         /*
        Soru 1) Kullanicidan email adresini girmesini isteyin,
        mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
        @gmail.com ile bitiyorsa "Email adresiniz kaydedildi",
        @gmail.com ile bitmiyorsa lutfen yazimi kontrol edin yazdirin

         */

        String input="ercan@gmail.com";

        if (!input.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz");
        }else if(input.endsWith("@gmail.com")){
            System.out.println("Email adresiniz kaydedildi");
        }else{
            System.out.println("Lutfen yazimi kontrol edin");
        }
    }
}
