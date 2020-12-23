package ua.academy.lgs;

public class Dog implements Pet {
	public Dog() {

	}

	@Override
	public void voice() {
		System.out.println("I am dog and I am barking");
	}
}
