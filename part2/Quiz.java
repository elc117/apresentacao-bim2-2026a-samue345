import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class Quiz {
    private List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void checkQuestion(int index, String answer) {
        Question question = questions.get(index);

        if (question.checkAnswer(answer)) {
            System.out.println("Resposta correta!");
        } else {
            System.out.println("Resposta errada!");
        }
    }

    public void showQuestions() {
        for (Question question : questions) {
            question.showQuestion();
            System.out.println();
        }
    }
    
    public List<Question> getQuestions() {
       return questions;
    }
}