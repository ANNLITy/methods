import java.time.Year;

public class Main {
    public static void main(String[] args) {

        findYear();
        installProgramm();
        installDelivery();
    }


    public static void findYear() {
        int year = installYear();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("вискосный");
        } else {
            System.out.println("невискосный");
        }
    }

    public static int installYear() {
        return 2022;
    }

    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void installProgramm() {
        String osName = "iOS";
        int clientOS = getClientOS(osName);
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        int currentYear = installYear();
        if (currentYear < 2022) {
            System.out.println("установите облегчённую версию приложения ");
        } else {
            System.out.println("установите обычную версию приложения ");
        }
    }

    public static int installDistance() {
        return 90;
    }

    public static int findDistance() {
        int deliveryDistance = installDistance();
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            return 3;
        }

        return deliveryDistance;
    }

    public static void installDelivery() {
        int newDelivery = findDistance();
        if (newDelivery == 1) {
            System.out.println("Потребуется дней : 1");
        } else if (newDelivery == 2) {
            System.out.println("Потребуестся дней : 2");
        } else if (newDelivery == 3) {
            System.out.println("Потребуется дней : 3");
        }


    }
}







