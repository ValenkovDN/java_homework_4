/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
 */

import java.util.LinkedList;

public class Task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print("Исходный список: ");
        System.out.println(list);
        System.out.print("Перевернутый список: ");
        System.out.println(flip_over(list));

    }

    public static LinkedList<Integer> flip_over(LinkedList<Integer> flip){
        LinkedList<Integer> list_1 = new LinkedList();
        for (int i = 0; i < flip.size(); i++) {
            list_1.addFirst(flip.get(i));
        }
        return list_1;
    }
}
