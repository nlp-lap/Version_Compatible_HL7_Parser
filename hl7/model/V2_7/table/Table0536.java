package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0536 extends Table{
	private static final String VERSION = "2.7";
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
		setOID("");

		putMap("E", "Expired");
		putMap("I", "Inactive");
		putMap("P", "Provisional");
		putMap("R", "Revoked");
		putMap("V", "Active/Valid");

	}

}
