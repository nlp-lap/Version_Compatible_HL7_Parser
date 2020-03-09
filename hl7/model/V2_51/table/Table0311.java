package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0311 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0311();
		return table;
	}

	public static final String O = "O";
	public static final String P = "P";
	public static final String T = "T";
	public static final String U = "U";

	private Table0311(){
		setTableName("Job Status");
		setOID("2.16.840.1.113883.12.311");

		putMap("O", "Other");
		putMap("P", "Permanent");
		putMap("T", "Temporary");
		putMap("U", "Unknown");

	}

}
