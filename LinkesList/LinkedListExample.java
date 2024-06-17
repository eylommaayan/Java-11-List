package LinkesList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // הוספת פריטים
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // גישה לפריטים
        System.out.println("Element at index 1: " + linkedList.get(1));

        // הסרת פריט
        linkedList.remove(1);

        // הדפסת כל הפריטים
        for (int num : linkedList) {
            System.out.println(num);
        }
    }
}

