public class NumberSortedList {
    private IntNode _head; // משתנה שמחזיק את ראש הרשימה

    // פונקציה שבודקת אם הרשימה ריקה
    private boolean isEmpty() {
        return _head == null;
    }

    // פונקציה להוספת צומת לרשימה ממוינת
    public void add(IntNode node) {
        if (isEmpty()) { // אם הרשימה ריקה
            _head = node; // הצומת החדש הופך להיות ראש הרשימה
        } else if (node.getValue() < _head.getValue()) { // אם ערך הצומת החדש קטן מהערך של ראש הרשימה הנוכחי
            node.setNext(_head); // הצומת החדש מצביע לראש הרשימה הנוכחי
            _head = node; // הצומת החדש הופך להיות ראש הרשימה
        } else {
            IntNode current = _head; // צומת עזר שמתחיל מראש הרשימה
            // לולאה שמחפשת את המקום הנכון להכניס את הצומת החדש
            while (current.getNext() != null && current.getNext().getValue() < node.getValue()) {
                current = current.getNext(); // עוברים לצומת הבא
            }
            // הכנסת הצומת החדש למקום המתאים ברשימה
            node.setNext(current.getNext()); // הצומת החדש מצביע לצומת הבא של הצומת הנוכחי
            current.setNext(node); // הצומת הנוכחי מצביע לצומת החדש
        }
    }
}

// מחלקת IntNode שמייצגת צומת ברשימה המקושרת
class IntNode {
    private int value; // הערך של הצומת
    private IntNode next; // מצביע לצומת הבא ברשימה

    public IntNode(int value) {
        this.value = value; // הגדרת הערך של הצומת
        this.next = null; // תחילה, המצביע הוא null
    }

    public int getValue() {
        return value; // מחזיר את הערך של הצומת
    }

    public IntNode getNext() {
        return next; // מחזיר את הצומת הבא
    }

    public void setNext(IntNode next) {
        this.next = next; // קובע את הצומת הבא
    }
}
