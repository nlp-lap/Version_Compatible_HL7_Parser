package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0106 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0106();
		return table;
	}

	public static final String D = "D";
	public static final String R = "R";
	public static final String T = "T";

	private Table0106(){
		setTableName("Query/response format code");
		setOID("2.16.840.1.113883.12.106");

		putMap("D", "Response is in display format");
		putMap("R", "Response is in record-oriented format");
		putMap("T", "Response is in tabular format");

	}

}
