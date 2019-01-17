package by.epam.halavin.task02.entity.building;

import java.util.regex.Pattern;

import by.epam.halavin.task02.entity.TabletPC;
import by.epam.halavin.task02.entity.criteria.SearchCriteria;
import by.epam.halavin.task02.entity.Appliance;
import by.epam.halavin.task02.entity.factory.TabletPCFactory;

public class TabletPCBuilder extends ApplianceBuilder {

	{
		factory = new TabletPCFactory();
	}

	@Override
	public Appliance build(String line) {
		Appliance appliance = factory.createAppliance();
		String value = null;

		TabletPC tabletPc = (TabletPC) appliance;

		for (String str : line.split("(,|;|:)")) {
			value = str.substring(str.indexOf(paramDelimeter) + 1, str.length());

			if (Pattern.matches("^.*" + SearchCriteria.TabletPC.BATTERY_CAPACITY + ".*$", str)) {
				tabletPc.setBataryCapacity(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.TabletPC.DISPLAY_INCHES + ".*$", str)) {
				tabletPc.setDisplayInchs(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.TabletPC.MEMORY_ROM + ".*$", str)) {
				tabletPc.setMemoryRom(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY + ".*$", str)) {
				tabletPc.setFlashMemoryCapacity(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + SearchCriteria.TabletPC.COLOR + ".*$", str)) {
				tabletPc.setColor(value.trim());
			}

		}

		return tabletPc;
	}

}
