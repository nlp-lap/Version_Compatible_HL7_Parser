package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0472 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0472();
		return table;
	}

	public static final String A = "A";
	public static final String C = "C";
	public static final String S = "S";

	private Table0472(){
		setTableName("TQ Conjunction ID");
		setOID("");

		putMap("A", "Asynchronous");
		putMap("C", "Actuation Time");
		putMap("S", "Synchronous");

	}

}
