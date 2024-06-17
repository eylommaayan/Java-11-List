public class IntNodeTwo {
    private int _num; // הערך של הצומת
    private IntNodeTwo _next; // מצביע לצומת הבא ברשימה
    private IntNodeTwo _prev; // מצביע לצומת הקודם ברשימה

    // קונסטרקטור שמקבל ערך ומאתחל את המצביעים לצומת הבא והקודם ל-null
    public IntNodeTwo(int num) {
        this._num = num;
        this._next = null;
        this._prev = null;
    }

    // קונסטרקטור שמקבל ערך ומצביעים לצומת הבא והקודם
    public IntNodeTwo(int num, IntNodeTwo next, IntNodeTwo prev) {
        this._num = num;
        this._next = next;
        this._prev = prev;
    }

    // מחזיר את הערך של הצומת
    public int getNum() {
        return _num;
    }

    // מעדכן את הערך של הצומת
    public void setNum(int num) {
        this._num = num;
    }

    // מחזיר את המצביע לצומת הבא
    public IntNodeTwo getNext() {
        return _next;
    }

    // מעדכן את המצביע לצומת הבא
    public void setNext(IntNodeTwo next) {
        this._next = next;
    }

    // מחזיר את המצביע לצומת הקודם
    public IntNodeTwo getPrev() {
        return _prev;
    }

    // מעדכן את המצביע לצומת הקודם
    public void setPrev(IntNodeTwo prev) {
        this._prev = prev;
    }
}
