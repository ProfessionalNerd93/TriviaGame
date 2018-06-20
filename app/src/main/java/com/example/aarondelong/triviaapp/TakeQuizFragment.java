package com.example.aarondelong.triviaapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TakeQuizFragment extends Fragment {

    @BindView(R.id.quiz_question_textview)
    protected TextView quizQuestion;

    @BindView(R.id.first_answer_button)
    protected Button firstAnswerButton;

    @BindView(R.id.second_answer_button)
    protected Button secondAnswerButton;

    @BindView(R.id.first_answer_button)
    protected Button thirdAnswerButton;

    @BindView(R.id.fourth_answer_button)
    protected Button fourthAnswerButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_take_quiz, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    public static TakeQuizFragment newInstance() {

        Bundle args = new Bundle();

        TakeQuizFragment fragment = new TakeQuizFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @OnClick(R.id.first_answer_button)
    protected void firstAnswerClicked() {

    }
    @OnClick(R.id.second_answer_button)
    protected void secondAnswerClicked() {

    }

    @OnClick(R.id.third_answer_button)
    protected void thirdAnswerClicked() {

    }

    @OnClick(R.id.fourth_answer_button)
    protected void fourthAnswerClicked() {

    }

    @OnClick(R.id.next_button)
    protected void nextButtonClicked() {

    }

}
