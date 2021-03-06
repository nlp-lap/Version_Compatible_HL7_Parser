package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0761 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0761();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";

	private Table0761(){
		setTableName("DRG Procedure Determination Status");
		setOID("2.16.840.1.113883.12.761");

		putMap("0", "Valid code");
		putMap("1", "Invalid code");
		putMap("2", "Not used");
		putMap("3", "Invalid for this gender");
		putMap("4", "Invalid for this age");

	}

}
