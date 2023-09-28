package io.github.alyonachern;

public class JavaTraining {
    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int x = 666;
        int y = 33;
        long l = 55L;
        double d = 66.6;
        float f = 88F;
        char c = 'A';
        boolean isSmart = true;

        // Тренируемся с математическими операторами
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
        System.out.println("x++ = " + (x++) + ", а потом " + x);
        System.out.println("--y = " + (--y));


        // Тренируемся с логическими операторами и операторами сравнения
        System.out.println("x больше y? " + (x > y));
        System.out.println("x больше или равно y? " + (x >= y));
        System.out.println("x меньше y? " + (x < y));
        System.out.println("x меньше или равно y? " + (x <= y));
        System.out.println("x равно y? " + (x == y));
        System.out.println("x неравно y? " + (x != y));

        // Добиваемся переполнения во время вычисления
        System.out.println("Тут выводится переполнение " + (b + 1));
        System.out.println("Тут тоже выводится переполнение " + (s + 11));

        // Вычисляем с комбинациями типов данных
        System.out.println("long + double = double " + (l + d));
        System.out.println("int + double = double " + (x + d));
        char r = (char) b;
        System.out.println("new char = " + r);



    }
}
