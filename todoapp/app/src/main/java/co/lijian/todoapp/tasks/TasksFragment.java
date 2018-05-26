package co.lijian.todoapp.tasks;

import android.support.v4.app.Fragment;

/**
 * Display a grid of {@link Task}s. User can choose to view all, active or completed tasks.
 */
public class TasksFragment extends Fragment implements TasksContract.View {

    public static TasksFragment newInstance() {
        return new TasksFragment();
    }

    @Override
    public void setPresnter(TasksContract.Presenter presnter) {

    }
}
