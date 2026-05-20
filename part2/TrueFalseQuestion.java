class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String statement, boolean correctAnswer) {
        super(statement, correctAnswer ? "verdadeiro" : "falso");
    }

    @Override
    public void showQuestion() {
        System.out.println("Verdadeiro ou falso:");
        System.out.println(statement);
    }
}
