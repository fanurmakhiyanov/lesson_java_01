import java.util.Scanner;

import javax.swing.SortOrder;

public class program {
    public static void main(String[] args) {
        // float e = 2.7f; // для вещественного типа float обязательно указывать суффикс "f"
        // double pi = 3.1415d; // для вещественного типа double суффикс "d" указывать необязательно

        // System.out.println(e);
        // System.out.println(pi);

        // тип данных "char"

        // char ch = '1';
        // System.out.println(Character.isDigit(ch));
        // ch = 'a';
        // System.out.println(Character.isDigit(ch));

        // String msg = "Hello world";
        // System.out.println(msg);


        // var i = 123_123_123; // неявная типизация variable - когда нельзя точно определить тип переменной
        // System.out.println(i);
        // System.out.println(getType(i));

        // Классы-обертки

        // int i = 123;
        // System.out.println(Integer.MIN_VALUE);
        // String s = "qwert";
        // System.out.println(s.charAt(1));

        // Массивы

        // int[] arr = new int[10];
        // System.out.println(arr.length);

        // arr = new int[] {1, 2, 3, 4, 5};
        // System.out.println(arr.length);

        // int[] arr = new int[10];
        // arr[3] = 13;
        // System.out.println(arr[3]);

        // Многомерные массивы

        // int[] arr[] = new int[3][5];
        // for (int[] line : arr) {
        //     for (int item : line) {
        //         System.out.printf("%d", item);
        //     }
        //     System.out.println();
        // }

        // int[] arr[] = new int[3][5];
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.printf("%d", arr[i][j]);
        //     }
        //     System.out.println();
        // }

        // ПРЕОБРАЗОВАНИЯ

        // int i = 123; double d = i; float f = i;
        // System.out.println(i);
        // System.out.println(d);
        // System.out.println(f);

        // byte b = Byte.parseByte("1211");
        // System.out.println(b);
        
        // ПОЛУЧЕНИЕ ДАННЫХ ИЗ ТЕРМИНАЛА

        // Scanner iScanner = new Scanner (System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s", name);
        // iScanner.close();

        // СЧИТЫВАНИЯ ПРИМИТИВОВ ИЗ КОНСОЛИ

        // Scanner iScanner = new Scanner (System.in);
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt();
        // System.out.printf("double a: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner.close();
        
        // ПРОВЕРКА НА СООТВЕТСТВИЕ ПОЛУЧАЕМОГО (ВАЛИДНОГО) ТИПА

        // Scanner iScanner = new Scanner (System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int i = iScanner.nextInt();
        // System.out.println(i);
        // iScanner.close();

        // ФОРМАТИРОВАННЫЙ ВЫВОД

        // int a = 1, b = 2;
        // int c = a + b;
        // String res = a + " + " + b + " = " + c;
        // System.out.println(res);

        // String s = "qwe";
        // int a = 123;
        // String q = s + a;
        // System.out.println(q);

        // int a = 1, b = 2;
        // int c = a + b;
        // String res = String.format("%d + %d = %d \n", a, b, c);
        // System.out.printf("%d + %d = %d \n", a, b, c);
        // System.out.println(res);

        // ВИДЫ СПЕЦИФИКАТОРОВ

        float pi = 3.1415f;
        System.out.printf("%f\n", pi);
        System.out.printf("%.2f\n", pi);
        System.out.printf("%.3f\n", pi);
        System.out.printf("%e\n", pi);
        System.out.printf("%.2e\n", pi);
        System.out.printf("%.3e\n", pi);

        // ФУНКЦИИ И МЕТОДЫ

        
        

    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
    
}

