import java.util.Arrays;
import java.util.Scanner;
/**
 * Class for question.
 */
class Question {
    /**
     * { var_description }.
     */
    private String questiontext;
    /**
     * { var_description }.
     */
    private String[] choices;
    /**
     * { var_description }.
     */
    private int correctAnswer;
    /**
     * { var_description }.
     */
    private int maxMarks;
    /**
     * { var_description }.
     */
    private int penalty;
    /**
     * { var_description }.
     */
    private String response;
    /**
     * Constructs the object.
     */
    Question() {

    }
    /**
     * Constructs the object.
     *
     * @param      question1       The question 1
     * @param      choices1        The choices 1
     * @param      correctAnswer1  The correct answer 1
     * @param      maxMarks1       The maximum marks 1
     * @param      penalty1        The penalty 1
     */
    
    /**
     * { function_description }.
     *
     * @param      choice  The choice
     *
     * @return     { description_of_the_return_value }
     */
    public boolean evaluateResponse(final String choice) {
        return false;
    }
    public Question(String questiontext, String[] choices, int correctAnswer, int maxMarks, int penalty,
			String response) {
		super();
		this.questiontext = questiontext;
		this.choices = choices;
		this.correctAnswer = correctAnswer;
		this.maxMarks = maxMarks;
		this.penalty = penalty;
		this.response = response;
	}

	public String getQuestiontext() {
		return questiontext;
	}

	public void setQuestiontext(String questiontext) {
		this.questiontext = questiontext;
	}

	public String[] getChoices() {
		return choices;
	}

	public void setChoices(String[] choices) {
		this.choices = choices;
	}

	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public int getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}

	public int getPenalty() {
		return penalty;
	}

	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "\nQuestion [questiontext=" + questiontext + ", choices=" + Arrays.toString(choices) + ", correctAnswer="
				+ correctAnswer + ", maxMarks=" + maxMarks + ", penalty=" + penalty + "]\n";
	}
	
}
/**
 * Class for quiz.
 */
class Quiz {
    @Override
	public String toString() {
		return "Quiz [questions=" + Arrays.toString(questions) + "]";
	}
	/**
     * { var_description }.
     */
    private final int onehundred = 100;
    /**
     * { var_description }.
     */
    private Question[] questions;
    /**
     * { var_description }.
     */
   
    private int size;
    public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	private static int i;
	/**
     * Constructs the object.
     */
    Quiz() {
    	questions=new Question[onehundred];
    }
    /**
     * Adds a question.
     *
     * @param      q     The question
     */
    public void addQuestion(final Question q) {
    	questions[i]=q;
    }
    /**
     * Gets the question.
     *
     * @param      index  The index
     *
     * @return     The question.
     */
    public Question getQuestion(final int index) {
        return questions[index];
    }
    /**
     * Shows the report.
     *
     * @return     { description_of_the_return_value }
     */
    public String showReport() {
        String s = "";
        return s;
    }

}
/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
            System.out.println(tokens.toString());
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      scan       The scan
     * @param      quiz       The quiz
     * @param      q          The question count
     *
     */
    public static void loadQuestions(final Scanner scan,
        final Quiz quiz, final int q) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
    	int i=0;
    	quiz.setSize(q);
    	while(i<q)
    	{
    		
    		 String[] tokens = scan.nextLine().split(":");
    	//	 System.out.println(tokens[0]);
    		 String[] cho  =tokens[1].split(":");
    		 
    		 
    		 quiz.addQuestion(new Question(tokens[0],cho,Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]),Integer.parseInt(tokens[4]),""));
    		 
  //public Question(String questiontext, String[] choices, int correctAnswer, int maxMarks, int penalty,
    //					String response) {
    		
    	i++;	
    	}
    	
    	
    }
    /**
     * Starts a quiz.
     *
     * @param      scan  The scan
     * @param      quiz  The quiz
     * @param      q     The answer count
     */
    public static void startQuiz(final Scanner scan,
        final Quiz quiz, final int q) {
        // write your code here to display the quiz questions on the console.
        // read the user responses from the console using scanner object.
        // store the user respone in the question object
    	for(int i=0;i<q;i++)
    	{
    	System.out.println(quiz.getQuestion(i).getQuestiontext());
    	System.out.println(Arrays.toString(quiz.getQuestion(i).getChoices()));
    	quiz.getQuestion(i).setResponse(scan.next());
    		
    	}
    }
    /**
     * Displays the score report.
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report using quiz object.
    	for(int i=0;i<quiz.getSize();i++)
    	{
    	System.out.println(quiz.getQuestion(i).getQuestiontext());
    	  	 String c[]=quiz.getQuestion(i).getChoices();
    	 if(quiz.getQuestion(i).getResponse().equals(c[quiz.getQuestion(i).getCorrectAnswer()]))
    	 {
    		 System.out.println(" Correct Answer! - Marks awarded "+quiz.getQuestion(i).getMaxMarks());
    	 }
    	 else
    		 System.out.println(" Wrong Answer! - Panality "+quiz.getQuestion(i).getPenalty());
    		 
    		 
    	 }
    }
}
