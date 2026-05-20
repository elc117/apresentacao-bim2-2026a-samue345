import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Quiz quiz = new Quiz();

        quiz.addQuestion(
                new TrueFalseQuestion(
                        "Java possui herança?",
                        true
                )
        );

        List<String> options = new ArrayList<>();

        options.add("extends");
        options.add("inherit");
        options.add("super");
        options.add("class");

        quiz.addQuestion(
                new MultipleChoiceQuestion(
                        "Qual palavra é usada para herança em Java?",
                        options,
                        "extends"
                )
        );

        System.out.println("=== QUIZ ===");

        for (Question question : quiz.getQuestions()) {

            question.showQuestion();

            System.out.print("Digite sua resposta: ");
            String answer = scanner.nextLine();

            if (question.checkAnswer(answer)) {
                System.out.println("Resposta correta!");
            } 
            else {
                System.out.println("Resposta errada! A resposta correta é: " + question.correctAnswer);
            }

            System.out.println();
        }

        scanner.close();
    }
}