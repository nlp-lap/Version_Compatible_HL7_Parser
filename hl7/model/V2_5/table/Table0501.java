package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0501 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0501();
		return table;
	}

	public static final String E = "E";
	public static final String PR = "PR";
	public static final String RX = "RX";

	private Table0501(){
		setTableName("Consent Non-Disclosure Reason");
		setOID("2.16.840.1.113883.12.501");

		putMap("E", "Emergency");
		putMap("PR", "Patient Request");
		putMap("RX", "Rx Private");

	}

}
