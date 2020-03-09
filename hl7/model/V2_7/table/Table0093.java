package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0093 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0093();
		return table;
	}

	public static final String N = "N";
	public static final String Y = "Y";

	private Table0093(){
		setTableName("Release Information");
		setOID("");

		putMap("N", "No");
		putMap("Y", "Yes");

	}

}
