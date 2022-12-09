package day10_stringManipulation;

public class C03_equals {
    public static void main(String[] args) {

        String str1= "Ali Can";
        String str2= "Ali CAN";
        String str3= "Ali Can" + "";
        String str4= "Ali Can";
        String str5= new String("Ali Can");

        System.out.println(str1==str2); // False

        System.out.println(str1==str3); // True
        System.out.println(str1.equals(str3)); // True

        System.out.println(str1==str5); //  False
        System.out.println(str1.equals(str5)); //  True

        /*
        Stringlerde ayni String olsa bile == herzaman calismaz
        emin olmak isterseniz equals () kullanmalisiniz

        equals () kullandigimizda dikkat edecegimiz TEK SEY Metinlerin bire bir ayni olmasidir
         */

    }
}
