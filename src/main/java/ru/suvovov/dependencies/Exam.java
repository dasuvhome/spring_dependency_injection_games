package main.java.ru.suvovov.dependencies;

public class Exam {

    private AnswerChecker answerChecker;

    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void setAnswerChecker(AnswerChecker answerChecker) {
        this.answerChecker = answerChecker;
        System.out.println("We`ve answerChecker using setter.");
    }

    public void examCheck(){
        answerChecker.checkAnswer();
    }
}
