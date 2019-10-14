package sk.itsovy.studnicka.vehicle;

import org.w3c.dom.ls.LSOutput;
import sk.itsovy.studnicka.other.FreeClass;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();

        Mobile mobile1 = new Mobile("Huawei", "Honor 9", "0918116112");
        Mobile mobile2 = new Mobile("Xiomy", "MI9", "0947774634");

        Vehicle car1 = new Vehicle("Skoda", "Fabia");
        Vehicle car2 = new Vehicle("Honda", "Civic");

        Calculator calculator = new Calculator("Casio");

        FreeClass freeClass1 = new FreeClass();

        //---------------------------------------------------------------
        person1.setMobile(mobile1);
        person1.setAge(33);
        person1.setName("Vladimir");
        person1.setGander(true);
        person1.setCalculator(calculator);

        person2.setAge(67);
        person2.setCalculator(calculator);
        person2.setName("Martina");
        person2.setGander(false);


        System.out.println(person1);

        car1.setOwner(person1);
        car1.setKw(78);
        car1.calclulate();

        car2.setOwner(person2);
        car2.setHp(78);
        car2.calclulate();

/**
 System.out.println("Birth Year: " + person1.getBirthYear());
 System.out.println("Fee for vehicle: " + car1.getFeeForVehicle());
 System.out.println("KW for vehicle: " + car1.getKw());
 System.out.println("HP for vehicle: " + car1.getHp());
 System.out.println("Name: " + person1.getName());
 System.out.println("Gander: " + person1.getMaleGander());

 System.out.println("Birth Year: " + person2.getBirthYear());
 System.out.println("Fee for vehicle: " + car2.getFeeForVehicle());
 System.out.println("KW for vehicle: " + car2.getKw());
 System.out.println("HP for vehicle: " + car2.getHp());
 System.out.println("Name: " + car2.getOwner().getName());
 System.out.println("Gander: " + person2.getFemaleGander());

 System.out.println();
 if (person1.hasMobile())
 System.out.println("Phone number: " + person1.getMobile().getPhoneNumber());
 else
 System.out.println("Person has no mobile.");
 person1.print();
 if (person1.hasCalculator()) {
 calculator.turnOn();
 System.out.println(person1.getCalculator().add(2, 5));
 calculator.turnOn();
 System.out.println(person1.getCalculator().convertCmtoInch(15));
 System.out.println(person1.getCalculator().calculateCircleArea(5));
 System.out.println("------------------------------");
 System.out.println(person1.getCalculator().calculateRectangleArea(2, 7));
 System.out.println(person1.getCalculator().calculateRectangleRadiusOfCircle(2, 3, 7));
 System.out.println(person1.getCalculator().calculateConeVolume(3, 7));

 }

 freeClass1.sayHello();
 freeClass1.sayNHello(7);

 System.out.println("free class get round number: " + freeClass1.getEvenNumber(13.3));
 System.out.println("calculator get round number: " + person1.getCalculator().calculateGetRoundNumber(11.3));

 System.out.println(person1.getCalculator().getArithmeticallyAverage(2, 13, 23));
 System.out.println(person1.getCalculator().calculateRectangularSurface(3, 13, 31));
 System.out.println(person1.getCalculator().calculateCircleVolume(5));
 System.out.println(person1.getCalculator().calcMonthInterestRate(5, 8, 1000));
 System.out.println("Quad surface: " + person1.getCalculator().calcQuadSurface(45, 87, 37));
 System.out.println("Quad volume: " + person1.getCalculator().calcQuadVolume(45, 87, 37));
 writeName();
 getRectangle();
 getRectangleChar();
 writeMountWithIf();
 writeMountWithSwitch();
 writeSeason();
 getQuadraticRoot();
 getHoroscope();
 getPyramide();
 getRandomNumber();
 getRandomNumber2();
 getRandomNumber3();
 getRandomPass();
 getRandomPass2();
 getRandomPass3();
 */
        freeClass1.test();
        getRandomNum();
    }

    public static void writeName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String input = scanner.nextLine();

        System.out.println("Enter password: ");

        int pass = scanner.nextInt();
        System.out.println("Name is " + input + " password is: " + pass);
    }

    public static void getRectangle() {
        System.out.println("\n \n \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type rows: ");
        int rows = scanner.nextInt();
        System.out.print("Type columns: ");
        int columns = scanner.nextInt();
        System.out.println();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        System.out.println();


        for (int row = 1; row <= rows; row++) {

            for (int column = 1; column <= columns; column++) {
                if (row == 1 || row == rows || column == 1 || column == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        System.out.println("\n \n \n");

    }

    public static void getRectangleChar() {
        System.out.println("\n \n \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter char: ");
        String sign = scanner.nextLine();

        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter columns: ");
        int columns = scanner.nextInt();

        System.out.println();


        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(sign);
            }
            System.out.println();
        }
        System.out.println();


        for (int row = 1; row <= rows; row++) {

            for (int column = 1; column <= columns; column++) {
                if (row == 1 || row == rows || column == 1 || column == columns) {
                    System.out.print(sign);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void writeMountWithIf() {             // cislo mesiaca, vypise nazov mesiaca
        System.out.println("\n \n \n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        if (number == 1)
            System.out.println("Jan");
        else if (number == 2)
            System.out.println("Feb");
        else if (number == 3)
            System.out.println("Mar");
        else if (number == 4)
            System.out.println("Apr");
        else if (number == 5)
            System.out.println("May");
        else if (number == 6)
            System.out.println("Jun");
        else if (number == 7)
            System.out.println("Jul");
        else if (number == 8)
            System.out.println("Aug");
        else if (number == 9)
            System.out.println("Sep");
        else if (number == 10)
            System.out.println("Oct");
        else if (number == 11)
            System.out.println("Nov");
        else if (number == 12)
            System.out.println("Dec");
        else
            System.out.println("error");
    }

    public static void writeMountWithSwitch() {             // cislo mesiaca, vypise nazov mesiaca
        System.out.println("\n \n \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("jan");
            case 2:
                System.out.println("feb");
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("apr");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("jun");
                break;
            case 7:
                System.out.println("jul");
                break;
            case 8:
                System.out.println("aug");
                break;
            case 9:
                System.out.println("sep");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("error");
        }
    }

    public static void writeSeason() {
        System.out.println("\n \n \n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        switch (number) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("error");
        }
    }

    public static void getQuadraticRoot() {

        System.out.println("\n \n \n");
        System.out.println("Hello i am program witch have solution of quadratic root");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        double a = scanner.nextDouble();

        System.out.println("Enter number 2: ");
        double b = scanner.nextDouble();

        System.out.println("Enter number 3: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("This is not quadratic root");
        }

        double d = ((b * b) - (4 * a * c));

        if (d < 0) {
            System.out.println("Quadratic euqation has no root");
        }
        if (d == 0) {
            double x1 = (-b / (2 * a));
            System.out.println("Quadratic euqation has one root: " + x1);
        }
        if (d > 0) {
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            double x3 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Quadratic equation has two roots: " + x2 + " and " + x3);
        }
    }

    public static void getHoroscope() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();


        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day <= 20) {
                        System.out.println("Capricorn / The Goat-fish hybrid");
                    } else if (day >= 21 && day <= 31) {
                        System.out.println("Aquarius / Water-bearer");
                        break;
                    }
                } else {
                    System.out.println("Wrong day input for this month");
                    break;
                }
            case 2:
                if (day <= 19) {
                    System.out.println("Aquarius / Water-bearer");
                    break;
                } else if (day >= 20 && day <= 29) {
                    System.out.println("Pisces / The Fishes");
                    break;
                } else {
                    System.out.println("Wrong day input for this month");
                    break;
                }
            case 3:
                if (day <= 20) {
                    System.out.println("Pisces / The Fishes");
                    break;
                } else if (day >= 21 && day <= 31) {
                    System.out.println("Aries / The Ram");
                    break;
                } else {
                    System.out.println("Wrong day input for this month");
                    break;
                }
            case 4:
                if (day <= 20) {
                    System.out.println("Aries / The Ram");
                    break;
                } else if (day >= 21 && day <= 30) {
                    System.out.println("Taurus / The Bull");
                    break;
                } else {
                    System.out.println("Wrong day input for this month");
                    break;
                }
            case 5:
                if (day <= 21) {
                    System.out.println("Taurus / The Bull");
                    break;
                } else if (day >= 22 && day <= 31) {
                    System.out.println("Gemini / The Twins");
                    break;
                } else {
                    System.out.println("Wrong day input for this month");
                    break;
                }
            case 6:
                if (day <= 21) {
                    System.out.println("Gemini / The Twins");
                    break;
                } else if (day >= 22 && day <= 30) {
                    System.out.println("Cancer / The Crab");
                    break;
                } else {
                    System.out.println("Wrong day input for this month");
                    break;
                }
            case 7:
                if (day <= 22) {
                    System.out.println("Cancer / The Crab");
                    break;
                } else if (day >= 23 && day <= 31) {
                    System.out.println("Leo / The Lion");
                    break;
                } else {
                    System.out.println("Wrong day input for this month");
                    break;
                }
            case 8:
                if (day <= 23) {
                    System.out.println("Leo / The Lion");
                    break;
                } else if (day >= 24 && day <= 31) {
                    System.out.println("Virgo / The Maiden");
                    break;
                } else {
                    System.out.println("Wrong day input for this month");
                    break;
                }
            case 9:
                if (day <= 23) {
                    System.out.println("Virgo / The Maiden");
                    break;
                } else if (day >= 24 && day <= 30) {
                    System.out.println("Libra / The Scales");
                    break;
                } else {
                    System.out.println("Wrong day input for this month");
                    break;
                }
            case 10:
                if (day <= 23) {
                    System.out.println("Libra / The Scales");
                    break;
                } else if (day >= 24 && day <= 31) {
                    System.out.println("Scorpio / The Scorpion");
                    break;
                } else {
                    System.out.println("Wrong day input for this month");
                    break;
                }
            case 11:
                if (day <= 22) {
                    System.out.println("Scorpio / The Scorpion");
                    break;
                } else if (day >= 23 && day <= 30) {
                    System.out.println("Sagittarius / The Archer");
                    break;
                } else {
                    System.out.println("Wrong day input for this month");
                    break;
                }
            case 12:
                if (day <= 21) {
                    System.out.println("Sagittarius / The Archer");
                    break;
                } else if (day >= 22 && day <= 31) {
                    System.out.println("Sagittarius / The Archer");
                    break;
                } else {
                    System.out.println("Wrong day input for this month");
                    break;
                }
            default:
                System.out.println("Wrong month input!");
        }
        switch (year) {
            case 13:
                if (year >= 500) {
                    System.out.println("Rat");
                    break;
                } else if (year <= 500) {
                    System.out.println("something else");
                    break;
                }
            default:
                System.out.println("Wrong year input");

        }

    }

    public static void getPyramide() {
        System.out.println("\n \n \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type colums: ");
        int n = scanner.nextInt();


        for (int row = n; row >= 1; row--) {
            for (int space = n - 1; space >= row; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row * 2 - 1; star++) {
                System.out.print("*");

            }
            System.out.println();

        }

        System.out.println();

    }

    public static void getRandomNumber() {
        Random rnd = new Random();
        int a = rnd.nextInt(26) + 97; // 97,122
        int b = rnd.nextInt(10) + 48; //48,-57
        int c = rnd.nextInt(101) + 100; //100,200
        int d = rnd.nextInt(21) - 10; //-10 10
        int e = rnd.nextInt(4) - 1; //-1,2
        int f = rnd.nextInt(503) + 113; //113,615
        int g = 5 * (rnd.nextInt(10) + 1);

        int h = 2 * rnd.nextInt((45) + 5); //2cif cislo
        System.out.println(h);

        int i = 2 * rnd.nextInt((45) + 5) + 1;
        System.out.println(i);

    }

    public static void getRandomNumber2() { //3cif % 11
        Random rnd = new Random();
        int a = 11 * (rnd.nextInt(81) + 10);
        System.out.println(a);
    }

    public static void getRandomNumber3() { //4cif cislo musi byt prvocislo
        Random rnd = new Random();

        int prime;
        int div;

        do {
            prime = rnd.nextInt(4500) + 500;
            prime = 2 * prime + 1;
            div = 0;
            for (int i = 2; i < Math.sqrt(prime); i++) {
                if (prime % i == 0) {
                    div++;
                }

            }
        } while (div > 0);
        System.out.println(prime);

    }

    public static void getRandomPass() { //random pass from 6 chars
        Random rnd = new Random();
        int num;
        String password = "";

        for (int i = 0; i < 6; i++) {
            num = rnd.nextInt(26) + 65; //http://www.asciitable.com/
            char letter = (char) num; //char meni ciselne hodnoty ktore program vygeneruje na chari podla tabulky
            password = password + "" + letter;
        }
        System.out.println(password);

    }

    public static void getRandomPass2() {
        Random rnd = new Random();
        int num;
        String password = "";

        for (int i = 0; i < 5; i++) {
            num = rnd.nextInt(10) + 48; //http://www.asciitable.com/
            char letter = (char) num;
            password = password + "" + letter;
        }
        System.out.println(password);

    }

    public static void getRandomPass3() {
        Random rnd = new Random();
        String password1 = "";
        int num = 0;
        for (int k = 0; k < 10; k++) {
            int type = rnd.nextInt(3);
            switch (type) {
                case 0:
                    num = rnd.nextInt(10) + 48;
                    break;
                case 1:
                    num = rnd.nextInt(26) + 65;
                    break;
                case 2:
                    num = rnd.nextInt(26) + 97;
                    break;
            }
            char letter = (char) num;
            password1 = password1 + letter;
        }
        System.out.println(password1);
        System.out.println(password1.length());
    }

    //1. uloha
    //vygenerovat 2 dvojciferne cisla, zistit od uzivatela ich sucet a overit ci napisal spravne
    //2. uloha
    //to iste + to osetrit pre +, -, * kde + musi mat 50% uspesnost
    //3. uloha
    //to iste ale nech sa to opakuje 10 krat v cykle a nech na konci vypise pocet spravnych a nespravnych odpovedi
    public static void getRandomNum() {

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        int o;
        int correctAnswers = 0;
        int incorrectAnswers = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println(i+ ".Example");
            int m = rnd.nextInt(90) + 10;
            int n = rnd.nextInt(90) + 10;
            int p = rnd.nextInt(4);
            switch (p) {
                case 0 :
                case 1 :
                    System.out.print(m + " + " + n + " = ");

                    break;
                case 2 :
                    System.out.print(m + " - " + n + " = ");
                    break;
                case 3 :
                    System.out.print(m + " * " + n + " = ");
                    break;
            }

            o = sc.nextInt();


            if ((p == 0 && o == (m+n)) || (p == 1 && o ==(m+n)) || (p == 2 && o == (m - n)) || (p == 3 && o == (m*n))) {
                System.out.println("Correct.");
                correctAnswers++;
            }
            else {
                System.out.println("Incorrect.");
                incorrectAnswers++;
            }

        }
        System.out.println("Correct answers: " + correctAnswers + "\n" + "Incorrect answers: " + incorrectAnswers);
    }

}




