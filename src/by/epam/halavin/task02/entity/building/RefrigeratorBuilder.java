package by.epam.halavin.task02.entity.building;

import java.util.regex.Pattern;

import by.epam.halavin.task02.entity.Refrigerator;
import by.epam.halavin.task02.entity.criteria.SearchCriteria;
import by.epam.halavin.task02.entity.Appliance;
import by.epam.halavin.task02.entity.factory.RefrigeratorFactory;

public class RefrigeratorBuilder extends ApplianceBuilder {

	{
		factory = new RefrigeratorFactory();
	}

	@Override
	public Appliance build(String line) {
		Appliance appliance = factory.createAppliance();
		String value = null;

		Refrigerator refrigerator = (Refrigerator) appliance;

		for (String str : line.split("(,|;|:)")) {
			value = str.substring(str.indexOf(paramDelimeter) + 1, str.length());

			if (Pattern.matches("^.*" + SearchCriteria.Refrigerator.POWER_CONSUMPTION + ".*$", str)) {
				refrigerator.setPowerConsumption(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.Refrigerator.WEIGHT + ".*$", str)) {
				refrigerator.setWeight(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.Refrigerator.FREEZER_CAPACITY + ".*$", str)) {
				refrigerator.setFreezerCapacity(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.Refrigerator.OVERALL_CAPACITY + ".*$", str)) {
				refrigerator.setOverallCapacity(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.Refrigerator.HEIGHT + ".*$", str)) {
				refrigerator.setHeight(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.Refrigerator.WIDTH + ".*$", str)) {
				refrigerator.setWidth(Double.parseDouble(value));
			}

		}

		return refrigerator;
	}

}
