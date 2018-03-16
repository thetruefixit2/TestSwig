package ru.dbelevtsev.ndkswing;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import ru.dbelevtsev.ndkswing.core.Man;

/**
 * Created by Daniil Belevtsev on 16.03.2018 1:10.
 * Project: NDKSwing
 */

public class MainActivity extends AppCompatActivity {

    private Man creator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.sample_text);
        creator = new Man();
        textView.setText(creator.Hello("traveler"));
        System.out.println((creator.Hello("traveler")));
        creator.delete();
    }
}
