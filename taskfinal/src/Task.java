public class Task {
    private String id;
    private String name;
    private String deadline; // Use LocalDate in actual implementation for proper date handling
    private int priority;

    public Task(String id, String name, String deadline, int priority) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getDeadline() { return deadline; }
    public int getPriority() { return priority; }

    @Override
    public String toString() {
        return "Task [ID=" + id + ", Name=" + name + ", Deadline=" + deadline + ", Priority=" + priority + "]";
    }
}
