package src.main.list.imple;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linklist = new LinkedList();
        linklist.insertAtBeginning(1);
        linklist.add(8);
        linklist.add(11);
        linklist.add(18);
        linklist.insertAtBeginning(5);
        System.out.println(linklist);
        System.out.println(linklist.size());
        System.out.println(linklist.getElementAtIndex(0));
    }
}
