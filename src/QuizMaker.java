import java.util.ArrayList;
import java.util.Scanner;
public class QuizMaker {
    private String question;
    private String answer;
    private char correctAnswer;
    public static ArrayList<String> questions;
    public static ArrayList<String> answers;
    public static ArrayList<Character> corrects;
    public QuizMaker(String q, String a, char c) {
        question = q;
        answer = a;
        correctAnswer = c;
        questions = new ArrayList<String>();
        answers = new ArrayList<String>();
        corrects = new ArrayList<Character>();
    }
    public String makeQuestion(question) {
        questions.add(question);
        return "thanks";
    }
    public String makeAnswer(String answer) {
        answers.add(answer);
        return "thanks";
    }
    public String makeCorrectAnswer(char correctAnswer) {
        corrects.add(correctAnswer);
        return "thanks";
    }
}