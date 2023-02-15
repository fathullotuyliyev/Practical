package taskmanager;

import java.util.ArrayList;

/**
 * @project Practical
 * @author: Fathullo To'yliyev on 14/02/2023.
 * Company: Technologic ASBT
 */
public class TaskList {
    private ArrayList<Task> tasks = new ArrayList<Task>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public boolean deleteTask(String name) {
        for (Task task : tasks) {
            if (task.getName().equals(name)) {
                tasks.remove(task);
                return true;
            }
        }
        return false;
    }

    public void viewTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
