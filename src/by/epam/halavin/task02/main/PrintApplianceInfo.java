package by.epam.halavin.task02.main;

import by.epam.halavin.task02.entity.Appliance;

public class PrintApplianceInfo {

	public synchronized static void print(Appliance... appliance) {
		for (Appliance app : appliance) {
			System.out.println(app.toString() + "\n");
		}

	}

}
