package by.epam.halavin.task02.service.validation;

import by.epam.halavin.task02.entity.criteria.SearchCriteria.Laptop;

public class LaptopCriteriaSelect implements ValidatorCriteriaSelect {

	@Override
	public Object[] select() {
		return Laptop.values();
	}

}
