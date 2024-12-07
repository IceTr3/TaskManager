
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TaskTest {

	@Test
    public void testTaskCreation() {
        Task task = new Task("1", "Test Task", "2024-12-31", 3);
        assertEquals("1", task.getId());
        assertEquals("Test Task", task.getName());
        assertEquals("2024-12-31", task.getDeadline());
        assertEquals(3, task.getPriority());
    }

    @Test
    public void testToString() {
        Task task = new Task("2", "Another Task", "2024-12-25", 5);
        String expected = "Task [ID=2, Name=Another Task, Deadline=2024-12-25, Priority=5]";
        assertEquals(expected, task.toString());
    }
}
