package com.example.androidfundamentals;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button toastbutton,count;
    TextView textview;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastbutton = findViewById(R.id.Toastbutton);
        count = findViewById(R.id.Count);
        textview = findViewById(R.id.View);
        textview.setText(String.valueOf(counter));
        textview.setBackgroundColor(Color.YELLOW);

        toastbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast =  Toast.makeText(MainActivity.this, "Hello Toast", Toast.LENGTH_SHORT);
                toast.show();
                System.out.println("clocked");
            }
        }
    );
        count.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
                counter++;
                textview.setText(String.valueOf(counter));
        }
});
    }

}
