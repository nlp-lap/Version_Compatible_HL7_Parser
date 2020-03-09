package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0428 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0428();
		return table;
	}

	public static final String O = "O";
	public static final String P = "P";
	public static final String U = "U";

	private Table0428(){
		setTableName("Incident Type Code");
		setOID("2.16.840.1.113883.12.428");

		putMap("O", "Other");
		putMap("P", "Preventable");
		putMap("U", "User Error");

	}

}
