package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0651 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0651();
		return table;
	}

	public static final String CST = "CST";
	public static final String TME = "TME";

	private Table0651(){
		setTableName("Labor Calculation Type");
		setOID("2.16.840.1.113883.12.651");

		putMap("CST", "Cost");
		putMap("TME", "Time");

	}

}
