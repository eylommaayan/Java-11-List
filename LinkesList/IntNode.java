public class IntNode {
    private int _value; // הערך של הצומת
    private IntNode _next; // מצביע לצומת הבא ברשימה

    // קונסטרקטור שמקבל ערך ומאתחל את המצביע לצומת הבא ל-null
    public IntNode(int val) {
        _value = val;
        _next = null;
    }

    // קונסטרקטור שמקבל ערך ומצביע לצומת הבא
    public IntNode(int val, IntNode next) {
        _value = val;
        _next = next;
    }

    // מחזיר את הערך של הצומת
    public int getValue() {
        return _value;
    }

    // מעדכן את הערך של הצומת
    public void setValue(int v) {
        _value = v;
    }

    // מחזיר את המצביע לצומת הבא
    public IntNode getNext() {
        return _next;
    }

    // מעדכן את המצביע לצומת הבא
    public void setNext(IntNode node) {
        _next = node;
    }
}
