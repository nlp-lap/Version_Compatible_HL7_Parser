package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0277 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0277();
		return table;
	}

	public static final String COMPLETE = "COMPLETE";
	public static final String NORMAL = "NORMAL";
	public static final String TENTATIVE = "TENTATIVE";

	private Table0277(){
		setTableName("Appointment Type Codes");
		setOID("2.16.840.1.113883.12.277");

		putMap("COMPLETE", "A request to add a completed appointment, used to maintain records of completed appointments that did not appear in the schedule (e.g., STAT, walk-in, etc.)");
		putMap("NORMAL", "Routine schedule request type - default if not valued");
		putMap("TENTATIVE", "A request for a tentative (e.g., ¡°penciled in¡±) appointment");

	}

}
