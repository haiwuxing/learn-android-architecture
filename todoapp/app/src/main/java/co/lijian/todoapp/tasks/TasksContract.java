package co.lijian.todoapp.tasks;

import co.lijian.todoapp.BasePresenter;
import co.lijian.todoapp.BaseView;

/**
 * 用于指定 the view 和 the presenter 之间的 contract。
 */
public interface TasksContract {

    interface View extends BaseView<Presenter> {

        void showAddTask();

        void showSuccessfullySavedMessage();
    }

    interface Presenter extends BasePresenter {

        void addNewTask();

        void result(int requestCode, int resultCode);
    }
}
