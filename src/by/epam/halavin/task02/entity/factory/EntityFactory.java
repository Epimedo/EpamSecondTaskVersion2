package by.epam.halavin.task02.entity.factory;

import by.epam.halavin.task02.entity.building.ApplianceProducer;

public class EntityFactory {
	private static final EntityFactory instance = new EntityFactory();

	private EntityFactory() {
	}

	public static EntityFactory getInstance() {
		return instance;
	}

	public ApplianceProducer getProducer() {
		return new ApplianceProducer();
	}
}
