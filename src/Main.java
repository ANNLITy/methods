import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        checkYear();
        callOs();
        installDistance();
    }
    public static void checkYear(){
        int CurrentYear = LocalDate.now().getYear();
        System.out.println(findYear(CurrentYear));
    }


    public static String findYear(int YEAR) {
        int year = YEAR;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            return "вискосный";
        } else {
            return "невискосный";
        }

    }

    public static void callOs(){
        String osName = "iOS";
        int currentYear = LocalDate.now().getYear();
        System.out.println(installProgramm(osName,currentYear));
    }

    public static String installProgramm(String osName, int currentYear) {

        // int clientOS = getClientOS(osName);
        if (osName.equals("iOS") && currentYear < 2022) {
            return "Установите версию приложения для iOS по ссылке \nУстановите облегчённую версию приложения ";
        }
        else if (!osName.equals("iOS") && currentYear < 2022) {
            return "Установите версию приложения для Android по ссылке \nУстановите облегчённую версию приложения";
        }
        else if (osName.equals("iOS") && currentYear >= 2022){
            return "Установите версию приложения для iOS по ссылке \nУстановите обычную версию приложения";
        }
        else {
            return "Установите версию приложения для Android по ссылке \nУстановите обычную версию приложени";
        }


    }

    public static void installDistance() {
        int deliveryDistance = 95;
        System.out.println(installDeliveryDate(deliveryDistance));

    }

    public static int findDistance(int BrandNewDistance) {
        int deliveryDistance = BrandNewDistance;
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            return 3;
        }

        return deliveryDistance;
    }

    public static String installDeliveryDate(int newDistance) {
        int dD = newDistance;
        int newDelivery = findDistance(dD);
        if (newDelivery == 1) {
            return "Потребуется дней : 1";
        } else if (newDelivery == 2) {
            return"Потребуестся дней : 2";
        } else  {
            return"Потребуется дней : 3";
        }



    }
}







