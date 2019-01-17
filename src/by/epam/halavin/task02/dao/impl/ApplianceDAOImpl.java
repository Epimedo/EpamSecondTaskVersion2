package by.epam.halavin.task02.dao.impl;

import by.epam.halavin.task02.dao.exception.DAOException;
import by.epam.halavin.task02.dao.util.StringParse;
import by.epam.halavin.task02.entity.Appliance;
import by.epam.halavin.task02.entity.building.ApplianceProducer;
import by.epam.halavin.task02.entity.criteria.Criteria;
import by.epam.halavin.task02.entity.factory.EntityFactory;
import by.epam.halavin.task02.util.factory.InputFactory;
import by.epam.halavin.task02.util.factory.UtilFactory;
import by.epam.halavin.task02.util.read.Input;
import by.epam.halavin.task02.dao.ApplianceDAO;
import by.epam.halavin.task02.dao.DAOFactory;

public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public <E> Appliance[] find(Criteria<E> criteria) throws DAOException {
        UtilFactory utilFactory = UtilFactory.getInstance();

        InputFactory inFactory = utilFactory.newInputFactory();
        Input in = inFactory.createInput();
        String[] inputStr = in.read(criteria.getTypeNameGenerics());

        DAOFactory daoFactory = DAOFactory.getInstance();
        StringParse parse = daoFactory.createParse();

        inputStr = parse.parse(inputStr, criteria);

        EntityFactory entityFact = EntityFactory.getInstance();
        ApplianceProducer producer = entityFact.getProducer();

        producer.prepare(criteria.getTypeNameGenerics());

        return producer.produce(inputStr);
    }

}
