package com.example.android.todothis.db;

/**
 * Created by Prodigy on 1/24/2019.
 */
import android.provider.BaseColumns;

public class TaskContract {
    public static final String DB_NAME = "com.example.android.todothis.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
