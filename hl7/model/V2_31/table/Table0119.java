package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0119 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0119();
		return table;
	}

	public static final String AF = "AF";
	public static final String CA = "CA";
	public static final String CH = "CH";
	public static final String CN = "CN";
	public static final String CR = "CR";
	public static final String DC = "DC";
	public static final String DE = "DE";
	public static final String DF = "DF";
	public static final String DR = "DR";
	public static final String FU = "FU";
	public static final String HD = "HD";
	public static final String HR = "HR";
	public static final String LI = "LI";
	public static final String NA = "NA";
	public static final String NW = "NW";
	public static final String OC = "OC";
	public static final String OD = "OD";
	public static final String OE = "OE";
	public static final String OF = "OF";
	public static final String OH = "OH";
	public static final String OK = "OK";
	public static final String OR = "OR";
	public static final String PA = "PA";
	public static final String RE = "RE";
	public static final String RF = "RF";
	public static final String RL = "RL";
	public static final String RO = "RO";
	public static final String RP = "RP";
	public static final String RQ = "RQ";
	public static final String RR = "RR";
	public static final String RU = "RU";
	public static final String SC = "SC";
	public static final String SN = "SN";
	public static final String SR = "SR";
	public static final String SS = "SS";
	public static final String UA = "UA";
	public static final String UC = "UC";
	public static final String UD = "UD";
	public static final String UF = "UF";
	public static final String UH = "UH";
	public static final String UM = "UM";
	public static final String UN = "UN";
	public static final String UR = "UR";
	public static final String UX = "UX";
	public static final String XO = "XO";
	public static final String XR = "XR";
	public static final String XX = "XX";

	private Table0119(){
		setTableName("Order control codes and their meaning");
		setOID("2.16.840.1.113883.12.119");

		putMap("AF", "Order refill request approval (O02)");
		putMap("CA", "Cancel order request (O01)");
		putMap("CH", "Child order (O01/ORU)");
		putMap("CN", "Combined result (R01)");
		putMap("CR", "Canceled as requested (O02)");
		putMap("DC", "Discontinue order request (O01)");
		putMap("DE", "Data errors (O01/O02)");
		putMap("DF", "Order refill request denied (O02)");
		putMap("DR", "Discontinued as requested (O02)");
		putMap("FU", "Order refilled, unsolicited (O01)");
		putMap("HD", "Hold order request (O01)");
		putMap("HR", "On hold as requested (O02)");
		putMap("LI", "Link order to patient care problem or goal");
		putMap("NA", "Number assigned (O02)");
		putMap("NW", "New order (O01)");
		putMap("OC", "Order canceled (O01)");
		putMap("OD", "Order discontinued (O01)");
		putMap("OE", "Order released (O01)");
		putMap("OF", "Order refilled as requested (O02)");
		putMap("OH", "Order held (O01)");
		putMap("OK", "Order accepted & OK (O02)");
		putMap("OR", "Released as requested");
		putMap("PA", "Parent order (O01/ORU)");
		putMap("RE", "Observations to follow (O01/R01)");
		putMap("RF", "Refill order request (O01)");
		putMap("RL", "Release previous hold (O01)");
		putMap("RO", "Replacement order (O01)");
		putMap("RP", "Order replace request (O01)");
		putMap("RQ", "Replaced as requested (O02)");
		putMap("RR", "Request received (O02)");
		putMap("RU", "Replaced unsolicited (O01)");
		putMap("SC", "Status changed (O01)");
		putMap("SN", "Send order number (O01)");
		putMap("SR", "Response to send order status request (O02(Q06)");
		putMap("SS", "Send order status request (O01)");
		putMap("UA", "Unable to accept order (O02/ORR)");
		putMap("UC", "Unable to cancel (O02)");
		putMap("UD", "Unable to discontinue (O02)");
		putMap("UF", "Unable to refill (O02)");
		putMap("UH", "Unable to put on hold (O02)");
		putMap("UM", "Unable to replace (O02)");
		putMap("UN", "Unlink order from patient care problem or goal");
		putMap("UR", "Unable to release (O02)");
		putMap("UX", "Unable to change (O02)");
		putMap("XO", "Change order request (O01)");
		putMap("XR", "Changed as requested (O02)");
		putMap("XX", "Order changed, unsol. (O01)");

	}

}
