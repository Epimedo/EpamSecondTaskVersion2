package by.epam.halavin.task02.entity.building;

import java.util.regex.Pattern;

import by.epam.halavin.task02.entity.Speakers;
import by.epam.halavin.task02.entity.criteria.SearchCriteria;
import by.epam.halavin.task02.entity.Appliance;
import by.epam.halavin.task02.entity.factory.SpeakersFactory;

public class SpeakersBuilder extends ApplianceBuilder {

	{
		factory = new SpeakersFactory();
	}

	@Override
	public Appliance build(String line) {
		Appliance appliance = factory.createAppliance();
		String value = null;

		Speakers oven = (Speakers) appliance;

		for (String str : line.split("(,|;|:)")) {
			value = str.substring(str.indexOf(paramDelimeter) + 1, str.length());

			if (Pattern.matches("^.*" + SearchCriteria.Speakers.POWER_CONSUMPTION + ".*$", str)) {
				oven.setPowerConsumption(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.Speakers.NUMBER_OF_SPEAKERS + ".*$", str)) {
				oven.setNumberOfSpeakers(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.Speakers.FREQUENCY_RANGE + ".*$", str)) {
				oven.setFrequencyRange(value);
			} else if (Pattern.matches("^.*" + SearchCriteria.Speakers.CORD_LENGTH + ".*$", str)) {
				oven.setCordLength(Integer.parseInt(value));
			}

		}

		return oven;
	}

}
