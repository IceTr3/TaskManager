
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TaskManagerTest {
    private TaskManager taskManager;

    @BeforeEach
    public void setUp() {
        taskManager = new TaskManager();
    }

    @Test
    public void testAddTask() {
        Task task = new Task("1", "Test Task", "2024-12-31", 2);
        taskManager.addTask(task);
        assertEquals(task, taskManager.getNextTask());
    }

    @Test
    public void testRemoveTask() {
        Task task = new Task("1", "Test Task", "2024-12-31", 2);
        taskManager.addTask(task);
        taskManager.removeTask("1");
        assertNull(taskManager.getNextTask());
    }

    @Test
    public void testDuplicateTask() {
        Task task = new Task("1", "Test Task", "2024-12-31", 2);
        taskManager.addTask(task);
        taskManager.addTask(task);
        // Adding the same task again
        assertEquals(1, taskManager.taskQueueSize());
        // Assuming we add a `taskQueueSize()` method
    }
}
