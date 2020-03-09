package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0365 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0365();
		return table;
	}

	public static final String CL = "CL";
	public static final String CO = "CO";
	public static final String ES = "ES";
	public static final String ID = "ID";
	public static final String IN = "IN";
	public static final String OP = "OP";
	public static final String PA = "PA";
	public static final String PD = "PD";
	public static final String PU = "PU";

	private Table0365(){
		setTableName("Equipment state");
		setOID("2.16.840.1.113883.12.365");

		putMap("CL", "Clearing");
		putMap("CO", "Configuring");
		putMap("ES", "E-stopped");
		putMap("ID", "Idle");
		putMap("IN", "Initializing");
		putMap("OP", "Normal Operation");
		putMap("PA", "Pausing");
		putMap("PD", "Paused");
		putMap("PU", "Powered Up");

	}

}
