package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0272 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0272();
		return table;
	}

	public static final String R = "R";
	public static final String U = "U";
	public static final String V = "V";

	private Table0272(){
		setTableName("Document Confidentiality Status");
		setOID("2.16.840.1.113883.12.272");

		putMap("R", "Restricted");
		putMap("U", "Usual control");
		putMap("V", "Very restricted");

	}

}
