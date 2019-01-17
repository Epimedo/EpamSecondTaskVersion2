package by.epam.halavin.task02.util.factory;

import by.epam.halavin.task02.util.read.Input;

public abstract class InputFactory {

	public Input getInput() {
		Input in = createInput();
		return in;
	}

	abstract public Input createInput();
}
