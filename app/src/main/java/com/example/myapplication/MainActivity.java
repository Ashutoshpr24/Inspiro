package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] quotes = {
            "Believe in yourself.",
            "Success is not final, failure is not fatal.",
            "Dream big. Start small. Act now.",
            "Push yourself, because no one else will.",
            "Stay positive. Work hard. Make it happen.",
            "Your only limit is your mind.",
            "The only way to do great work is to love what you do.",
            "Don't let yesterday take up too much of today.",
            "You are never too old to set another goal or to dream a new dream",
            "The best way to predict the future is to create it.",
            "The only limit to our realization of tomorrow will be our doubts of today.",
            "The only thing we have to fear is fear itself.",
            "The only thing standing between you and your goal is the story you keep telling yourself as to why you can't achieve it",
            "The only place where success comes before work is in the dictionary.",
            "Success is not in what you have, but who you are.",
            "The only person you should try to be better than is the person you were yesterday.",
            "The only person you are destined to become is the person you decide to be.",
            "It does not matter how slowly you go as long as you do not stop.",
            "Happiness is not something ready made. It comes from your own actions.",
            "It is during our darkest moments that we must focus to see the light."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView quoteText = findViewById(R.id.quoteText);
        Button newQuoteBtn = findViewById(R.id.newQuoteBtn);

        newQuoteBtn.setOnClickListener(v -> {
            Random random = new Random();
            int index = random.nextInt(quotes.length);
            quoteText.setText(quotes[index]);
        });
    }
}
