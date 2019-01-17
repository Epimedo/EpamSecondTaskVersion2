package by.epam.halavin.task02.main;

import by.epam.halavin.task02.entity.criteria.Criteria;
import by.epam.halavin.task02.entity.criteria.SearchCriteria;
import by.epam.halavin.task02.service.thread.FindThread;

public class Main {

    public static void main(String[] args) {

        Criteria<SearchCriteria.Oven> criteriaOven = new Criteria<>(SearchCriteria.Oven.class);
        criteriaOven.add(SearchCriteria.Oven.CAPACITY, 33);

        FindThread<SearchCriteria.Oven> ovenThread = new FindThread<>(criteriaOven);

        ovenThread.start();

        //////////////////////////////////////////////////////////////////

        criteriaOven = new Criteria<>(SearchCriteria.Oven.class);
        criteriaOven.add(SearchCriteria.Oven.HEIGHT, 45.5);
        criteriaOven.add(SearchCriteria.Oven.DEPTH, 60);

        ovenThread = new FindThread<>(criteriaOven);

        ovenThread.start();

        //////////////////////////////////////////////////////////////////

        Criteria<SearchCriteria.TabletPC> criteriaTabletPC = new Criteria<SearchCriteria.TabletPC>(SearchCriteria.TabletPC.class);
        criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR, "blue");
        criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES, 14);
        criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM, 8000);

        FindThread<SearchCriteria.TabletPC> tabletPCThread = new FindThread<>(criteriaTabletPC);

        tabletPCThread.start();

        //////////////////////////////////////////////////////////////////

        Criteria<SearchCriteria.Speakers> criteriaSpeakers = new Criteria<>(SearchCriteria.Speakers.class);
        criteriaSpeakers.add(SearchCriteria.Speakers.FREQUENCY_RANGE, "2-4");

        FindThread<SearchCriteria.Speakers> speakersThread = new FindThread<>(criteriaSpeakers);

        speakersThread.start();

        //////////////////////////////////////////////////////////////////

        Criteria<SearchCriteria.VacuumCleaner> criteriaVacuumCleaner = new Criteria<>(SearchCriteria.VacuumCleaner.class);
        criteriaVacuumCleaner.add(SearchCriteria.VacuumCleaner.BAG_TYPE, "XX00");

        FindThread<SearchCriteria.VacuumCleaner> vacuumCleanerThread = new FindThread<>(criteriaVacuumCleaner);

        vacuumCleanerThread.start();

        //////////////////////////////////////////////////////////////////

        Criteria<SearchCriteria.Refrigerator> criteriaRefrigerator = new Criteria<>(SearchCriteria.Refrigerator.class);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.OVERALL_CAPACITY, 300);
        criteriaRefrigerator.add(SearchCriteria.Refrigerator.HEIGHT, 180);

        FindThread<SearchCriteria.Refrigerator> refrigeratorThread = new FindThread<>(criteriaRefrigerator);

        refrigeratorThread.start();

        //////////////////////////////////////////////////////////////////

        Criteria<SearchCriteria.Laptop> criteriaLaptop = new Criteria<>(SearchCriteria.Laptop.class);

        FindThread<SearchCriteria.Laptop> laptopThread = new FindThread<>(criteriaLaptop);

        laptopThread.start();
    }

}
