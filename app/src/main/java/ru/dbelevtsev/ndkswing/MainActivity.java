package ru.dbelevtsev.ndkswing;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import ru.dbelevtsev.ndkswing.gen.HelloWorld;

/**
 * Created by Daniil Belevtsev on 16.03.2018 1:10.
 * Project: NDKSwing
 */

public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("HelloWorld");
    }

    private HelloWorld creator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        creator = new HelloWorld();
        System.out.println(creator.hello_world("hello"));
    }
}
