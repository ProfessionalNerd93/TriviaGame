package com.example.aarondelong.triviaapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Question implements Parcelable {

    private String questions;
    private String correctAnswer;
    private String wrongAnswerOne;
    private String wrongAnswerTwo;
    private String wrongAnswerThree;

    public Question(String question, String correctAnswer, String wrongAnswerOne, String wrongAnswerTwo, String wrongAnswerThree) {
        this.questions = question;
        this.correctAnswer = correctAnswer;
        this.wrongAnswerOne = wrongAnswerOne;
        this.wrongAnswerTwo = wrongAnswerTwo;
        this.wrongAnswerThree = wrongAnswerThree;
    }

    protected Question(Parcel in) {
        questions = in.readString();
        correctAnswer = in.readString();
        wrongAnswerOne = in.readString();
        wrongAnswerTwo = in.readString();
        wrongAnswerThree = in.readString();
    }

    public static final Creator<Question> CREATOR = new Creator<Question>() {
        @Override
        public Question createFromParcel(Parcel in) {
            return new Question(in);
        }

        @Override
        public Question[] newArray(int size) {
            return new Question[size];
        }
    };

    public String getQuestion() {
        return questions;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getWrongAnswerOne() {
        return wrongAnswerOne;
    }

    public String getWrongAnswerTwo() {
        return wrongAnswerTwo;
    }

    public String getWrongAnswerThree() {
        return wrongAnswerThree;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(questions);
        parcel.writeString(correctAnswer);
        parcel.writeString(wrongAnswerOne);
        parcel.writeString(wrongAnswerTwo);
        parcel.writeString(wrongAnswerThree);
    }
}
