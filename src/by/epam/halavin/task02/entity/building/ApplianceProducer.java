package by.epam.halavin.task02.entity.building;

import java.util.HashMap;
import java.util.Map;

import by.epam.halavin.task02.entity.criteria.SearchCriteria;
import by.epam.halavin.task02.entity.Appliance;

public class ApplianceProducer {
	ApplianceBuilder builder;
	Appliance[] apps;
	Map<String, ApplianceBuilder> map = new HashMap<>();
	{
		map.put(SearchCriteria.Oven.class.getSimpleName(), new OvenBuilder());
		map.put(SearchCriteria.Laptop.class.getSimpleName(), new LaptopBuilder());
		map.put(SearchCriteria.Refrigerator.class.getSimpleName(), new RefrigeratorBuilder());
		map.put(SearchCriteria.Speakers.class.getSimpleName(), new SpeakersBuilder());
		map.put(SearchCriteria.TabletPC.class.getSimpleName(), new TabletPCBuilder());
		map.put(SearchCriteria.VacuumCleaner.class.getSimpleName(), new VacuumCleanerBuilder());
	}

	public void prepare(String builderName) {
		builder = map.get(builderName);
	}

	public Appliance[] produce(String... lines) {
		apps = new Appliance[lines.length];

		for (int i = 0; i < lines.length; i++) {
			apps[i] = builder.build(lines[i]);
		}
		return apps;
	}

}
