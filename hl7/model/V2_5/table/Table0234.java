package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0234 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0234();
		return table;
	}

	public static final String _10D = "10D";
	public static final String _15D = "15D";
	public static final String _30D = "30D";
	public static final String _3D = "3D";
	public static final String _7D = "7D";
	public static final String AD = "AD";
	public static final String CO = "CO";
	public static final String DE = "DE";
	public static final String PD = "PD";
	public static final String RQ = "RQ";

	private Table0234(){
		setTableName("Report timing");
		setOID("2.16.840.1.113883.12.234");

		putMap("10D", "10 day report");
		putMap("15D", "15 day report");
		putMap("30D", "30 day report");
		putMap("3D", "3 day report");
		putMap("7D", "7 day report");
		putMap("AD", "Additional information");
		putMap("CO", "Correction");
		putMap("DE", "Device evaluation");
		putMap("PD", "Periodic");
		putMap("RQ", "Requested information");

	}

}
