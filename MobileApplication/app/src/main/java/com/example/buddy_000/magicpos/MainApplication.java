package com.example.buddy_000.magicpos;

import android.app.Application;

import com.example.buddy_000.magicpos.database.AppDatabase;

/**
 * Created by buddy_000 on 25-02-2018.
 */

public class MainApplication extends Application {
    private AppExecutors mAppExecutors;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppExecutors = new AppExecutors();
    }

    public AppDatabase getDatabase() {
        return AppDatabase.getInstance(this, mAppExecutors);
    }

    public DataRepository getRepository() {
        return DataRepository.getInstance(getDatabase());
    }
}
