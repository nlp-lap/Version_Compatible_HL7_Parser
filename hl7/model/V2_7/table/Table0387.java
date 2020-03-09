package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0387 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0387();
		return table;
	}

	public static final String ER = "ER";
	public static final String OK = "OK";
	public static final String ST = "ST";
	public static final String TI = "TI";
	public static final String UN = "UN";

	private Table0387(){
		setTableName("Command Response");
		setOID("");

		putMap("ER", "Command cannot be completed because of error condition");
		putMap("OK", "Command completed successfully");
		putMap("ST", "Command cannot be completed because of the status of the requested equipment");
		putMap("TI", "Command cannot be completed within requested completion time");
		putMap("UN", "Command cannot be completed for unknown reasons");

	}

}
