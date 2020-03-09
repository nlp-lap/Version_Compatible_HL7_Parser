package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0004 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0004();
		return table;
	}

	public static final String B = "B";
	public static final String C = "C";
	public static final String E = "E";
	public static final String I = "I";
	public static final String N = "N";
	public static final String O = "O";
	public static final String P = "P";
	public static final String R = "R";
	public static final String U = "U";

	private Table0004(){
		setTableName("Patient Class");
		setOID("2.16.840.1.113883.12.4");

		putMap("B", "Obstetrics");
		putMap("C", "Commercial Account");
		putMap("E", "Emergency");
		putMap("I", "Inpatient");
		putMap("N", "Not Applicable");
		putMap("O", "Outpatient");
		putMap("P", "Preadmit");
		putMap("R", "Recurring patient");
		putMap("U", "Unknown");

	}

}
