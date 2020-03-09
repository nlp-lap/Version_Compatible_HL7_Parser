package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0185 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0185();
		return table;
	}

	public static final String B = "B";
	public static final String C = "C";
	public static final String E = "E";
	public static final String F = "F";
	public static final String H = "H";
	public static final String O = "O";

	private Table0185(){
		setTableName("Preferred method of contact");
		setOID("2.16.840.1.113883.12.185");

		putMap("B", "Beeper Number");
		putMap("C", "Cellular Phone Number");
		putMap("E", "E-Mail Address (for backward compatibility)");
		putMap("F", "FAX Number");
		putMap("H", "Home Phone Number");
		putMap("O", "Office Phone Number");

	}

}
