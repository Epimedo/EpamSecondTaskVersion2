package by.epam.halavin.task02.service.validation;

import by.epam.halavin.task02.entity.criteria.SearchCriteria.Speakers;

public class SpeakersCriteriaSelect implements ValidatorCriteriaSelect {

	@Override
	public Object[] select() {
		return Speakers.values();
	}

}
