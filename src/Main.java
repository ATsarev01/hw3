public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte apple = 100;
        System.out.println("Значение переменной apple с типом byte равно " + apple);
        int orange = 50000;
        System.out.println("Значение переменной orange с типом int равно " + orange);
        short bananas = 20000;
        System.out.println("Значение переменной bananas с типом short равно " + bananas);
        long potato = 3875777745452L;
        System.out.println("Значение переменной potato с типом Long равно " + potato);
        double peach = 0.52;
        System.out.println("Значение переменной peach с типом float равно " + peach);
        float cherry = 23;
        System.out.println("Значение переменной cherry с типом float равно " + cherry);

    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println (b);
        System.out.println (c);
        System.out.println(d);
        System.out.println (e);
        System.out.println (f);
        System.out.println (g);

        System.out.println("Задача 3");
            byte classA = 23;
            byte classB = 27;
            byte classC = 30;
            int allStudents = classA + classB + classC;
            short allPaper = 480;
            System.out.println("На каждого ученика рассчитано " + allPaper/allStudents + " листов бумаги");

            System.out.println("Задача 4");
        byte min2 = 16;
        int min20 = min2 * 10;
        System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок");
        int hour1 = min20 * 3;
        int hour24 = hour1 * 24;
        System.out.println("За сутки машина произвела " + hour24 + " штук бутылок");
        int day3 = hour24 * 3;
        System.out.println("За три дня машина произвела " + day3 + " штук бутылок");
        int month = hour24 * 30;
        System.out.println("За месяц машина произвела " + month + " штук бутылок");

        System.out.println("Задача 5");

        byte allDye = 120;
        byte whiteDye = 2;
        byte brownDye = 4;
        int classDye = whiteDye + brownDye;
        int allClass = allDye / classDye;
        int allWhite = allClass * whiteDye;
        int allBrown = allClass * brownDye;
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");

        System.out.println("Задача 6");

        short bananas = 5 * 80;
        short milk = 200 / 100 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int breakFast = bananas + milk + iceCream + eggs;

        System.out.println("Вес спортзавтрака составляет " + breakFast + " граммов");

        System.out.println("Задача 7");

        byte weight = 7;
        int gram = 7 * 1000;
        int day250 = gram / 250;
        int day500 = gram/500;
        System.out.println(day250 + " дней уйдет на похудение, если спортмен будет терять по 250 граммов в день");
        System.out.println(day500 + " дней уйдет на похудение, если спортмен будет терять по 500 граммов в день");

        System.out.println("Задача 8");

        int masha = 67760;
        int denis = 83690;
        int kris = 76230;

        int mashaSalary = masha / 100 * 10;
        int mashaAllSalary = masha + mashaSalary;
        int mashaYear = (mashaAllSalary * 12) - (masha * 12);

        System.out.println("Маша теперь получает " + mashaAllSalary + " рублей. Годовой доход вырос на " + mashaYear + " рублей");


        int denisSalary = denis / 100 * 10;
        int denisAllSalary = denis + denisSalary;
        int denisYear = (denisAllSalary * 12) - (denis * 12);

        System.out.println("Денис теперь получает " + denisAllSalary + " рублей. Годовой доход вырос на " + denisYear + " рублей");

        int krisSalary = kris / 100 * 10;
        int krisAllSalary = kris + krisSalary;
        int krisYear = (krisAllSalary * 12) - (kris * 12);

        System.out.println("Кристина теперь получает " + krisAllSalary + " рублей. Годовой доход вырос на " + krisYear + " рублей");

















    }
}