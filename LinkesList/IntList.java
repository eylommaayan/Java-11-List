public class IntList {
    private IntNode _head; // מצביע לראש הרשימה

    // קונסטרקטור שמאתחל את ראש הרשימה ל-null (רשימה ריקה)
    public IntList() {
        _head = null;
    }

    // קונסטרקטור שמקבל צומת ראשוני ומאתחל את ראש הרשימה אליו
    public IntList(IntNode node) {
        _head = node;
    }

    // בודק אם הרשימה ריקה
    public boolean empty() {
        return _head == null;
    }

    // מוסיף צומת לתחילת הרשימה
    public void addToHead(IntNode node) {
        node.setNext(_head); // מצביע הצומת החדש מצביע לראש הנוכחי של הרשימה
        _head = node; // ראש הרשימה מתעדכן לצומת החדש
    }

    // מוסיף צומת לסוף הרשימה
    public void addToEnd(IntNode node) {
        if (empty()) {
            _head = node; // אם הרשימה ריקה, הצומת החדש הופך לראש הרשימה
        } else {
            IntNode ptr = _head; // מצביע זמני שמתחיל בראש הרשימה
            while (ptr.getNext() != null) {
                ptr = ptr.getNext(); // מעבר על הצמתים עד הסוף
            }
            ptr.setNext(node); // מצביע הצומת האחרון מתעדכן לצומת החדש
        }
    }

    // מסיר צומת מהרשימה לפי ערך
    public void remove(int num) {
        if (_head != null) {
            if (_head.getValue() == num) {
                _head = _head.getNext(); // אם הערך נמצא בראש הרשימה, מעדכנים את הראש
            } else {
                IntNode behind = _head; // מצביע זמני שמתחיל בראש הרשימה
                while (behind.getNext() != null && behind.getNext().getValue() != num) {
                    behind = behind.getNext(); // מעבר על הצמתים עד למציאת הצומת עם הערך המבוקש
                }
                if (behind.getNext() != null) {
                    behind.setNext(behind.getNext().getNext()); // דילוג על הצומת שמכיל את הערך המבוקש
                }
            }
        }
    }

    // מדפיס את כל הצמתים ברשימה
    public void printList() {
        IntNode temp = _head; // מצביע זמני שמתחיל בראש הרשימה
        while (temp != null) {
            System.out.print(temp.getValue() + " --> "); // מדפיס את הערך של הצומת הנוכחי
            temp = temp.getNext(); // מתקדם לצומת הבא
        }
        System.out.println("null"); // מסמן את סוף הרשימה
    }

    // מחזיר את אורך הרשימה
    public int length() {
        IntNode temp = _head; // מצביע זמני שמתחיל בראש הרשימה
        int count = 0; // מונה הצמתים
        while (temp != null) {
            count++; // מגדיל את המונה
            temp = temp.getNext(); // מתקדם לצומת הבא
        }
        return count; // מחזיר את האורך של הרשימה
    }

    // מחזיר את הצומת הקודם לצומת נתון
    public IntNode predecessor(IntNode node) {
        if (_head == null || _head == node) {
            return null; // אם הרשימה ריקה או אם הצומת הוא ראש הרשימה, אין צומת קודם
        }
        IntNode behind = _head; // מצביע זמני שמתחיל בראש הרשימה
        while (behind.getNext() != null) {
            if (behind.getNext() == node) {
                return behind; // אם הצומת הבא הוא הצומת הנתון, מחזירים את המצביע הזמני
            } else {
                behind = behind.getNext(); // מתקדם לצומת הבא
            }
        }
        return null; // אם לא נמצא צומת קודם, מחזירים null
    }
}
