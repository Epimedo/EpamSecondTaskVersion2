package by.epam.halavin.task02.entity.building;

import java.util.regex.Pattern;

import by.epam.halavin.task02.entity.Oven;
import by.epam.halavin.task02.entity.criteria.SearchCriteria;
import by.epam.halavin.task02.entity.Appliance;
import by.epam.halavin.task02.entity.factory.OvenFactory;

public class OvenBuilder extends ApplianceBuilder {

	{
		factory = new OvenFactory();
	}

	@Override
	public Appliance build(String line) {
		Appliance appliance = factory.createAppliance();
		String value = null;

		Oven oven = (Oven) appliance;
		for (String str : line.split("(,|;|:)")) {
			value = str.substring(str.indexOf(paramDelimeter) + 1, str.length());

			if (Pattern.matches("^.*" + SearchCriteria.Oven.POWER_CONSUMPTION + ".*$", str)) {
				oven.setPowerConsumption(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.Oven.CAPACITY + ".*$", str)) {
				oven.setCapacity(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.Oven.WEIGHT + ".*$", str)) {
				oven.setWeight(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.Oven.DEPTH + ".*$", str)) {
				oven.setDepth(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.Oven.HEIGHT + ".*$", str)) {
				oven.setHeight(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.Oven.WIDTH + ".*$", str)) {
				oven.setWidth(Double.parseDouble(value));
			}

		}

		return oven;
	}

}
