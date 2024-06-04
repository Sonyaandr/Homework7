public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int month = 0;
        int money = 0;
        while (money <= 2459000) {
            month += 1;
            money += 15000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
        }

        System.out.println("Задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        i = 10;
        System.out.println(" ");
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("Задание 3");
        long peopleContryY = 12000000;
        int year = 0;
        while (year < 11) {
            long birthRate = peopleContryY / 1000 * 17;
            long mortalityRate = 8;
            year++;
            long totalPopulation = peopleContryY + birthRate - mortalityRate;
            System.out.println("Год " + year + ", численность населения составляет " + totalPopulation);
            peopleContryY = totalPopulation;
        }
        System.out.println("Задание 4");
        month = 0;
        long contribution = 15000;
        while (contribution < 12000000) {
            long percent = (long) (contribution * 0.07);
            contribution += percent;
            month++;
            System.out.println("Месяц " + month + ", сумма во вкладе " + contribution);
        }
        System.out.println("Задание 5");
        month = 0;
        contribution = 15000;
        while (contribution < 12000000) {
            long percent = (long) (contribution * 0.07);
            contribution += +percent;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма во вкладе " + contribution);
            }
        }
        System.out.println("Задание 6");
        month = 0;
        long contribution1 = 15000;
        while (month <= 108) {
            long percent = (long) (contribution1 * 0.07);
            contribution1 += contribution1 + percent;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма во вкладе " + contribution1);
            }
        }
        System.out.println("Задание 7");
        int counter = 1;
        int day = 1;
        while (day < 32) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            day = day + 7;
            if (counter < 6) {
                counter++;
            } else {
                break;
            }
        }
        System.out.println("Задание 8");
        int nowYear = 2024;
        year = nowYear - 200;
        while ((year <= nowYear + 100) && (year >= nowYear - 200)) {
            System.out.println(year);
            year += 79;
        }
    }
}