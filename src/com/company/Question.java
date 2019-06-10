package com.company;

public class Question {
    private String text;
    private String answer;

    public Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public boolean checkAnswer(String answer){
        if (this.answer.equals(answer)){
            System.out.println("صح");
            return true;
        }
        else
            System.out.println("خطا");
            return false;
    }

    @Override
    public String toString() {
        return "Question{" +
                "text='" + text + '_' +
                ", answer='" + answer + '_' +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
