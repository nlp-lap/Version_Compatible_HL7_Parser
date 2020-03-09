package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0225 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0225();
		return table;
	}

	public static final String N = "N";
	public static final String R = "R";
	public static final String U = "U";

	private Table0225(){
		setTableName("Escort Required");
		setOID("");

		putMap("N", "Not Required");
		putMap("R", "Required");
		putMap("U", "Unknown");

	}

}
