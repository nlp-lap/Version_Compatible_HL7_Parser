package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0007 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0007();
		return table;
	}

	public static final String A = "A";
	public static final String C = "C";
	public static final String E = "E";
	public static final String L = "L";
	public static final String N = "N";
	public static final String R = "R";
	public static final String U = "U";

	private Table0007(){
		setTableName("Admission Type");
		setOID("2.16.840.1.113883.12.7");

		putMap("A", "Accident");
		putMap("C", "Elective");
		putMap("E", "Emergency");
		putMap("L", "Labor and Delivery");
		putMap("N", "Newborn (Birth in healthcare facility)");
		putMap("R", "Routine");
		putMap("U", "Urgent");

	}

}
