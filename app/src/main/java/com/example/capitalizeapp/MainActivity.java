// Write a program that accepts a string as input, capitalizes the first letter of each word in the
// string, and then returns the result string.
// Examples:
// "hi" => returns "Hi"
// "i love programming" => returns "I Love Programming"

package com.example.capitalizeapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void capitalizeWords(View view) {
        EditText inputEditText = findViewById(R.id.inputEditText);
        TextView resultTextView = findViewById(R.id.resultTextView);

        String input = inputEditText.getText().toString();
        String result = capitalizeFirstLetterOfEachWord(input);
        resultTextView.setText(result);
    }

    private String capitalizeFirstLetterOfEachWord(String input) {
        StringBuilder result = new StringBuilder();

        // Split the input string into words
        String[] words = input.split("\\s");

        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize the first letter of each word and append it to the result
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }

        // Trim any leading or trailing spaces and return the result
        return result.toString().trim();
    }
}
