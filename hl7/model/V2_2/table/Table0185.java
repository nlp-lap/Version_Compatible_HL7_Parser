package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0185 extends Table{
	private static final String VERSION = "2.2";
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
		setTableName("Preferred Method Of Contrct");
		setOID("2.16.840.1.113883.12.185");

		putMap("B", "Beeper number");
		putMap("C", "Cellular phone number");
		putMap("E", "E-mail address (not in TN format)");
		putMap("F", "Fax number");
		putMap("H", "Home phone number");
		putMap("O", "Office phone number");

	}

}
