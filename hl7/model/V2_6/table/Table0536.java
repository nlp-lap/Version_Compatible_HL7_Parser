package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0536 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0536();
		return table;
	}

	public static final String E = "E";
	public static final String I = "I";
	public static final String P = "P";
	public static final String R = "R";
	public static final String V = "V";

	private Table0536(){
		setTableName("Certificate Status");
		setOID("2.16.840.1.113883.12.536");

		putMap("E", "Expired");
		putMap("I", "Inactive");
		putMap("P", "Provisional");
		putMap("R", "Revoked");
		putMap("V", "Active/Valid");

	}

}
