
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class QuickSortTest {

	@Test
    public void testSortByPriority() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("1", "Task A", "2024-12-20", 3));
        tasks.add(new Task("2", "Task B", "2024-12-15", 1));
        tasks.add(new Task("3", "Task C", "2024-12-18", 2));

        QuickSort.sort(tasks);

        assertEquals(1, tasks.get(0).getPriority());
        assertEquals(2, tasks.get(1).getPriority());
        assertEquals(3, tasks.get(2).getPriority());
    }
}
