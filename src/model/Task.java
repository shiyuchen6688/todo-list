package model;

import exceptions.TaskNotFoundException;

import java.text.ParseException;
import java.util.Date;

public interface Task {
    // EFFECTS: return taskName
    String getTaskName();

    // EFFECTS: return dayUntilDue
    Date getDueDate();

    // EFFECTS: return status of this task
    boolean getStatus();

    // EFFECTS: return the ToDoLIst this task is belonged to
    ToDoList getListBelonged();

    // MODIFIES: this
    // EFFECTS: set this taskName to given taskName
    void setTaskName(String taskName);

    // MODIFIES: this
    // EFFECTS: set this dueDate to given year, month, date
    void setDueDate(String dueDate) throws ParseException;

    // MODIFIES: this
    // EFFECTS: set this overdue to given overdue
    void setStatus(boolean overdue);

    // MODIFIES: this
    // EFFECTS: set the ToDOList this task belonged to
    void setListBelonged(ToDoList list);

    // MODIFIES: this
    // EFFECTS: remove listBelonged of this task
    void removeListBelonged(ToDoList list) throws TaskNotFoundException;

    // EFFECTS: return true if this task is due, false otherwise
    boolean isOverdue();

    boolean closeToDue();

    int getDayUntilDue();

}
