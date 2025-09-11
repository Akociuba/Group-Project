public class QuizSolver {
    String ans;
    int num;
    public QuizSolver( String a, int n) {
        ans = a;
        num = n;
    }
    public boolean Answer(String ans, int num) {
        if (ans.equals(QuizMaker.corrects.get(num))){
            return true;
        } else{
            return false;
        }
    }
}