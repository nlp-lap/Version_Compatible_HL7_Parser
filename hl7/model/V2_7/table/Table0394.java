package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0394 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0394();
		return table;
	}

	public static final String B = "B";
	public static final String R = "R";
	public static final String T = "T";

	private Table0394(){
		setTableName("Response Modality");
		setOID("");

		putMap("B", "Batch");
		putMap("R", "Real Time");
		putMap("T", "Bolus (a series of responses sent at the same time without use of batch formatting)");

	}

}
