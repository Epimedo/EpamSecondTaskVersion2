package by.epam.halavin.task02.entity.building;

import java.util.regex.Pattern;

import by.epam.halavin.task02.entity.VacuumCleaner;
import by.epam.halavin.task02.entity.criteria.SearchCriteria;
import by.epam.halavin.task02.entity.Appliance;
import by.epam.halavin.task02.entity.factory.VacuumCleanerFactory;

public class VacuumCleanerBuilder extends ApplianceBuilder {

	{
		factory = new VacuumCleanerFactory();
	}

	@Override
	public Appliance build(String line) {
		Appliance appliance = factory.createAppliance();
		String value = null;

		VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;

		for (String str : line.split("(,|;|:)")) {
			value = str.substring(str.indexOf(paramDelimeter) + 1, str.length());

			if (Pattern.matches("^.*" + SearchCriteria.VacuumCleaner.POWER_CONSUMPTION + ".*$", str)) {
				vacuumCleaner.setPowerConsumption(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.VacuumCleaner.FILTER_TYPE + ".*$", str)) {
				vacuumCleaner.setFilterType(value);
			} else if (Pattern.matches("^.*" + SearchCriteria.VacuumCleaner.BAG_TYPE + ".*$", str)) {
				vacuumCleaner.setBagType(value);
			} else if (Pattern.matches("^.*" + SearchCriteria.VacuumCleaner.WAND_TYPE + ".*$", str)) {
				vacuumCleaner.setWandType(value);
			} else if (Pattern.matches("^.*" + SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION + ".*$", str)) {
				vacuumCleaner.setMotoSpeedRegulation(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.VacuumCleaner.CLEANING_WIDTH + ".*$", str)) {
				vacuumCleaner.setCleaningWidth(Integer.parseInt(value));
			}

		}

		return vacuumCleaner;
	}

}
