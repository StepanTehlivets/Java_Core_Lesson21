package ua.academy.lgs1;

public class Amphibia {
	myCurrentTask currentTask = (String task) -> System.out.println("I am currently " + task +"ing");

	
	
	
}
interface myCurrentTask{
	void currentTask(String task);

}