/*
В калькулятор добавьте возможность отменить последнюю операцию.
 */

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<String> list = new LinkedList<>();


        System.out.print("Введите первое число: ");
        double a = scan.nextDouble();
        list.push(String.valueOf(a));

        System.out.print("Введите знак ( + - / *): ");
        String sign = scan.next();

        System.out.print("Введите второе число: ");
        double b = scan.nextDouble();
        list.push(String.valueOf(b));

        if (sign.equals("+")) {
            System.out.println(a + "+" + b + "=" + (a + b));
            list.push(String.valueOf(a + b));
        }
        if (sign.equals("-")) {
            System.out.println(a + "-" + b + "=" + (a - b));
            list.push(String.valueOf(a - b));
        }
        if (sign.equals("/")) {
            System.out.println(a + "/" + b + "=" + (a / b));
            list.push(String.valueOf(a / b));
        }
        if (sign.equals("*")) {
            System.out.println(a + "x" + b + "=" + (a * b));
            list.push(String.valueOf(a * b));
        }
        System.out.println(list);

        while (true) {
            System.out.print("Введите знак ( + - / *) или Отмена: ");
            String s = scan.next();
            while (s.equals("Отмена")) {
                list.pop();
                list.pop();
                System.out.println(list);
                System.out.print("Введите знак ( + - / *) или Отмена: ");
                s = scan.next();
            }

            System.out.print("Введите второе число: ");
            double c = scan.nextDouble();

            if (s.equals("+")) {
                double n = Double.parseDouble(list.peekFirst()) + c;
                System.out.println(Double.parseDouble(list.peekFirst()) + "+" + c + "=" + n);
                list.push(String.valueOf(c));
                list.push(String.valueOf(n));
            }

            if (s.equals("-")) {
                double n = Double.parseDouble(list.peekFirst()) - c;
                System.out.println(Double.parseDouble(list.peekFirst()) + "-" + c + "=" + n);
                list.push(String.valueOf(c));
                list.push(String.valueOf(n));
            }

            if (s.equals("/")) {
                double n = Double.parseDouble(list.peekFirst()) / c;
                System.out.println(Double.parseDouble(list.peekFirst()) + "/" + c + "=" + n);
                list.push(String.valueOf(c));
                list.push(String.valueOf(n));
            }

            if (s.equals("*")) {
                double n = Double.parseDouble(list.peekFirst()) * c;
                System.out.println(Double.parseDouble(list.peekFirst()) + "*" + c + "=" + n);
                list.push(String.valueOf(c));
                list.push(String.valueOf(n));
            }

            System.out.println(list);
        }
    }
}