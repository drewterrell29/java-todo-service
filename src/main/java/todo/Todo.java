package todo;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by antho on 5/8/2017.
 */
public class Todo {
    private final long id;
    private final String description;
    private final Date createTimeStamp;
    private final Date dueDate;

    // if no due date provided, default to today
    public Todo(long id, String desc) {
        this.id = id;
        this.description = desc;

        // Create a timestamp for the created todo
        Calendar calendar = Calendar.getInstance();
        this.createTimeStamp = calendar.getTime();
        this.dueDate = calendar.getTime();
    }

    public Todo(long id, String desc, Date due) {
        this.id = id;
        this.description = desc;
        this.dueDate = due;

        // Create a timestamp for the created todo
        Calendar calendar = Calendar.getInstance();
        this.createTimeStamp = calendar.getTime();
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    public Date getDueDate() {
        return dueDate;
    }
}
