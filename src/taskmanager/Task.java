package taskmanager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @project Practical
 * @author: Fathullo To'yliyev on 14/02/2023.
 * Company: Technologic ASBT
 */
//VAZIFA
public class Task {

    private String name;
    private String description;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    public class TaskList {

        private ArrayList<Task> tasks = new ArrayList<Task>();

        public void addTask(Task task) {
            tasks.add(task);
        }

        //VAZIFANI O'CHIRISH
        public boolean deleteTask(String name) {
            for (Task task : tasks) {
                if (task.getName().equals(name)) {
                    tasks.remove(task);
                    return true;
                }
            }
            return false;
        }

        //VAZIFALARNI KO'RISH
        public void viewTasks() {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
    public class Menu {

        private Scanner input = new Scanner(System.in);
        private taskmanager.TaskList taskList = new taskmanager.TaskList();

        public void start() {
            System.out.println("Welcome to the Task Manager!");

            while (true) {
                System.out.println("1. Add task");
                System.out.println("2. Delete task");
                System.out.println("3. View tasks");
                System.out.println("4. Exit");

                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter task name:");
                        String name = input.next();
                        System.out.println("Enter task description:");
                        String description = input.next();
                        Task newTask = new Task(name, description);
                        taskList.addTask(newTask);
                        System.out.println("Task added.");
                        break;
                    case 2:
                        System.out.println("Enter task name:");
                        name = input.next();
                        if (taskList.deleteTask(name)) {
                            System.out.println("Task deleted.");
                        } else {
                            System.out.println("Task not found.");
                        }
                        break;
                    case 3:
                        taskList.viewTasks();
                        break;
                    case 4:
                        System.out.println("Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }
}
