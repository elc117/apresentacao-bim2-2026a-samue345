
# Apresentação
Eu já tinha o java instalado na minha maquina, então basicamente só compilei o arquivos.
## Parte 1
  <img src="./part1/part1.gif" width="900" />

  A parte 1 foi bem tranquila, eu só precisei usar as fontes que estavam no site da disciplina para conseguir fazer. Enquanto estava implementando os métodos, encontrei um possível erro nesse método:
  ```
  public int daysLeft() {
    return dueDate.compareTo(LocalDate.now());
  }
  ```
  Acredito que esse método deveria calcular o número de dias até o vencimento da tarefa, porém o compareTo não calcula a diferença entre as datas. Eu modifiquei as datas afim de teste e vi que os valores não batiam. Coloquei o due date para 2026-11-01 e comparei com a data 2026-05-20 e o resultado deu 6, porque fez a subtraçao de 11 - 05.
## Parte 2
<img src="./part2/part2.gif" width="900" />

### Classes criadas
Quiz.java

<img width="1141" height="711" alt="image" src="https://github.com/user-attachments/assets/30159bf0-03b8-4f4f-8456-7a307fab5669" />

Question.java

<img width="1239" height="403" alt="image" src="https://github.com/user-attachments/assets/a0f0933b-f042-47ff-a425-65a5fb9b912f" />

MultipleChoiceQuestion.java

<img width="1186" height="452" alt="image" src="https://github.com/user-attachments/assets/b1cfd148-b74e-424f-b329-a670586663b1" />

TrueFalseQuestion.java

<img width="1220" height="320" alt="image" src="https://github.com/user-attachments/assets/1c448968-c842-4234-9d41-21e04152acd8" />

Também fo criada a classe main, porém ela é muito grande então vou colocar só um trecho

<img width="992" height="572" alt="image" src="https://github.com/user-attachments/assets/e386eb15-6f0c-4e71-8a32-8732feab96c7" />


# Fontes
* https://www.youtube.com/watch?v=Wgkb0zg7WOM&t=1s
* http://www.mauda.com.br/?p=1472
* https://www.w3schools.com/java/ref_keyword_super.asp
* https://materialpublic.imd.ufrn.br/curso/disciplina/2/8/8/4
* https://www.devmedia.com.br/uso-de-polimorfismo-em-java/26140
* https://medium.com/@AlexanderObregon/how-javas-super-keyword-works-in-method-calls-and-constructors-2365efdc0f80
