import java.util.ArrayList;
import java.util.Scanner;

/**
 * @project Practical
 * @author: Fathullo To'yliyev on 15/02/2023.
 * Company: Technologic ASBT
 */
public class Tasks {
    static class Task {
        private String name;
        private String description;

        public Task(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String toString() {
            return name + ": " + description;
        }
    }

    static class TaskManager {
        private ArrayList<Task> tasks = new ArrayList<Task>();

        public void addTask(Task task) {
            tasks.add(task);
        }

        public void removeTask(int index) {
            tasks.remove(index);
        }

        public void printTasks() {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static class TaskManagerApp {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            TaskManager taskManager = new TaskManager();
            int option = 0;

            while (option != 4) {
                System.out.println("Select an option:");
                System.out.println("1. Add a task");
                System.out.println("2. Remove a task");
                System.out.println("3. View tasks");
                System.out.println("4. Quit");

                try {
                    option = input.nextInt();
                    input.nextLine(); // Consume the newline character

                    switch (option) {
                        case 1:
                            System.out.print("Enter the task name: ");
                            String name = input.nextLine();
                            System.out.print("Enter the task description: ");
                            String description = input.nextLine();
                            Task task = new Task(name, description);
                            taskManager.addTask(task);
                            break;
                        case 2:
                            System.out.print("Enter the index of the task to remove: ");
                            int index = input.nextInt();
                            taskManager.removeTask(index - 1);
                            break;
                        case 3:
                            taskManager.printTasks();
                            break;
                        case 4:
                            System.out.println("Goodbye!");
                            break;
                        default:
                            System.out.println("Invalid option.");
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid option.");
                    input.nextLine(); // Clear the input buffer
                }
            }
        }
    }
}
