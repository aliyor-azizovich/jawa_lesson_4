package src.main.list.imple;

import src.main.list.GBList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements GBList<T> {
    Node head;
    int size;


    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    //метод получения элемента по индексу
    public int getElementAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Incorrect index"); // Возвращаем error если индекс некорректный
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    //метод добавления в начало
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    //метод добавления в конец - тут я переписал метод из GBList. не знаю насколько правильно это было???
    public void add(T elem) {
        Node newNode = new Node((Integer) elem);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }
//    метод получения размера списка - тоже переписал c GBList ????? вот эти моменты не очень понятны.
//    вроде есть интерфейс с методами которые мне нужны в этом классе, хорошо это когда я ими пользуюсь и
//    переписываю для своих целей или всё же лучше создать новый метод??

    @Override
    public int size() {
        return size;
    }

    // с неиспользуемыми методами тоже не всё ясно  - вроде обязаны их тут писать но в этом классе они не используются???
    @Override
    public void remove(int index) {
    }

    @Override
    public T get(int index) {
        return null;
    }

    //    ну и немножко поэкспериментировал с toString
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

//     с итератором тоже беда. Вроде для выполнения задания он и не пригодился)) но на семинаре вы сказали что он нужен
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private class LinkedListIterator implements Iterator<Integer> {
        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int data = current.data;
            current = current.next;
            return data;
        }
    }
}

