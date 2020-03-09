package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0239 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0239();
		return table;
	}

	public static final String N = "N";
	public static final String U = "U";
	public static final String Y = "Y";

	private Table0239(){
		setTableName("Event Expected");
		setOID("2.16.840.1.113883.12.239");

		putMap("N", "No");
		putMap("U", "Unknown");
		putMap("Y", "Yes");

	}

}
