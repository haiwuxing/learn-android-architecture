package co.lijian.todoapp.tasks;

import android.support.annotation.NonNull;

import co.lijian.todoapp.data.TasksRepository;

import static android.support.v4.util.Preconditions.checkNotNull;

/**
 * 监听来自 UI ({@link TasksFragment}) 的用户行为, 根据需要检索数据并更新 UI。
 */
public class TasksPresenter implements TasksContract.Presenter {

    private final TasksRepository mTasksRepository;

    private final TasksContract.View mTasksView;

    public TasksPresenter(@NonNull TasksRepository tasksRepository,
                          @NonNull TasksContract.View tasksView) {

        mTasksRepository = checkNotNull(tasksRepository, "tasksRepository 不能为空");
        mTasksView = checkNotNull(tasksView, "tasksView 不能为空");

        mTasksView.setPresnter(this);
    }

    @Override
    public void start() {

    }
}
