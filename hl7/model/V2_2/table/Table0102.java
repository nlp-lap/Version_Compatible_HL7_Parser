package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0102 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0102();
		return table;
	}

	public static final String D = "D";
	public static final String F = "F";

	private Table0102(){
		setTableName("DELAYED ACKNOWLEDGMENT TYPE");
		setOID("2.16.840.1.113883.12.102");

		putMap("D", "Message Received, stored for later processing");
		putMap("F", "Acknowledgement after processing");

	}

}
