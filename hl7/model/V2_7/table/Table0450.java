package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0450 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0450();
		return table;
	}

	public static final String LOG = "LOG";
	public static final String SER = "SER";

	private Table0450(){
		setTableName("Event Type");
		setOID("");

		putMap("LOG", "Log Event");
		putMap("SER", "Service Event");

	}

}
