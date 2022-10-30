public class Main {
    public static void main(String[] args) {
        //Task №1 and №2
        System.out.println("Задача №1 и №2");
        int clientOS = 1;
        int productionYear = 2014;
        if (clientOS == 0 && productionYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по *ссылке*.");
            }
        else if (clientOS == 0 && productionYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по *ссылке*.");
            }
        else if  (clientOS == 1 && productionYear >= 2015) {
            System.out.println("Установите версию приложения для Android по *ссылке*.");
        }
        else if (clientOS == 1 && productionYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по *ссылке*.");
            }
        else {
            System.out.println("Мы не смогли определить ОС вашего телефона.");
        }

        //Task №3
        System.out.println("");
        System.out.println("Задача №3");

        }
}