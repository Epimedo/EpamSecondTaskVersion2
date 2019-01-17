package by.epam.halavin.task02.service.validation;

import by.epam.halavin.task02.entity.criteria.SearchCriteria.VacuumCleaner;

public class VacuumCleanerCriteriaSelect implements ValidatorCriteriaSelect {

	@Override
	public Object[] select() {
		return VacuumCleaner.values();
	}

}
