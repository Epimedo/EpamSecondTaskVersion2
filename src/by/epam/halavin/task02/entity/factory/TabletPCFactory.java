package by.epam.halavin.task02.entity.factory;

import by.epam.halavin.task02.entity.Appliance;
import by.epam.halavin.task02.entity.TabletPC;

public class TabletPCFactory extends ApplianceFactory {

	@Override
	public Appliance createAppliance() {
		return new TabletPC();
	}

}
