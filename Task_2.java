/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print("Исходный список: ");
        System.out.println(list);
        System.out.println("Результат работы фунции enqueue: ");
        System.out.println(enqueue (list));
        System.out.println("Результат работы фунции dequeue: ");
        System.out.println(dequeue(list));
        System.out.println(list);
        System.out.println("Результат работы фунции first: ");
        System.out.println(first(list));
        System.out.println(list);
    }

    public static <Int> LinkedList<Integer> enqueue (LinkedList<Integer> flip){
        Scanner scan = new Scanner(System.in);
        System.out.print("Укажите номер элементы, чтобы поместить его в конец очереди: ");
        int number_element = scan.nextInt();
       // flip.addLast(flip.get(number_element));
        LinkedList<Integer> list_1 = new LinkedList();
        for (int i = 0; i < flip.size(); i++) {
            if (i == number_element){
                flip.addLast(flip.removeLast());
                flip.addLast(i+1);
            } else {
                list_1.addLast(flip.get(i));
            }
        }
        return list_1;
    }

    public static <Int> Integer dequeue (LinkedList<Integer> flip){
        return flip.removeFirst();
    }

    public static <Int> Integer first (LinkedList<Integer> flip){
        return flip.peekFirst();
    }
}
