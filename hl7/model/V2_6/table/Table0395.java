package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0395 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0395();
		return table;
	}

	public static final String M = "M";
	public static final String N = "N";

	private Table0395(){
		setTableName("Modify indicator");
		setOID("2.16.840.1.113883.12.395");

		putMap("M", "Modified Subscription");
		putMap("N", "New Subscription");

	}

}
