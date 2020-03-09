package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0818 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0818();
		return table;
	}

	public static final String BX = "BX";
	public static final String CS = "CS";
	public static final String EA = "EA";
	public static final String SET = "SET";

	private Table0818(){
		setTableName("Package");
		setOID("");

		putMap("BX", "Box");
		putMap("CS", "Case");
		putMap("EA", "Each");
		putMap("SET", "Set");

	}

}
