package by.epam.halavin.task02.service.impl;

import by.epam.halavin.task02.service.exception.ServiceException;
import by.epam.halavin.task02.service.validation.Validator;
import by.epam.halavin.task02.dao.ApplianceDAO;
import by.epam.halavin.task02.dao.DAOFactory;
import by.epam.halavin.task02.dao.exception.DAOException;
import by.epam.halavin.task02.entity.Appliance;
import by.epam.halavin.task02.entity.criteria.Criteria;
import by.epam.halavin.task02.service.ApplianceService;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public <E> Appliance[] find(Criteria<E> criteria) throws ServiceException {
        Appliance[] appliance;

        if (!Validator.criteriaValidator(criteria)) {
            throw new ServiceException("Incorrect criteria");
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        try {
            appliance = applianceDAO.find(criteria);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

        return appliance;
    }

}
