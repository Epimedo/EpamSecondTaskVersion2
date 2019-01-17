package by.epam.halavin.task02.util.factory;

import by.epam.halavin.task02.util.read.FileInput;
import by.epam.halavin.task02.util.read.Input;

public class FileInputFactory extends InputFactory {
	private FileInput fileInput = new FileInput();

	@Override
	public Input createInput() {
		return fileInput;
	}

}
