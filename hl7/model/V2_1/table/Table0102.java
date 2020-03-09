package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0102 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0102();
		return table;
	}

	public static final String D = "D";

	private Table0102(){
		setTableName("DELAYED ACKNOWLEDGMENT TYPE");
		setOID("2.16.840.1.113883.12.102");

		putMap("D", "Message Received, stored for later processing");

	}

}
