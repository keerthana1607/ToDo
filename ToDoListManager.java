/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ei;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author keerthana1
 * 
 */
public class ToDoListManager {
    

    private List<Task> tasks;
    private Set<String> deletedTitles;
    private Set<String> completedTitles;

    public ToDoListManager() {
        tasks = new ArrayList<>();
        deletedTitles = new HashSet<>();
        completedTitles = new HashSet<>();
    }

    public void addTask(String title, String description, String dueDate) {
    Task task = new Task(title, description);
    task.setDueDate(dueDate);
    tasks.add(task);
    System.out.println("Task added.");
}


    public void markTaskAsCompleted(String title) {
        if (completedTitles.contains(title)) {
            System.out.println("This title is already marked as completed.");
            return;
        }

        boolean found = false;
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                task.markCompleted();
                found = true;
                completedTitles.add(title);
                System.out.println("Task marked as completed.");
                break;
            }
        }

        if (!found) {
            System.out.println("This title is not found.");
        }
    }

    public void deleteTask(String title) {
        if (deletedTitles.contains(title)) {
            System.out.println("This title is already deleted.");
            return;
        }

        boolean found = false;
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                tasks.remove(task);
                found = true;
                deletedTitles.add(title);
                System.out.println("Task with title '" + title + "' is deleted.");
                break;
            }
        }

        if (!found) {
            System.out.println("This title is not found.");
        }
    }

    public List<Task> viewAllTasks() {
        return tasks;
    }

    public List<Task> viewCompletedTasks() {
        List<Task> completedTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isCompleted()) {
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }

    public List<Task> viewPendingTasks() {
        List<Task> pendingTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                pendingTasks.add(task);
            }
        }
        return pendingTasks;
    }

    public static void main(String[] args) {
        ToDoListManager manager = new ToDoListManager();
        Scanner scanner = new Scanner(System.in);

        String[] menuOptions = {
            "Select an option:",
            "1. Add Task",
            "2. Mark Task as Completed",
            "3. Delete Task",
            "4. View All Tasks",
            "5. View Completed Tasks",
            "6. View Pending Tasks",
            "7. Exit"
        };

        while (true) {
            for (String option : menuOptions) {
                System.out.println(option);
                try {
                    Thread.sleep(1000); // 1-second pause
                } catch (InterruptedException e) {
                    System.err.println("Thread interrupted: " + e.getMessage());
                }
            }

            System.out.print("Enter command number: "); // Added statement

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter due date (or leave empty): ");
                    String dueDate = scanner.nextLine();
                   manager.addTask(title, description, dueDate);
                  
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter task title to mark as completed: ");
                    String completedTitle = scanner.nextLine();
                    manager.markTaskAsCompleted(completedTitle);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter task title to delete: ");
                    String deleteTitle = scanner.nextLine();
                    manager.deleteTask(deleteTitle);
                    System.out.println();
                    break;
                case 4:
                    System.out.println(); // Add space gap
                    System.out.println("All Tasks:");
                    for (Task task : manager.viewAllTasks()) {
                        System.out.println(task);
                    }
                    System.out.println(); // Add space gap
                    break;
                case 5:
                    System.out.println(); // Add space gap
                    System.out.println("Completed Tasks:");
                    for (Task task : manager.viewCompletedTasks()) {
                        System.out.println(task);
                    }
                    System.out.println(); // Add space gap
                    break;
                case 6:
                    System.out.println(); // Add space gap
                    System.out.println("Pending Tasks:");
                    for (Task task : manager.viewPendingTasks()) {
                        System.out.println(task);
                    }
                    System.out.println(); // Add space gap
                    break;
                case 7:
                    System.out.println("Exiting.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }

    
            
}

    
    