/**
 * 
 * IntListTwo: מייצגת את הרשימה המקושרת הכפולה וכוללת פעולות כמו הוספה, מחיקה, הדפסה, בדיקת אורך ועוד.
 * 
 */

public class IntListTwo {
    private IntNodeTwo _head; // מצביע לראש הרשימה
    private IntNodeTwo _tail; // מצביע לזנב הרשימה

    // קונסטרקטור שמאתחל את ראש וזנב הרשימה ל-null (רשימה ריקה)
    public IntListTwo() {
        this._head = null;
        this._tail = null;
    }

    // בודק אם הרשימה ריקה
    public boolean isEmpty() {
        return _head == null;
    }

    // מוסיף צומת לתחילת הרשימה
    public void addToHead(int num) {
        IntNodeTwo newNode = new IntNodeTwo(num); // יצירת צומת חדש עם הערך הנתון
        if (isEmpty()) {
            _head = newNode;
            _tail = newNode;
        } else {
            newNode.setNext(_head);
            _head.setPrev(newNode);
            _head = newNode;
        }
    }

    // מוסיף צומת לסוף הרשימה
    public void addToTail(int num) {
        IntNodeTwo newNode = new IntNodeTwo(num); // יצירת צומת חדש עם הערך הנתון
        if (isEmpty()) {
            _head = newNode;
            _tail = newNode;
        } else {
            newNode.setPrev(_tail);
            _tail.setNext(newNode);
            _tail = newNode;
        }
    }

    // מוסיף צומת אחרי צומת נתון
    public void insertAfter(int num, IntNodeTwo node) {
        IntNodeTwo newNode = new IntNodeTwo(num); // יצירת צומת חדש עם הערך הנתון
        if (node == null) {
            _head = newNode;
            _tail = newNode;
        } else {
            IntNodeTwo curr = _head;
            while (curr != node) {
                curr = curr.getNext();
            }
            newNode.setNext(curr.getNext());
            newNode.setPrev(curr);
            if (curr.getNext() != null) {
                curr.getNext().setPrev(newNode);
            } else {
                _tail = newNode;
            }
            curr.setNext(newNode);
        }
    }

    // מסיר צומת מהרשימה לפי ערך
    public void remove(int num) {
        IntNodeTwo current = _head;
        while (current != null && current.getNum() != num) {
            current = current.getNext();
        }
        if (current != null) {
            if (current.getPrev() != null) {
                current.getPrev().setNext(current.getNext());
            } else {
                _head = current.getNext();
            }
            if (current.getNext() != null) {
                current.getNext().setPrev(current.getPrev());
            } else {
                _tail = current.getPrev();
            }
        }
    }

    // מדפיס את כל הצמתים ברשימה מהתחלה לסוף
    public void printList() {
        IntNodeTwo temp = _head;
        while (temp != null) {
            System.out.print(temp.getNum() + " --> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

    // מדפיס את כל הצמתים ברשימה מהסוף להתחלה
    public void printListReverse() {
        IntNodeTwo temp = _tail;
        while (temp != null) {
            System.out.print(temp.getNum() + " --> ");
            temp = temp.getPrev();
        }
        System.out.println("null");
    }

    // מחזיר את אורך הרשימה
    public int length() {
        IntNodeTwo temp = _head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }
}
