package ru.dbelevtsev.ndkswing;

import android.app.Application;

/**
 * Created by Daniil Belevtsev on 16.03.2018 13:45.
 * Project: TestSwig
 */

public class TheApp extends Application {
    static {
        System.loadLibrary("NativeLib_Wrapper");
    }
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
