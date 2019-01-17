package by.epam.halavin.task02.service.validation;

import by.epam.halavin.task02.entity.criteria.SearchCriteria.Refrigerator;

public class RefrigeratorCriteriaSelect implements ValidatorCriteriaSelect {

	@Override
	public Object[] select() {
		return Refrigerator.values();
	}

}
