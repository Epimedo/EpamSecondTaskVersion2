package by.epam.halavin.task02.entity.factory;

import by.epam.halavin.task02.entity.Appliance;
import by.epam.halavin.task02.entity.VacuumCleaner;

public class VacuumCleanerFactory extends ApplianceFactory {

	@Override
	public Appliance createAppliance() {
		return new VacuumCleaner();
	}

}
