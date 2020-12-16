package weeks4;

class ListNodeQueue {
    ListNode front;
    ListNode rear;

    public ListNodeQueue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean offer(int data) {
        ListNode newNode = new ListNode(data);
        newNode.setNext(null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            return true;
        }

        rear.setNext(newNode);
        rear = rear.getNext();
        return true;
    }

    public int poll() {
        if (isEmpty()) {
            throw new IllegalArgumentException("poll fail LinkedQueue is empty");
        }

        int pollData = front.getData();
        front = front.getNext();
        return pollData;
    }
}


