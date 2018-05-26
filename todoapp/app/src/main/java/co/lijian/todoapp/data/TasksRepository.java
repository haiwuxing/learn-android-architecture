package co.lijian.todoapp.data;

/**
 * Concrete implementation to load tasks from the data sources into a cache.
 * <p>
 * For simplicity, this implements a dumb synchronisation between locally persisted data and data
 * obtained from the server, by using the remote data source only if the local database doesn't
 * exist or is empty.
 * <p></p>
 * 从数据源中加载任务到缓存中的具体实现。
 * <p></p>
 * 为了简单起见，这个类仅当本地数据库不存在或为空时，才通过远程数据源，
 * 实现本地持久数据和服务器数据之间的一个哑巴同步。
 */
public class TasksRepository implements TasksDataSource {
}
