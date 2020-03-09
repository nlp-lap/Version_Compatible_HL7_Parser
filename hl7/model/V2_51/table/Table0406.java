package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0406 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0406();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String _5 = "5";
	public static final String H = "H";
	public static final String O = "O";

	private Table0406(){
		setTableName("Organization unit type");
		setOID("2.16.840.1.113883.12.406");

		putMap("1", "Hospital");
		putMap("2", "Physician Clinic");
		putMap("3", "Long Term Care");
		putMap("4", "Acute Care");
		putMap("5", "Other");
		putMap("H", "Home");
		putMap("O", "Office");

	}

}
