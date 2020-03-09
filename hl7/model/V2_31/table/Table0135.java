package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0135 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0135();
		return table;
	}

	public static final String M = "M";
	public static final String N = "N";
	public static final String Y = "Y";

	private Table0135(){
		setTableName("Assignment of benefits");
		setOID("2.16.840.1.113883.12.135");

		putMap("M", "Modified assignment");
		putMap("N", "No");
		putMap("Y", "Yes");

	}

}
