public class Main {
    public static void main(String[] args) {
        //Task №1
        System.out.println("Задача №1");
        int clientOS = 0;
        String client = (clientOS == 0) ? "Установите версию приложения для iOS по *ссылке*." : "Установите версию приложения для Android по *ссылке*.";
        System.out.println(client);

        //Task №2
        System.out.println("");
        System.out.println("Задача №2");
        int clientOS1 = 1;
        int productionYear = 2014;
        if (clientOS1 == 0 && productionYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по *ссылке*.");
        }
        else if (clientOS1 == 0 && productionYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по *ссылке*.");
        }
        else if  (clientOS1 == 1 && productionYear >= 2015) {
            System.out.println("Установите версию приложения для Android по *ссылке*.");
        }
        else if (clientOS1 == 1 && productionYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по *ссылке*.");
        }
        else {
            System.out.println("Мы не смогли определить ОС вашего телефона.");
        }

        //Task №3
        System.out.println("");
        System.out.println("Задача №3");
        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        //Task №4
        System.out.println("");
        System.out.println("Задача №4");
        int deliveryDistance = 95;
        int deliveryDistanceForFirstDay = 20;
        int deliveryDistanceFor1Day = 40;
        int deliveryPeriod1 = deliveryDistance / deliveryDistanceFor1Day + 1;
        int deliveryPeriod2 = deliveryDistance / deliveryDistanceFor1Day + 2;
        if (deliveryDistance % deliveryDistanceFor1Day < deliveryDistanceForFirstDay) {
            System.out.println("Для доставки потребуется дней: " + deliveryPeriod1);
        } else {
            System.out.println("Для доставки потребуется дней: " + deliveryPeriod2);
        }
        //Task №5
        System.out.println("");
        System.out.println("Задача №5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень.");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

        }
}