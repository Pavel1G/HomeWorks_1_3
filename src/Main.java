public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {

        int clientOS = 0;

        System.out.println("Решение задания 1.");
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("------------------------------------------------");
        System.out.println();
    }

    public static void task2() {

        int clientOS = 1;
        int clientDeviceYear = 2015;

        System.out.println("Решение задания 2.");


        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("------------------------------------------------");
        System.out.println();
    }

    public static void task3() {

        int year = 604;

        System.out.println("Решение задания 3.");

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        System.out.println("------------------------------------------------");
        System.out.println();
    }

    public static void task4() {

        int deliveryDistance = 85;
        int deliveryDays = 0;

        System.out.println("Решение задания 4.");


        if (deliveryDistance <= 20) {
            deliveryDays++;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = deliveryDays + 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 3;
        }

        System.out.println("Потребуется дней: " + deliveryDays);

        System.out.println("------------------------------------------------");
        System.out.println();

    }

    public static void task5() {

        int monthNumber = 6;

        System.out.println("Решение задания 5.");

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого времени года не существует.");
        }
        System.out.println("------------------------------------------------");
        System.out.println();
    }

    public static void task6() {
        int age = 23;
        int salary = 58_000;
        int creditCap = 0;

        System.out.println("Решение задания 6.");
        if (age >= 23) {
            creditCap = salary * 3;
        } else {
            creditCap = salary * 2;
        }

        if (salary >= 50_000) {
            creditCap *= 1.2;
        } else if (salary >= 80_000) {
            creditCap *= 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditCap + " рублей.");
        System.out.println("------------------------------------------------");
        System.out.println();
    }

    public static void task7() {
        int age = 23;
        int salary = 90_000;
        int wantedSum = 330_000;

        double basicRate = 0.1;
        int creditTermMonth = 12;
        double monthlyPaymentMax = salary * 0.5;

        if (age < 23) {
            basicRate += 0.01;
        } else if (age >= 23 && age < 30) {
            basicRate += 0.005;
        }
        if (salary > 80_000) {
            basicRate -= 0.07;
        }

        System.out.println("Решение задания 7.");

        double monthlyPayment = wantedSum * (1 + basicRate) / 12;

        if (monthlyPayment > monthlyPaymentMax) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + (int) monthlyPaymentMax + " рублей. " +
                    "Платеж по кредиту " + monthlyPayment + " рублей. Отказано.");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + (int) monthlyPaymentMax + " рублей. " +
                    "Платеж по кредиту " + monthlyPayment + " рублей. Одобрено.");
        }

        System.out.println("------------------------------------------------");
        System.out.println();
    }
}
