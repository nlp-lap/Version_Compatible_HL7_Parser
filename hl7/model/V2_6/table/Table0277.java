package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0277 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0277();
		return table;
	}

	public static final String Complete = "Complete";
	public static final String Normal = "Normal";
	public static final String Tentative = "Tentative";

	private Table0277(){
		setTableName("Appointment Type Codes");
		setOID("2.16.840.1.113883.12.277");

		putMap("Complete", "A request to add a completed appointment, used to maintain records of completed appointments that did not appear in the schedule (e.g., STAT, walk-in, etc.)");
		putMap("Normal", "Routine schedule request type - default if not valued");
		putMap("Tentative", "A request for a tentative (e.g., penciled in) appointment");

	}

}
