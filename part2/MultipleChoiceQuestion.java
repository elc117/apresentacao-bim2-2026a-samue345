import java.util.List;

class MultipleChoiceQuestion extends Question {
    private List<String> options;

    public MultipleChoiceQuestion(String statement, List<String> options, String correctAnswer) {
        super(statement, correctAnswer);
        this.options = options;
    }

    @Override
    public void showQuestion() {
        System.out.println("Múltipla escolha: " + statement);

        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ") " + options.get(i));
        }
    }
}
