package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0135 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0135();
		return table;
	}

	public static final String M = "M";
	public static final String N = "N";
	public static final String Y = "Y";

	private Table0135(){
		setTableName("Assignment of Benefits");
		setOID("");

		putMap("M", "Modified assignment");
		putMap("N", "No");
		putMap("Y", "Yes");

	}

}
