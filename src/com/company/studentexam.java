package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class studentexam {

    public static void main(String[] args) {
        String path = "D:\\AllQ.txt";
        Scanner s = new Scanner(System.in);
        File file = new File(path);
        ArrayList<Question> data = new ArrayList<>();
        Question q = null;
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String a = sc.nextLine();

                if (a.equals("Q")) {
                    String text = sc.nextLine();
                    String answer = sc.nextLine();
                    q = new Question(text, answer);
                    data.add(q);
                } else if (a.equals("M")) {
                    String t = sc.nextLine();
                    String ch1 = sc.nextLine();
                    String ch2 = sc.nextLine();
                    String ch3 = sc.nextLine();
                    String an = sc.nextLine();
                    MQ m = new MQ(t, ch1, ch2, ch3, an);
                    data.add(m);

                } else if (a.equals("T")) {
                    String t = sc.nextLine();
                    String an = sc.nextLine();
                    TFQ TF = new TFQ(t, an);
                    data.add(TF);
                }
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).getText());
            System.out.println("أدخل الجواب هنا : ");
            String answer = s.nextLine();
            if (q.checkAnswer(answer)) {
                System.out.println("الإجابة صحيحة");

            }
        }

    }

}
