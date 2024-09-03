package com.example.touch;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        // Set the image on the second activity
        ImageView imageView = findViewById(R.id.second_screenshot);
        imageView.setImageResource(R.drawable.mess_page);

        // Set up button click listeners
        Button button1 = findViewById(R.id.open_second_page_button1);
        Button button2 = findViewById(R.id.open_second_page_button2);
        Button button3 = findViewById(R.id.open_second_page_button3);
        Button button4 = findViewById(R.id.open_second_page_button4);

        button1.setOnClickListener(v -> openTextActivity("Breakfast"));
        button2.setOnClickListener(v -> openTextActivity("Lunch"));
        button3.setOnClickListener(v -> openTextActivity("Dinner"));
        button4.setOnClickListener(v -> openTextActivity("Tea"));
    }

    private void openTextActivity(String meal) {
        Intent intent = new Intent(SecondActivity.this, TextActivity.class);
        intent.putExtra("MEAL_TYPE", meal);
        startActivity(intent);
    }
}
