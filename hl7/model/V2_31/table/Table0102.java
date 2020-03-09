package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0102 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0102();
		return table;
	}

	public static final String D = "D";
	public static final String F = "F";

	private Table0102(){
		setTableName("Delayed acknowledgment type");
		setOID("2.16.840.1.113883.12.102");

		putMap("D", "Message received, stored for later processing");
		putMap("F", "Acknowledgment after processing");

	}

}
