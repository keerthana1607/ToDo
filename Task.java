/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ei;

/**
 *
 * @author keerthana
 */
public class Task {
    
  
    private String title;//task title
    private String description;//task description
    private boolean completed;//status of task
    private String dueDate;//task due date

    //Constructor to initialize task with title,duedate and description 
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
        this.dueDate = "";
    }

    // Getter methods for title, description, and completion status
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    // Mark the task as completed
    public void markCompleted() {
        completed = true;
    }
 
    // Mark the task as pending
    public void markPending() {
        completed = false;
    }

    // Getter and setter for due date
    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    //representaion for adding tasks
    @Override
    public String toString() {
        String status = completed ? "Completed" : "Pending";
        if (!dueDate.isEmpty()) {
            return title + " - " + description + " - " + status + ", Due: " + dueDate;
        } else {
            return title + " - " + description + " - " + status;
        }
    }
}
