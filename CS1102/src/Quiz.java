
public class Quiz {
	
	public static void main(String[] args) {
		Question question1 = new MultipleChoiceQuestion("What is the name of the river that runs through London?", "Seine", "Nile", "Thames", "Ganges", "Amazon", "c");
		question1.check();
		
		Question question2 = new MultipleChoiceQuestion("What is the fifth day of the week?", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "d");
		question2.check();
		
		Question question3 = new MultipleChoiceQuestion("What is the biggest continent on Earth?", "Asia", "North America", "Europe", "Africa", "South America", "a");
		question3.check();
		
		Question question4 = new MultipleChoiceQuestion("What is the capital of Switzerland?", "Zurich", "Bern", "Geneva", "Berlin", "Prague", "b"); 
		question4.check();
		
		Question question5 = new MultipleChoiceQuestion("Budapest is the capital of which European country?", "Slovakia", "Denmark", "Serbia", "Bulgaria", "Hungary", "e");
		question5.check();
		
		Question question6 = new TrueFalseQuestion("Light travels in a straight line.", "TRUE");
		question6.check();
		
		Question question7 = new TrueFalseQuestion("The Mona Liza was stolen from the Louvre in 1911.", "TRUE");
		question7.check();
		
		Question question8 = new TrueFalseQuestion("Electrons move faster than the speed of light.", "FALSE");
		question8.check();
		
		Question question9 = new TrueFalseQuestion("Ostriches can't fly.", "TRUE"); 
		question9.check();
		
		Question question10 = new TrueFalseQuestion("Trees existed before sharks.", "FALSE");
		question10.check();
		
		Question.showResults();
		
		
	}
	
}
