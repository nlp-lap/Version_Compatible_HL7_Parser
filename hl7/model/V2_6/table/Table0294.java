package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0294 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0294();
		return table;
	}

	public static final String Fri = "Fri";
	public static final String Mon = "Mon";
	public static final String Prefend = "Prefend";
	public static final String Prefstart = "Prefstart";
	public static final String Sat = "Sat";
	public static final String Sun = "Sun";
	public static final String Thu = "Thu";
	public static final String Tue = "Tue";
	public static final String Wed = "Wed";

	private Table0294(){
		setTableName("Time selection criteria parameter class codes");
		setOID("2.16.840.1.113883.12.294");

		putMap("Fri", "An indicator that Friday is or is not preferred for the day on which the appointment will occur.");
		putMap("Mon", "An indicator that Monday is or is not preferred for the day on which the appointment will occur.");
		putMap("Prefend", "An indicator that there is a preferred end time for the appointment request, service or resource.");
		putMap("Prefstart", "An indicator that there is a preferred start time for the appointment request, service or resource.");
		putMap("Sat", "An indicator that Saturday is or is not preferred for the day on which the appointment will occur.");
		putMap("Sun", "An indicator that Sunday is or is not preferred for the day on which the appointment will occur.");
		putMap("Thu", "An indicator that Thursday is or is not preferred for the day on which the appointment will occur.");
		putMap("Tue", "An indicator that Tuesday is or is not preferred for the day on which the appointment will occur.");
		putMap("Wed", "An indicator that Wednesday is or is not preferred for the day on which the appointment will occur.");

	}

}
