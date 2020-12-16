package weeks4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class ArrayQueueTest {
    private ArrayQueue queue = new ArrayQueue();

    @Test
    @DisplayName("큐 추가")
    void offer() {
        assertThat(queue.offer(1)).isTrue();
        assertThat(queue.offer(2)).isTrue();
        assertThat(queue.offer(3)).isTrue();
        assertThat(queue.offer(4)).isTrue();
        assertThat(queue.offer(5)).isTrue();
        assertThat(queue.offer(6)).isTrue();
        assertThat(queue.offer(7)).isTrue();
        assertThat(queue.offer(8)).isTrue();
        assertThat(queue.offer(9)).isTrue();

        assertThatIllegalArgumentException().isThrownBy(() -> {
            queue.offer(9);
        }).withMessageContaining("꽉 찼습니다.");
    }

    @Test
    @DisplayName("큐 제거")
    void poll() {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
