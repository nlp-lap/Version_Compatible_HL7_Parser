package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0395 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0395();
		return table;
	}

	public static final String M = "M";
	public static final String N = "N";

	private Table0395(){
		setTableName("Modify Indicator");
		setOID("");

		putMap("M", "Modified Subscription");
		putMap("N", "New Subscription");

	}

}
