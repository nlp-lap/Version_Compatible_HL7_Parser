package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0559 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0559();
		return table;
	}

	public static final String D = "D";
	public static final String P = "P";
	public static final String R = "R";

	private Table0559(){
		setTableName("Product/Service Status");
		setOID("2.16.840.1.113883.12.559");

		putMap("D", "Denied");
		putMap("P", "Processed");
		putMap("R", "Rejected");

	}

}
