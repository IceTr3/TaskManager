import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI {
    private TaskManager taskManager;

    public MainGUI() {
        taskManager = new TaskManager();
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Task Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField deadlineField = new JTextField();
        JTextField priorityField = new JTextField();

        JButton addButton = new JButton("Add this task");
        JButton showButton = new JButton("Show all tasks");

        panel.add(new JLabel("Task ID number:"));
        panel.add(idField);
        panel.add(new JLabel("What is the task:"));
        panel.add(nameField);
        panel.add(new JLabel("Deadline (YYYY-MM-DD):"));
        panel.add(deadlineField);
        panel.add(new JLabel("Priority of task (1-5):"));
        panel.add(priorityField);

        panel.add(addButton);
        panel.add(showButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                String name = nameField.getText();
                String deadline = deadlineField.getText();
                int priority = Integer.parseInt(priorityField.getText());
                Task task = new Task(id, name, deadline, priority);
                taskManager.addTask(task);
                JOptionPane.showMessageDialog(frame, "Task Added");
            }
        });

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taskManager.printAllTasks();
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MainGUI();
    }
}
