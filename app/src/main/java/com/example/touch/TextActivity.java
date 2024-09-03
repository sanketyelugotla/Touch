package com.example.touch;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class TextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        // Get the meal type from the intent
        String mealType = getIntent().getStringExtra("MEAL_TYPE");

        // Set the long screenshot
        ImageView mealImage = findViewById(R.id.meal_image);
        mealImage.setImageResource(R.drawable.meal_page_4);

        // Set the text based on the meal type
        TextView mealTypeText = findViewById(R.id.meal_type);
        mealTypeText.setText(mealType);

        // Set the GIF using Glide
        ImageView messGif = findViewById(R.id.mess_gif);
        Glide.with(this)
                .asGif()
                .load(R.drawable.mess_gif) // Make sure mess_gif is a valid GIF in your drawable folder
                .into(messGif);
    }
}