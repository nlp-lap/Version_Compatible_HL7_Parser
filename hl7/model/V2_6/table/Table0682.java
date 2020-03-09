package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0682 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0682();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";

	private Table0682(){
		setTableName("Device Status");
		setOID("2.16.840.1.113883.12.682");

		putMap("0", "Ready");
		putMap("1", "Not Ready");

	}

}
