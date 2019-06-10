package com.company;

public class TFQ extends Question {

    private final String False = "False";
    private final String True = "True";

    public TFQ(String text, String answer) {
        super(text, answer);
    }

    public boolean checkAnswer(String answer){
        if (this.getAnswer().equals(answer)){
            System.out.println("صح");
            return true;
        }
        else
            System.out.println("خطا");
        return false;
    }

    @Override
    public String toString() {
        return "TFQ{" +
                "Text='" + super.getText()+ '_' +
                " True='" + True + '_' +
                "False='" + False + '_' +
                ", answer='" + super.getAnswer() + '_' +
                '}';
    }

    public String getFalse() {
        return False;
    }

    public String getTrue() {
        return True;
    }
}