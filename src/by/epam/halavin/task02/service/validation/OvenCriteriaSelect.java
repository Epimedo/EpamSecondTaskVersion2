package by.epam.halavin.task02.service.validation;

import by.epam.halavin.task02.entity.criteria.SearchCriteria.Oven;

public class OvenCriteriaSelect implements ValidatorCriteriaSelect {

	@Override
	public Object[] select() {
		return Oven.values();
	}

}
