package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0204 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0204();
		return table;
	}

	public static final String A = "A";
	public static final String D = "D";
	public static final String L = "L";
	public static final String SL = "SL";

	private Table0204(){
		setTableName("Organizational Name Type");
		setOID("2.16.840.1.113883.12.204");

		putMap("A", "Alias Name");
		putMap("D", "Display Name");
		putMap("L", "Legal Name");
		putMap("SL", "Stock Exchange Listing Name");

	}

}
