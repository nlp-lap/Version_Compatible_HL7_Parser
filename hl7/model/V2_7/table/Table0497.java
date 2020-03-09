package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0497 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0497();
		return table;
	}

	public static final String T = "T";
	public static final String V = "V";
	public static final String W = "W";

	private Table0497(){
		setTableName("Consent Mode");
		setOID("");

		putMap("T", "Telephone");
		putMap("V", "Verbal");
		putMap("W", "Written");

	}

}
