package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0524 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0524();
		return table;
	}

	public static final String C = "C";
	public static final String R = "R";
	public static final String S = "S";

	private Table0524(){
		setTableName("Sequence condition");
		setOID("2.16.840.1.113883.12.524");

		putMap("C", "Repeating cycle of orders");
		putMap("R", "Reserved for possible future use");
		putMap("S", "Sequence conditions");

	}

}
