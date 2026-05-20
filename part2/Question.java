class Question {
    protected String statement;
    protected String correctAnswer;

    public Question(String statement, String correctAnswer) {
        this.statement = statement;
        this.correctAnswer = correctAnswer;
    }

    public void showQuestion() {
        System.out.println(statement);
    }

    public boolean checkAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
}
