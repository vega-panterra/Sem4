package Sem4;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = createLinkedList(10);
        System.out.println("Дан список элементов: " + list);
        System.out.println("Перевернутый список: " + reverseList(list));
    }

    static LinkedList<Integer> createLinkedList(int size) {
        LinkedList<Integer> LinkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            LinkedList.add(i + 1);
        }
        return LinkedList;
    }

    static LinkedList<Integer> reverseList(LinkedList<Integer> LinkedList) {
        LinkedList<Integer> newList = new LinkedList<>();
        while (LinkedList.size() > 0) {
            newList.add(LinkedList.pollLast());
        }
        return newList;
    }
}