package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0098 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0098();
		return table;
	}

	public static final String M = "M";
	public static final String S = "S";
	public static final String U = "U";

	private Table0098(){
		setTableName("Type of Agreement");
		setOID("");

		putMap("M", "Maternity");
		putMap("S", "Standard");
		putMap("U", "Unified");

	}

}
