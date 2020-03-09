package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0501 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0501();
		return table;
	}

	public static final String E = "E";
	public static final String PR = "PR";
	public static final String RX = "RX";

	private Table0501(){
		setTableName("Consent Non-Disclosure Reason");
		setOID("");

		putMap("E", "Emergency");
		putMap("PR", "Patient Request");
		putMap("RX", "Rx Private");

	}

}
