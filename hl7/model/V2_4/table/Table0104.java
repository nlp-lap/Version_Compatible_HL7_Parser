package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0104 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0104();
		return table;
	}

	public static final String _2_0 = "2.0";
	public static final String _2_0D = "2.0D";
	public static final String _2_1 = "2.1";
	public static final String _2_2 = "2.2";
	public static final String _2_3 = "2.3";
	public static final String _2_3_1 = "2.3.1";
	public static final String _2_4 = "2.4";

	private Table0104(){
		setTableName("Version ID");
		setOID("2.16.840.1.113883.12.104");

		putMap("2.0", "Release 2.0");
		putMap("2.0D", "Demo 2.0");
		putMap("2.1", "Release 2. 1");
		putMap("2.2", "Release 2.2");
		putMap("2.3", "Release 2.3");
		putMap("2.3.1", "Release 2.3.1");
		putMap("2.4", "Release 2.4");

	}

}
