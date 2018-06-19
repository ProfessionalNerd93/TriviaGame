package com.example.aarondelong.triviaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private QuestionCreatorFragment questionCreatorFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.add_question_button)
    protected void addQuestionClicked() {

        questionCreatorFragment = QuestionCreatorFragment.newInstance();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_holder, questionCreatorFragment).commit();


    }
}
