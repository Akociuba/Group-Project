import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuizMaker quiz = new QuizMaker("h", "H", "h");
        System.out.println("How many questions do you want to make?");
        int numqs = sc.nextInt();
        int i = 1;
        while (i <= numqs) {
            System.out.println("What is your question?");
            String qus = sc.nextLine();
            quiz.makeQuestion(qus);
            System.out.println("What is your first answer choice (a)?");
            String ansa = sc.nextLine();
            quiz.makeAnswer(ansa);
            System.out.println("What is your second answer choice (b)?");
            String ansb = sc.nextLine();
            quiz.makeAnswer(ansb);
            System.out.println("What is your third answer choice (c)?");
            String ansc = sc.nextLine();
            quiz.makeAnswer(ansc);
            System.out.println("What is your fourth answer choice (d)?");
            String ansd = sc.nextLine();
            quiz.makeAnswer(ansd);
            System.out.println("What is the correct answer (type a, b, c, or d)?");
            String cor = sc.nextLine();
            quiz.makeCorrectAnswer(cor);
            i++;
        }
    }
}