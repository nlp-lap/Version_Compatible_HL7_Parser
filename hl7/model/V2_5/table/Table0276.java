package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0276 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0276();
		return table;
	}

	public static final String CHECKUP = "CHECKUP";
	public static final String EMERGENCY = "EMERGENCY";
	public static final String FOLLOWUP = "FOLLOWUP";
	public static final String ROUTINE = "ROUTINE";
	public static final String WALKIN = "WALKIN";

	private Table0276(){
		setTableName("Appointment reason codes");
		setOID("2.16.840.1.113883.12.276");

		putMap("CHECKUP", "A routine check-up, such as an annual physical");
		putMap("EMERGENCY", "Emergency appointment");
		putMap("FOLLOWUP", "A follow up visit from a previous appointment");
		putMap("ROUTINE", "Routine appointment - default if not valued");
		putMap("WALKIN", "A previously unscheduled walk-in visit");

	}

}
