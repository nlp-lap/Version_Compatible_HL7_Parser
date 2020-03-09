package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0450 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0450();
		return table;
	}

	public static final String LOG = "LOG";
	public static final String SER = "SER";

	private Table0450(){
		setTableName("Event type");
		setOID("2.16.840.1.113883.12.450");

		putMap("LOG", "Log Event");
		putMap("SER", "Service Event");

	}

}
