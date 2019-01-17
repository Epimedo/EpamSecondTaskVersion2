package by.epam.halavin.task02.dao;

import by.epam.halavin.task02.dao.exception.DAOException;
import by.epam.halavin.task02.entity.Appliance;
import by.epam.halavin.task02.entity.criteria.Criteria;

public interface ApplianceDAO {
	<E> Appliance[] find(Criteria<E> criteria) throws DAOException;
}
