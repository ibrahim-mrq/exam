package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        String path2 = "D:\\AllQ.txt";

        System.out.println("أدخل اسم المستخدم  :");
        String user = s.nextLine();
        System.out.println("أدخل كلمة المرور ");
        String pass = s.nextLine();

        int choice;
        ArrayList data = new ArrayList();

        try {
            PrintWriter pw = new PrintWriter(path2);

            do {
                System.out.println("1_ أضف سؤال");
                System.out.println("2_ أضف سؤال اختر من متعدد");
                System.out.println("3_ أدخل سؤال صح و خطأ");
                System.out.println("4_ اطبع الأسئلة");
                System.out.println("5_ إعدادات الامتحان ");
                System.out.println("6_ خروج");
                System.out.println("أدخل الاختيار");
                choice = s.nextInt();

                if (choice == 1) {
                    Scanner s1 = new Scanner(System.in);
                    System.out.println("أدخل سؤال :");
                    String t = s1.nextLine();
                    System.out.println("أدخل الاجابة");
                    String a = s1.nextLine();
                    Question q = new Question(t, a);
                    data.add(q);
                    pw.write("Q" + "\n");
                    pw.write(q.getText() + "\n");
                    pw.write(q.getAnswer() + "\n");
                } else if (choice == 2) {
                    Scanner s2 = new Scanner(System.in);
                    System.out.println("أدخل سؤال :");
                    String t1 = s2.nextLine();
                    System.out.println("أدخل الاجابة");
                    String a1 = s2.nextLine();
                    System.out.println("أدخل الااختيار الاول : ");
                    String c1 = s2.nextLine();
                    System.out.println("أدخل الااختيار الثاني :");
                    String c2 = s2.nextLine();
                    System.out.println("أدخل الااختيار الثالث :");
                    String c3 = s2.nextLine();
                    MQ m = new MQ(t1, a1, c1, c2, c3);
                    data.add(m);
                    pw.write("M" + "\n");
                    pw.write(m.getText() + "\n");
                    pw.write(m.getChoice1() + "\n");
                    pw.write(m.getChoice2() + "\n");
                    pw.write(m.getChoice3() + "\n");
                    pw.write(m.getAnswer() + "\n");
                } else if (choice == 3) {
                    Scanner s3 = new Scanner(System.in);
                    System.out.println("أدخل سؤال :");
                    String t2 = s3.nextLine();
                    System.out.println("أدخل الاجابة");
                    String a2 = s3.nextLine();
                    TFQ tf = new TFQ(t2, a2);
                    data.add(tf);
                    pw.write("T" + "\n");
                    pw.write(tf.getText() + "\n");
                    pw.write(tf.getTrue() + "\n");
                    pw.write(tf.getFalse() + "\n");
                    pw.write(tf.getAnswer() + "\n");
                } else if (choice == 4) {
                    for (int i = 0; i < data.size(); i++) {
                        System.out.println(data.get(i));
                    }
                } else if (choice == 5) {
                    pw.write(data.size() + "\n");
                } else if (choice == 6) {
                    System.out.println("تم الخروج بنجاح");
                    pw.write(data.size() + "\n");
                    pw.close();
                    break;
                }


            }
            while (choice != 6) ;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}






