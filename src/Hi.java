import java.util.Scanner;


public class Hi {
    public static void hi(){
    //Задача 1: Напишите программу, которая на вход принимает 2 числа и проверяет,
    //является ли первое число квадратом второго.

        System.out.printf("Задача 1: Напишите программу, которая на вход принимает 2 числа и проверяет,\n" +
                                        "является ли первое число квадратом второго.\n");
        System.out.printf("a = 5; b = 7 -> max = 7\n");
        System.out.printf("a = 2 b = 10 -> max = 10\n");
        System.out.printf("a = -9 b = -3 -> max = -3\n");


        Scanner in = new Scanner(System.in);                    // Создание объекта класса

        System.out.printf("Введите превое число: ");           // Ввод числе A и B
        int a = in.nextInt();
        System.out.printf("Введите второе число: ");
        int b = in.nextInt();

        if (b*b==a){
            System.out.printf("Число %d, Число %d -> Да", a, b);
        }
        else{
            System.out.printf("Число %d, Число %d -> Нет", a, b);
        }
    }
    public static void si(){
        //Задача 2: Напишите программу, которая на вход принимает два числа и выдаёт,
        //                какое число большее, а какое меньшее.

        System.out.printf("Задача 2: Программа на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.\n");
        System.out.printf("a = 5; b = 7 -> max = 7\n");
        System.out.printf("a = 2 b = 10 -> max = 10\n");
        System.out.printf("a = -9 b = -3 -> max = -3\n");

        Scanner in = new Scanner(System.in);                    // Создание объекта класса

        System.out.printf("Введите превое число: ");           // Ввод числе A и B
        int a = in.nextInt();
        System.out.printf("Введите второе число: ");
        int b = in.nextInt();

        if (a>b){
            System.out.printf("Из чисел " + a + " и " + b + " наибольшее число равно " + a);}
        else if (b>a)
            System.out.printf("Из чисел " + a + " и " + b + " наибольшее число равно " +b);
        else
            System.out.printf("Числа " + a +" и " + b +" равны.");
    }
}
