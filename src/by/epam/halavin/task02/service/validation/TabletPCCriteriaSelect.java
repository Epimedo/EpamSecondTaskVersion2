package by.epam.halavin.task02.service.validation;

import by.epam.halavin.task02.entity.criteria.SearchCriteria.TabletPC;

public class TabletPCCriteriaSelect implements ValidatorCriteriaSelect {

	@Override
	public Object[] select() {
		return TabletPC.values();
	}

}
