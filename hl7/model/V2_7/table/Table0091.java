package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0091 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0091();
		return table;
	}

	public static final String D = "D";
	public static final String I = "I";

	private Table0091(){
		setTableName("Query Priority");
		setOID("");

		putMap("D", "Deferred");
		putMap("I", "Immediate");

	}

}
