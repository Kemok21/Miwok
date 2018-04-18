package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

//        String[] words = {"one", "two", "three", "four", "five",
//                        "six", "seven", "eight", "nine", "ten"};
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "lutti"));
        words.add(new Word("three", "lutti"));
        words.add(new Word("four", "lutti"));
        words.add(new Word("five", "lutti"));
        words.add(new Word("six", "lutti"));
        words.add(new Word("seven", "lutti"));
        words.add(new Word("eight", "lutti"));
        words.add(new Word("nine", "lutti"));
        words.add(new Word("ten", "lutti"));

//        WordAdapter adapter = new WordAdapter(this, R.layout.list_item, words);
//
//        ListView listView = (ListView) findViewById(R.id.list);
//
//        listView.setAdapter(adapter);

//        Log.v("NumbersActivity", "Word at index 0: " + words.get(0));

//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)
//        for(int index = 0; index<words.size(); index++) {
//            // Create a new TextView
//            TextView wordView = new TextView(this);
//            // Set the text to be word at the current index
//            wordView.setText(words.get(index));
//            // Add this TextView as another child to the root view of this layout
//            rootView.addView(wordView);
//            // Increment the index variable by 1
//        }
    }
}
