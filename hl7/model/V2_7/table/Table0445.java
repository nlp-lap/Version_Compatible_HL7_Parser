package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0445 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0445();
		return table;
	}

	public static final String AL = "AL";
	public static final String UA = "UA";
	public static final String UD = "UD";
	public static final String US = "US";

	private Table0445(){
		setTableName("Identity Reliability Code");
		setOID("");

		putMap("AL", "Patient/Person Name is an Alias");
		putMap("UA", "Unknown/Default Address");
		putMap("UD", "Unknown/Default Date of Birth");
		putMap("US", "Unknown/Default Social Security Number");

	}

}
