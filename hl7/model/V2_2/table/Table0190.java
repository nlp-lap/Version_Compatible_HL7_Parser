package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0190 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0190();
		return table;
	}

	public static final String B = "B";
	public static final String C = "C";
	public static final String H = "H";
	public static final String M = "M";
	public static final String O = "O";
	public static final String P = "P";

	private Table0190(){
		setTableName("Adress Type");
		setOID("2.16.840.1.113883.12.190");

		putMap("B", "Business");
		putMap("C", "Current or Temporary");
		putMap("H", "Home");
		putMap("M", "Mailing");
		putMap("O", "Office");
		putMap("P", "Permanent");

	}

}
