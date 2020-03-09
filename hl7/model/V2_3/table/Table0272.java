package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0272 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0272();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String RE = "RE";
	public static final String UC = "UC";
	public static final String VR = "VR";

	private Table0272(){
		setTableName("Document Confidentiality Status");
		setOID("2.16.840.1.113883.12.272");

		putMap("1", "ASTM Level 1");
		putMap("2", "ASTM Level 2");
		putMap("3", "ASTM Level 3");
		putMap("RE", "Restricted");
		putMap("UC", "Usual control");
		putMap("VR", "Very restricted");

	}

}
