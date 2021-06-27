package ru.geekbrains.gbLesson1;

// Урок первый

public class Main {

    public static void main(String[] args) {

//          createVar(); // задание 2
//          System.out.println("Результат выполнения задания 2 " + returnResult(2,7,4,5)); // задание 3
//          System.out.println(isTrue(5,16)); // задание 4
//          printMessage(0); // задание 5
//          System.out.println(isPositive(-155)); //задание 6
//          helloNick("Василий"); // задание 7
            isLeapYear(1281); // задание 8


    }

    public static void createVar() { // задание 2 - объявление переменных всех типов с инициализацией
        byte by = 120; // 8-битное знаковое целое число от -128 до 127
        short sh = -64; // 16-битное знаковое целое число от -32768 до 32767
        int in = 123456; // 32-битное знаковое целое число от -2147483648 до 2147483647
        long lng = 432423235L; // 64-битное знаковое целое число от -9223372036854775808 до 9223372036854775807
                float fL = 34324.434222F; //32-битное знаковое число с плавающей запятой одинарной точности
                double dou = 43255.342425778898; // 64-битное знаковое число с плавающей запятой двойной точности
                char ch = '\u0101'; // 16-битный тип данных, предназначенный для хранения символов в кодировке Unicode
                boolean boo = (true); // логический тип

//        System.out.println(by);
//        System.out.println(sh);
//        System.out.println(in);
//        System.out.println(lng);
//        System.out.println(fL);
//        System.out.println(dou);
//        System.out.println(ch);
//        System.out.println(boo);

    }

    public static float returnResult(float a, float b, float c, float d) { // задание 3 - вычисление по формуле

        return a * (b + (c / d));

    }

    public static boolean isTrue(int a, int b) { // задание 4 попадает ли число от 10 до 20

        return   ((a+b)>= 10)&&((a+b)<= 20);

    }

    public static void printMessage(int a) { // задание 5 положительное число или нет

        if (a >= 0) {
            System.out.println("Число a " + a  + "положительное");
        }
            else {

            System.out.println("Число a " + a  + "отрицательное");

        }

    }

    public static boolean isPositive(int a) { // задание 6 функция логического типа положительное число или нет

        return (a>=0);

    }

    public static void helloNick(String nick) { // задание 7, параметр строка

        System.out.println("Привет, " + nick + " !");
    }

    public static void isLeapYear(int year) { // задание 8, високосный ли год

        if ((year %4 == 0) && (year %100 != 0) || (year %400 == 0)) {

            System.out.println("Год " + year + " - високосный");
        }

        else {

            System.out.println("Год " + year + " - не високосный");

        }
    }
}
