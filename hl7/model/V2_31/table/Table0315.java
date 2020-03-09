package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0315 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0315();
		return table;
	}

	public static final String F = "F";
	public static final String I = "I";
	public static final String N = "N";
	public static final String U = "U";
	public static final String Y = "Y";

	private Table0315(){
		setTableName("Living will");
		setOID("2.16.840.1.113883.12.315");

		putMap("F", "Yes, patient has a living will but it is not on file");
		putMap("I", "No, patient does not have a living will but information was provided");
		putMap("N", "No, patient does not have a living will and no information was provided");
		putMap("U", "Unknown");
		putMap("Y", "Yes, patient has a living will");

	}

}
