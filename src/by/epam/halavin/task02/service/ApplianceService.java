package by.epam.halavin.task02.service;

import by.epam.halavin.task02.service.exception.ServiceException;
import by.epam.halavin.task02.entity.Appliance;
import by.epam.halavin.task02.entity.criteria.Criteria;

public interface ApplianceService {	
	
	<E> Appliance[] find(Criteria<E> criteria) throws ServiceException;
	
}
