package by.epam.halavin.task02.entity.building;

import java.util.regex.Pattern;

import by.epam.halavin.task02.entity.Laptop;
import by.epam.halavin.task02.entity.criteria.SearchCriteria;
import by.epam.halavin.task02.entity.Appliance;
import by.epam.halavin.task02.entity.factory.LaptopFactory;

public class LaptopBuilder extends ApplianceBuilder{

	{
		factory = new LaptopFactory();
	}
	
	@Override
	public Appliance build(String line) {
		Appliance appliance = factory.createAppliance();
		String value = null;

		Laptop laptop = (Laptop) appliance;
		
		for (String str : line.split("(,|;|:)")) {
			value = str.substring(str.indexOf(paramDelimeter) + 1, str.length());

			if (Pattern.matches("^.*" + SearchCriteria.Laptop.BATTERY_CAPACITY + ".*$", str)) {
				laptop.setBataryCapacity(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.Laptop.OS + ".*$", str)) {
				laptop.setOs(value);
			} else if (Pattern.matches("^.*" + SearchCriteria.Laptop.MEMORY_ROM + ".*$", str)) {
				laptop.setMemoryRom(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.Laptop.SYSTEM_MEMORY + ".*$", str)) {
				laptop.setSystemMemory(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.Laptop.CPU + ".*$", str)) {
				laptop.setCpu(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.Laptop.DISPLAY_INCHS + ".*$", str)) {
				laptop.setDisplayInchs(Double.parseDouble(value));
			}

		}

		return laptop;
	}

}
