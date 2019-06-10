package com.company;

public class MQ extends Question {
    private String choice1;
    private String choice2;
    private String choice3;

    public MQ(String text, String answer) {
        super(text, answer);
    }

    public MQ(String text, String answer, String choice1, String choice2, String choice3) {
        super(text, answer);
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
    }
    public boolean checkAnswer(String a){
        if (super.getAnswer().equals(a)){
            System.out.println("صح");
            return true;
        }
        else
        return false;
    }

    @Override
    public String toString() {
        return "MQ{" +
                "Text='" + super.getText()+ "_" +
                "choice1='" + choice1 + "_" +
                ", choice2='" + choice2 + "_" +
                ", choice3='" + choice3 + "_" +
                ", answer='" + super.getAnswer() + '_' +
                '}';
    }

    public String getChoice1() {
        return choice1;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    public String getChoice2() {
        return choice2;
    }

    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    public String getChoice3() {
        return choice3;
    }

    public void setChoice3(String choice3) {
        this.choice3 = choice3;
    }




}
