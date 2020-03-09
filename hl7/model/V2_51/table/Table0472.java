package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0472 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0472();
		return table;
	}

	public static final String A = "A";
	public static final String C = "C";
	public static final String S = "S";

	private Table0472(){
		setTableName("TQ conjunction ID");
		setOID("2.16.840.1.113883.12.472");

		putMap("A", "Asynchronous");
		putMap("C", "Actuation Time");
		putMap("S", "Synchronous");

	}

}
