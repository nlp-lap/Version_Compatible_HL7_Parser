package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0332 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0332();
		return table;
	}

	public static final String A = "A";
	public static final String I = "I";

	private Table0332(){
		setTableName("Network source type");
		setOID("2.16.840.1.113883.12.332");

		putMap("A", "Accept");
		putMap("I", "Initiate");

	}

}
