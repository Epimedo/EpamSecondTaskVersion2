package by.epam.halavin.task02.dao;

import by.epam.halavin.task02.dao.impl.ApplianceDAOImpl;
import by.epam.halavin.task02.dao.util.StringApplianceParse;
import by.epam.halavin.task02.dao.util.StringParse;

public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

	private DAOFactory() {
	}

	public ApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}

	public static DAOFactory getInstance() {
		return instance;
	}

	public StringParse createParse() {
		return new StringApplianceParse();
	}
}
