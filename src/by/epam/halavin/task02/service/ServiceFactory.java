package by.epam.halavin.task02.service;

import by.epam.halavin.task02.service.impl.ApplianceServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public ApplianceService createApplianceService() {

        return new ApplianceServiceImpl();
    }

}
