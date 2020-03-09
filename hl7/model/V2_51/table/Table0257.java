package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0257 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0257();
		return table;
	}

	public static final String CFST = "CFST";
	public static final String EXCZ = "EXCZ";
	public static final String FFST = "FFST";

	private Table0257(){
		setTableName("Nature of challenge");
		setOID("2.16.840.1.113883.12.257");

		putMap("CFST", "Fasting (no calorie intake) for the period specified in the time component of the term, e.g., 1H POST CFST");
		putMap("EXCZ", "Exercise undertaken as challenge (can be quantified)");
		putMap("FFST", "No fluid intake for the period specified in the time component of the term");

	}

}
