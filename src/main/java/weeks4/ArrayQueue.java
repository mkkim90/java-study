package weeks4;

public class ArrayQueue {

    private static final String VALID_EMPTY_MESSAGE = "비어있습니다.";
    private static final String VALID_FULL_MESSAGE = "꽉 찼습니다.";

    private int[] arr = new int[MAX_SIZE];
    private int front = 0;
    private int rear = 0;
    private static final int MAX_SIZE = 10;


    // rear + 1 자리에 front가 있는 지 알아보기 위함입니다. 해당 경우라면 Queue가 꽉차 있다는 것입니다.
    private boolean isFull() {
        return (rear + 1) % MAX_SIZE == front;
    }

    // 동일선상에 front , rear 인 경우 빈 값으로 판단
    public boolean isEmpty() {
        return rear == front;
    }

    public boolean offer(int num) {
        if (isFull()) {
            throw new IllegalArgumentException(VALID_FULL_MESSAGE);
        }
        rear = ((rear + 1) % MAX_SIZE);
        arr[rear] = num;
        return true;
    }


    public int poll() {
        if (isEmpty()) {
            throw new IllegalArgumentException(VALID_EMPTY_MESSAGE);
        }
        int pollData = arr[(front + 1) % MAX_SIZE];
        front = (front + 1) % MAX_SIZE;
        return pollData;
    }
}
