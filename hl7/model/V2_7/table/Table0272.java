package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0272 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0272();
		return table;
	}

	public static final String R = "R";
	public static final String U = "U";
	public static final String V = "V";

	private Table0272(){
		setTableName("Document Confidentiality Status");
		setOID("");

		putMap("R", "Restricted");
		putMap("U", "Usual control");
		putMap("V", "Very restricted");

	}

}
