package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0136 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0136();
		return table;
	}

	public static final String N = "N";
	public static final String Y = "Y";

	private Table0136(){
		setTableName("Yes/no Indicator");
		setOID("");

		putMap("N", "No");
		putMap("Y", "Yes");

	}

}
