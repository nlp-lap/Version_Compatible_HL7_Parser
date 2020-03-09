package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0091 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0091();
		return table;
	}

	public static final String D = "D";
	public static final String I = "I";

	private Table0091(){
		setTableName("Query priority");
		setOID("2.16.840.1.113883.12.91");

		putMap("D", "Deferred");
		putMap("I", "Immediate");

	}

}
