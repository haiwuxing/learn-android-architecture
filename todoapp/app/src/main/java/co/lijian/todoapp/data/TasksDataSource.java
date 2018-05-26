package co.lijian.todoapp.data;

/**
 * Main entry point for accessing tasks data.
 * <p>
 * For simplicity, only getTasks() and getTask() have callbacks. Consider adding callbacks to other
 * methods to inform the user of network/database errors or successful operations.
 * For example, when a new task is created, it's synchronously stored in cache but usually every
 * operation on database or network should be executed in a different thread.
 * 例如，当一个新任务被创建时，它会同步存储在缓存中，但通常每个数据库或网络操作都应该在不同的线程中执行。
 */
public interface TasksDataSource {
}
