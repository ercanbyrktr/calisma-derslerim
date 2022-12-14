package day14_test;

public class C07_SwitchCase {
    public static void main(String[] args) {
        /*
        gunleri gosterebilen bir program yazin
        gun Pazartesi veya Sali ise:
        Java dersi gunleri

        gun Persembe veya Cuma ise:
        Selenyum dersi gunleri

        gun Carsamba veya Cumartesi ise:
        SQL dersi gunleri

        aksi halde: izin gunu
        (if deyimini kullanmayin)
         */


        String gun = "Pazartesi";

        switch (gun) {
            case "Pazartesi":
            case "Sali":
                System.out.println("java dersi");
                break;
            case "Carsamba":
            case "Cumartesi":
                System.out.println("SQL dersi");
                break;
            case "Persembe":
            case "Cuma":
                System.out.println("Selenyum dersi");
                break;
            default:
                System.out.println("izin gunu");
        }
    }
}
