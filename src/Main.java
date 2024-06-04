public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int month = 0;
        int money = 0;
        while (money <= 2459000){
            month = month + 1;
            money = money + 15000;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + money +  " рублей");
        System.out.println("Задание 2");//помогите в этом задании сделать так, чтобы ответ выводился в строчку или тут можно использовать цикл do-while
        int i = 1;
        while (i<=10){
            System.out.println(i + " ");
            i++;
        }
        i=10;
        while (i>0){
            System.out.println(i + " ");
            i--;
        }
        System.out.println("Задание 3");
        long peopleContryY = 12000000;
        int year = 0;
        while (year < 11){
            year++;// в критериях оценки написано про инициализацию переменных смертности и т.д. а все в одну операцию запихнула, это плохо?
            peopleContryY = peopleContryY+peopleContryY/1000*17-8;//вопрос смертность 8 человек на каждую тысячу или просто каждый год?
            System.out.println("Год " + year + ", численность населения составляет " + peopleContryY);
        }
        System.out.println("Задание 4");
        month = 0;
        long contribution = 15000;
        while (contribution<12000000){
            long percent = (long) (contribution * 0.07);
            contribution = contribution + percent;
            month++;
            System.out.println("Месяц " + month + ", сумма во вкладе " + contribution);
        }
        System.out.println("Задание 5");
        month = 0;
        contribution = 15000;
        while (contribution<12000000){
            long percent = (long) (contribution * 0.07);
            contribution = contribution + percent;
            month++;
            if (month%6==0) {
                System.out.println("Месяц " + month + ", сумма во вкладе " + contribution);
            }
        }
        System.out.println("Задание 6");
        month = 0;
        long contribution1 = 15000;
        while (month <= 108){
            long percent = (long) (contribution1 * 0.07);
            contribution1 = contribution1 + percent;
            month++;
            if (month%6==0)
            System.out.println("Месяц " + month + ", сумма во вкладе " + contribution1);
        }
        System.out.println("Задание 7");
        int nomerPt = 1;
        int day = 1;
        while(day<32){
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            day = day + 7;
        }
        System.out.println("Задание 8");// для этой задачи нужно брать года с 1824 по 2024? а в какой первый год пролетела комета? от какой даты начинать отсчет?

    }
}