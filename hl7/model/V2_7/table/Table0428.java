package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0428 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0428();
		return table;
	}

	public static final String O = "O";
	public static final String P = "P";
	public static final String U = "U";

	private Table0428(){
		setTableName("Incident Type Code");
		setOID("");

		putMap("O", "Other");
		putMap("P", "Preventable");
		putMap("U", "User Error");

	}

}
