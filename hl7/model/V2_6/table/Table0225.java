package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0225 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0225();
		return table;
	}

	public static final String N = "N";
	public static final String R = "R";
	public static final String U = "U";

	private Table0225(){
		setTableName("Escort Required");
		setOID("2.16.840.1.113883.12.225");

		putMap("N", "Not Required");
		putMap("R", "Required");
		putMap("U", "Unknown");

	}

}
