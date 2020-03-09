package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0368 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0368();
		return table;
	}

	public static final String AB = "AB";
	public static final String CL = "CL";
	public static final String CN = "CN";
	public static final String DI = "DI";
	public static final String EN = "EN";
	public static final String ES = "ES";
	public static final String EX = "EX";
	public static final String IN = "IN";
	public static final String LC = "LC";
	public static final String LK = "LK";
	public static final String LO = "LO";
	public static final String PA = "PA";
	public static final String RC = "RC";
	public static final String RE = "RE";
	public static final String SA = "SA";
	public static final String SU = "SU";
	public static final String TT = "TT";
	public static final String UC = "UC";
	public static final String UN = "UN";

	private Table0368(){
		setTableName("Remote control command");
		setOID("2.16.840.1.113883.12.368");

		putMap("AB", "Abort");
		putMap("CL", "Clear");
		putMap("CN", "Clear Notification");
		putMap("DI", "Disable Sending Events");
		putMap("EN", "Enable Sending Events");
		putMap("ES", "Emergency -stop");
		putMap("EX", "Execute (command specified in field Parameters (ST) 01394)");
		putMap("IN", "Initialize/Initiate");
		putMap("LC", "Local Control Request");
		putMap("LK", "Lock");
		putMap("LO", "Load");
		putMap("PA", "Pause");
		putMap("RC", "Remote Control Request");
		putMap("RE", "Resume");
		putMap("SA", "Sampling");
		putMap("SU", "Setup");
		putMap("TT", "Transport To");
		putMap("UC", "Unlock");
		putMap("UN", "Unload");

	}

}
