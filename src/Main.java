public class Main {
    public static void main(String[] args) {
        FindYear();
        installProgramm();
        findDistance();
    }
    public static int New() {
        return 2022;
    }
        public static void FindYear () {
            int year = New();
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("вискосный");
            } else {
                System.out.println("невискосный");
            }
        }

        public static void installProgramm () {
            int clientOS = 0;
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            int currentYear = New();
            if (currentYear < 2015) {
                System.out.println("установите облегчённую версию приложения ");
            } else {
                System.out.println("установите обычную версию приложения ");
            }
        }
        public static int distance(){
        return 95;
        }
        public static void findDistance() {
            int deliveryDistance = distance();
            if (deliveryDistance == 20) {
                System.out.println("Потребуется дней : 1");
            } else if (deliveryDistance > 20 && deliveryDistance < 60) {
                System.out.println("Потребуется дней: 2");
            } else if (deliveryDistance >=60 && deliveryDistance <100) {
                System.out.println("Потребуется дней: 3");
            }

        }
    }




