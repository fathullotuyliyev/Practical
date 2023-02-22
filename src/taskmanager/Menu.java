package taskmanager;

import java.util.Scanner;

/**
 * @project Practical
 * @author: Fathullo To'yliyev on 14/02/2023.
 * Company: Technologic ASBT
 */
public class Menu {

    private Scanner input = new Scanner(System.in);
    private TaskList taskList = new TaskList();

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
/**
 * Ushbu misolda bizda uchta sinf mavjud: vazifa, vazifalar ro'yxati va Menyu. Vazifa nomi
 * va tavsifi bilan bitta vazifani ifodalaydi. Vazifalar ro'yxati vazifalar ro'yxatini ifodalaydi
 * va vazifalarni qo'shish, o'chirish va ko'rish usullarini taqdim etadi. Menyu vazifalar ro'yxati
 * bilan ishlash uchun foydalanuvchi interfeysini taqdim etadi.
 *
 * Menyu sinfi misolidan foydalanadi vazifalar ro'yxati va beradi foydalanuvchi interfeysi vazifalarni
 * qo'shish, o'chirish va ko'rish uchun. Ushbu sinf dasturni boshlaydigan asosiy usulni ham o'z ichiga oladi.
 * Biz asosiy usulni alohida sinfga ajratishimiz mumkin edi.
 *
 * Vazifalar ro'yxati sinfi ArrayList sinfini meros qilib oladi va vazifa ob'ektlarini o'z massivida saqlaydi.
 * Bu bizga vazifalarni qo'shish va o'chirish uchun Arraylist usullaridan foydalanish imkonini beradi. Vazifalar
 * ro'yxati sinfiga ArrayList misol o'zgaruvchisini kiritish orqali meros o'rniga kompozitsiyadan ham foydalanishimiz mumkin edi.
 *
 * Umuman olganda, ushbu dastur inkapsulyatsiya, meros va polimorfizm yordamida OOP tamoyillariga amal qiladi.
 *
 */
