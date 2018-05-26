package co.lijian.todoapp.data;

/**
 * Implementation of a remote data source with static access to the data for easy testing.
 */
public class FakeTasksRemoteDataSource implements TasksDataSource{

    private static FakeTasksRemoteDataSource INSTANCE;

    public static FakeTasksRemoteDataSource getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FakeTasksRemoteDataSource();
        }
        return INSTANCE;
    }
}
