//Sam Wahbeh
//1367607
//stwahbeh

public class Executor {

	public static void main(String[] args) {
		Utility.init(); // initializes file readers
		String[] questions = Utility.readQuestions(); //reads question.txt file into questions array
		String[] answers = Utility.readAnswers(); // reads answers.txt file into answers array		
		int numOracles = answers.length; //finds the number of oracles
		ArrayQueue [] queueArray = new ArrayQueue[numOracles];	//initializes our ArrayQueue
		for (int i = 0; i < numOracles; i++){   
			queueArray[i] = new ArrayQueue();
		}
		for	(int i = 0; i < questions.length; i++){ //randomly assigns questions to oracles
			int randomNum = Utility.random(numOracles);
			queueArray[randomNum].enqueue(questions[i]);
		}
		int questionsAnswered = 0;
		while (questionsAnswered != questions.length){ //reads oracles answers to the questions
			for (int i = 0; i < numOracles; i++){
				if (!queueArray[i].isEmpty()){
					questionsAnswered++;
					System.out.print (queueArray[i].dequeue() + ": ");
					System.out.println (answers[i]);
					
				}
		
			}
			
		}				
	
		for (int i = 0; i < 175; i++){  //Prints spacing between 
			System.out.print ("-");	//different implementations
		}

		ListQueue[] queueList = new ListQueue[numOracles]; 
		for (int i = 0; i < numOracles; i++){
			queueList[i] = new ListQueue();			
		}
		for	(int i = 0; i < questions.length; i++){ //gives oracles questions randomly
			int randomNum = Utility.random(numOracles);
			queueList[randomNum].enqueue(questions[i]);
		}
		questionsAnswered = 0;
		while (questionsAnswered != questions.length){ //reads the answers the oracles give
			for (int i = 0; i < numOracles; i++){
				if (!queueList[i].isEmpty()){
					questionsAnswered++;
					System.out.print (queueList[i].dequeue() + ": ");
					System.out.println (answers[i]);
					
				}
		
			}
			
		}
	}
}

		
		
		
		
		
		
