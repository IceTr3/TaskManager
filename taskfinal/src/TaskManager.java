/**
 * FINAL
 * Task Manager
 * Due: fri, 2024 11:59pm 12/6/2024
 * CIS152 12464
 * This program is used to manage and create tasks based on priority to help with important deadlines  
 * @author Tre Moon
 */

import java.util.HashMap;
import java.util.PriorityQueue;

public class TaskManager {
    private HashMap<String, Task> taskMap;
    private PriorityQueue<Task> taskQueue;

    public TaskManager() {
        taskMap = new HashMap<>();
        taskQueue = new PriorityQueue<>((t1, t2) -> t1.getDeadline().compareTo(t2.getDeadline()));
    }

    public void addTask(Task task) {
        if (!taskMap.containsKey(task.getId())) {
            taskMap.put(task.getId(), task);
            taskQueue.offer(task);
        } else {
            System.out.println("Task with ID already exists.");
        }
    }

    public void removeTask(String id) {
        if (taskMap.containsKey(id)) {
            Task task = taskMap.remove(id);
            taskQueue.remove(task);
        } else {
            System.out.println("Task with ID not found.");
        }
    }

    public Task getNextTask() {
        return taskQueue.peek();
    }
 //Sorting algorithim
    public void printAllTasks() {
        System.out.println("All Tasks (Sorted by Deadline):");
        taskQueue.stream()
                 .sorted((t1, t2) -> t1.getDeadline().compareTo(t2.getDeadline()))
                 .forEach(System.out::println);
    }

    public int taskQueueSize() {
        return taskQueue.size();
    }

}
