package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    public TextView story;
    public Button answerOne;
    public Button answerTwo;

    public Integer mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        story = (TextView) findViewById(R.id.storyTextView);
        answerOne = (Button) findViewById(R.id.buttonTop);
        answerTwo = (Button) findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        answerOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Destini", "Answer one selected!");
                if (mStoryIndex == 1) {
                    story.setText(R.string.T3_Story);
                    answerOne.setText(R.string.T3_Ans1);
                    answerTwo.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 2) {
                    story.setText(R.string.T3_Story);
                    answerOne.setText(R.string.T3_Ans1);
                    answerTwo.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 3) {
                    answerOne.setVisibility(View.GONE);
                    answerTwo.setVisibility(View.GONE);
                    story.setText(R.string.T6_End);
                }
            }


        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        answerTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Destini", "Answer one selected!");
                if (mStoryIndex == 1) {
                    story.setText(R.string.T2_Story);
                    answerOne.setText(R.string.T2_Ans1);
                    answerTwo.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    answerOne.setVisibility(View.GONE);
                    answerTwo.setVisibility(View.GONE);
                    story.setText(R.string.T4_End);
                } else if (mStoryIndex == 3) {
                    answerOne.setVisibility(View.GONE);
                    answerTwo.setVisibility(View.GONE);
                    story.setText(R.string.T5_End);

                }
            }
        });

    }
}
