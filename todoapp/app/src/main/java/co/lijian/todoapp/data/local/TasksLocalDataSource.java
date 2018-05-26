package co.lijian.todoapp.data.local;

import android.support.annotation.NonNull;

import co.lijian.todoapp.data.TasksDataSource;
import co.lijian.todoapp.util.AppExecutors;

/**
 * Concrete implementation of a data source as a db.
 */
public class TasksLocalDataSource implements TasksDataSource{

    private static volatile TasksLocalDataSource INSTANCE;

    private TasksDao mTasksDao;

    private AppExecutors mAppExecutors;

    // Prevent direct instantiation.
    private TasksLocalDataSource(@NonNull AppExecutors appExecutors,
                                 @NonNull TasksDao tasksDao) {
        mAppExecutors = appExecutors;
        mTasksDao = tasksDao;
    }

    public static TasksLocalDataSource getInstance(@NonNull AppExecutors appExecutors,
                                                   @NonNull TasksDao tasksDao) {
        if (INSTANCE == null) {
            synchronized (TasksLocalDataSource.class) {
                if (INSTANCE == null) {
                    INSTANCE = new TasksLocalDataSource(appExecutors, tasksDao);
                }
            }
        }
        return INSTANCE;
    }
}
