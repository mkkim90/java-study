# Queue

```
public class Queue {
    private int[] arr = new int[MAX_SIZE];
    private int front;
    private int rear;
    private static final int MAX_SIZE = 10;
    
    
    // rear + 1 자리에 front가 있는 지 알아보기 위함입니다. 해당 경우라면 Queue가 꽉차 있다는 것입니다.
    private boolean isFull() {
        return (rear + 1) % MAX_SIZE == front;
    }
    
    // 동일선상에 front , rear 인 경우 빈 값으로 판단
    private boolean isEmpty() {
        return rear == front;
    }
    
    public boolean offer(int num) {
        if (isFull()) {
           throw new IllegalStateException("꽉 찼습니다.");
        }
        rear = ((rear + 1) % MAX_SIZE);
        arr[rear] = num;
        return true;
    }
    
    
    public int poll() {
        if (isEmpty()) {
           throw new IllegalStateException("비어있습니다."); 
        }
        int pollData = arr[(front + 1) % MAX_SIZE];
        front = (front + 1) % MAX_SIZE;
        return pollData;
    }
    
    public int[] getArr() {
        return this.arr;
    }
    
    public static void main(String []args){
        System.out.println("Hello World");
        Queue queue = new Queue();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        queue.offer(8);
        while (!queue.isEmpty()) {
            int pollData = queue.poll();
            System.out.println(pollData);
        } 
     }
}
```
