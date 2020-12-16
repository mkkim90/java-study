package weeks4;

public class ListNode {
    private int data;
    private ListNode next;
    public ListNode(int data) {
        this.data = data;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }

    public int getData() {
        return data;
    }
}
