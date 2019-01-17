package by.epam.halavin.task02.service.thread;


import by.epam.halavin.task02.service.exception.ServiceException;
import by.epam.halavin.task02.entity.Appliance;
import by.epam.halavin.task02.entity.criteria.Criteria;
import by.epam.halavin.task02.main.PrintApplianceInfo;
import by.epam.halavin.task02.service.ApplianceService;
import by.epam.halavin.task02.service.ServiceFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FindThread<E> extends Thread {
    private static final Logger log = LogManager.getLogger(FindThread.class);

    private Criteria<E> criteria;
    private Appliance[] appliance;

    public FindThread(Criteria<E> criteria) {
        this.criteria = criteria;
    }

    @Override
    public void run() {
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.createApplianceService();

        try {
            appliance = service.find(criteria);
        } catch (ServiceException e) {
            log.error(e.getMessage());
        }

        PrintApplianceInfo.print(appliance);
    }

}
