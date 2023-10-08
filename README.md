# ToDo
# ToDoListManager
 Fields:
   - tasks: A list to store `Task` objects representing tasks in the to-do list.
   - deletedTitles: A set to store titles of tasks that have been deleted.
   - completedTitles: A set to store titles of tasks that have been marked as completed.
- Constructor Initializes the `ToDoListManager` object with empty task lists and sets for deleted and completed titles.
- Adds a new task to the to-do list with a title, description, and optional due date.
- Creates a `Task` object and adds it to the list of tasks.
- Marks a task with a specified title as completed.
- Checks if the title is already marked as completed and prevents duplication.
- Iterates through the tasks and marks the matching task as completed.
- Deletes a task with a specified title from the to-do list.
- Checks if the title is already deleted and prevents duplication.
- Iterates through the tasks and removes the matching task.
- viewAllTasks: Returns a list of all tasks in the to-do list.
- viewCompletedTasks: Returns a list of completed tasks.
- viewPendingTasks: Returns a list of pending (incomplete) tasks.
- Creates an instance of `ToDoListManager` and a `Scanner` for user input.
- Displays a menu with options for managing the to-do list.
- Reads the user's choice and executes the corresponding action.
- Includes options to add tasks, mark tasks as completed, delete tasks, and view tasks.
- Exits the program when the "Exit" option is selected.
# Task
Fields:
   - title: Represents the title of the task.
   - description: Represents the description of the task.
   - completed: Indicates whether the task is completed (true) or pending (false).
   - dueDate: Represents the due date of the task.
- Constructor Initializes a `Task` object with a title and description.
- Sets the `completed` status to false (pending) and initializes `dueDate` as an empty string.
- Provides getter methods to access the task's `title`, `description`, `completed` status, and `dueDate`.
- Marks the task as completed by setting the `completed` field to true.
- Marks the task as pending by setting the `completed` field to false.
- Provides getter and setter methods to access and modify the due date of the task.
- Overrides the `toString` method to provide a textual representation of the task.
- Includes the task's title, description, completion status (completed or pending), and, if available, the due date.
