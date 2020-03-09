package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0093 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0093();
		return table;
	}

	public static final String N = "N";
	public static final String Y = "Y";

	private Table0093(){
		setTableName("RELEASE OF INFORMATION");
		setOID("2.16.840.1.113883.12.93");

		putMap("N", "No");
		putMap("Y", "Yes");

	}

}
