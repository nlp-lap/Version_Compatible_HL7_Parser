package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0294 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0294();
		return table;
	}

	public static final String FRI = "FRI";
	public static final String MON = "MON";
	public static final String PREFEND = "PREFEND";
	public static final String PREFSTART = "PREFSTART";
	public static final String SAT = "SAT";
	public static final String SUN = "SUN";
	public static final String THU = "THU";
	public static final String TUE = "TUE";
	public static final String WED = "WED";

	private Table0294(){
		setTableName("Time Selection Criteria Parameter Class Codes");
		setOID("2.16.840.1.113883.12.294");

		putMap("FRI", "An indicator that Friday is or is not preferred for the day on which the appointment will occur.  OK = Preferred appointment dayNO = Day is not preferred");
		putMap("MON", "An indicator that Monday is or is not preferred for the day on which the appointment will occur.  OK = Preferred appointment dayNO = Day is not preferred");
		putMap("PREFEND", "The preferred start time for the appointment request, service or resource.  Any legal time specification in the format HHMM, using 24-hour clock notation");
		putMap("PREFSTART", "The preferred start time for the appointment request, service or resource.   Any legal time specification in the format HHMM, using 24-hour clock notation");
		putMap("SAT", "An indicator that Saturday is or is not preferred for the day on which the appointment will occur.  OK = Preferred appointment dayNO = Day is not preferred");
		putMap("SUN", "An indicator that Sunday is or is not preferred for the day on which the appointment will occur.  OK = Preferred appointment dayNO = Day is not preferred");
		putMap("THU", "An indicator that Thursday is or is not preferred for the day on which the appointment will occur.  OK = Preferred appointment dayNO = Day is not preferred");
		putMap("TUE", "An indicator that Tuesday is or is not preferred for the day on which the appointment will occur.  OK = Preferred appointment dayNO = Day is not preferred");
		putMap("WED", "An indicator that Wednesday is or is not preferred for the day on which the appointment will occur. OK = Preferred appointment dayNO = Day is not preferred");

	}

}
