package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0682 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0682();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";

	private Table0682(){
		setTableName("Device Status-");
		setOID("");

		putMap("0", "Ready");
		putMap("1", "Not Ready");

	}

}
