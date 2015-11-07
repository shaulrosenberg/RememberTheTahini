package com.rosenberg.shaul.secondassignment;

/**
 * Created by Shaul on 07/11/15.
 */
public class taskItem {
    public int itemId;
    public String itemName;
    String description;

    // constructor
    public taskItem(int itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public long getTaskId() {
        return itemId;
    }

    public void setTaskId(int taskId) {
        this.itemId = taskId;
    }
}
