public class QuizSolver {
    public QuizSolver() {

    }
    public boolean Answer(String ans, int num) {
        if (ans.equals(QuizMaker.corrects.get(num))){
            return true;
        } else{
            return false;
        }
    }
}