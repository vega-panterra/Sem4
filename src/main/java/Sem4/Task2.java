package Sem4;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = createLinkedList(10);
        System.out.println("Дан список элементов: " + list);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод элемента: ");
        enqueue(list, scanner.nextInt());
        System.out.println("enqueue - помещает элемент в конец очереди: " + list);
        System.out.println("dequeue - возвращает первый элемент из очереди и удаляет его: " + list);
        System.out.println("first - возвращает первый элемент из очереди, не удаляя: " + list);
        scanner.close();
    }

    static LinkedList<Integer> createLinkedList(int size) {
        LinkedList<Integer> LinkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            LinkedList.add(i + 1);
        }
        return LinkedList;
    }
    public static void enqueue(LinkedList<Integer> list, int number) {
        list.addLast(number);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int number = list.get(0);
        list.remove(0);
        return number;
    }

    public static int first(LinkedList<Integer> list) {
        int number = list.get(0);
        return number;
    }
}