package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0651 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0651();
		return table;
	}

	public static final String CST = "CST";
	public static final String TME = "TME";

	private Table0651(){
		setTableName("Labor Calculation Type");
		setOID("");

		putMap("CST", "Cost");
		putMap("TME", "Time");

	}

}
