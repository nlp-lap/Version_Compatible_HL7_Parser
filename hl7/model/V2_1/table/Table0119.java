package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0119 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0119();
		return table;
	}

	public static final String CA = "CA";
	public static final String CH = "CH";
	public static final String CN = "CN";
	public static final String DC = "DC";
	public static final String DE = "DE";
	public static final String DR = "DR";
	public static final String HD = "HD";
	public static final String HR = "HR";
	public static final String NA = "NA";
	public static final String NW = "NW";
	public static final String OD = "OD";
	public static final String OK = "OK";
	public static final String OR = "OR";
	public static final String PA = "PA";
	public static final String RE = "RE";
	public static final String RO = "RO";
	public static final String RP = "RP";
	public static final String RR = "RR";
	public static final String RU = "RU";
	public static final String SN = "SN";
	public static final String SS = "SS";
	public static final String UD = "UD";
	public static final String UH = "UH";
	public static final String UR = "UR";
	public static final String UX = "UX";
	public static final String XR = "XR";
	public static final String XX = "XX";

	private Table0119(){
		setTableName("ORDER CONTROL");
		setOID("2.16.840.1.113883.12.119");

		putMap("CA", "Cancel order request");
		putMap("CH", "Child order");
		putMap("CN", "Combined result");
		putMap("DC", "Discontinue order request");
		putMap("DE", "Data Errors");
		putMap("DR", "Discontinued as requested");
		putMap("HD", "Hold order request");
		putMap("HR", "On hold as requested");
		putMap("NA", "Number assigned            T");
		putMap("NW", "New order                  T");
		putMap("OD", "Order discontinued");
		putMap("OK", "Order accepted and OK");
		putMap("OR", "Released as requested");
		putMap("PA", "Parent order");
		putMap("RE", "Observations to follow");
		putMap("RO", "Replacement order");
		putMap("RP", "Order replace request");
		putMap("RR", "Request received");
		putMap("RU", "Replaced unsolicited");
		putMap("SN", "Send filler number            F         I");
		putMap("SS", "Send order status request");
		putMap("UD", "Unable to discontinue");
		putMap("UH", "Unable to put on hold");
		putMap("UR", "Unable to release");
		putMap("UX", "Unable to change");
		putMap("XR", "Changed as requested");
		putMap("XX", "Order changed, unsolicited");

	}

}
