package by.epam.halavin.task02.entity.building;

import by.epam.halavin.task02.entity.Appliance;
import by.epam.halavin.task02.entity.factory.ApplianceFactory;

public abstract class ApplianceBuilder {
	protected ApplianceFactory factory;
	protected final char paramDelimeter = '=';

	abstract public Appliance build(String str);
}
