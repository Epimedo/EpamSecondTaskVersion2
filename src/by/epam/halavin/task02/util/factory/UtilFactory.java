package by.epam.halavin.task02.util.factory;

public class UtilFactory {
	private static UtilFactory factory;

	private UtilFactory() {

	}

	public static UtilFactory getInstance() {
		if (factory == null) {
			factory = new UtilFactory();
		}

		return factory;
	}

	public InputFactory newInputFactory() {
		return new FileInputFactory();
	}
}
