package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0119 extends Table{
	private static final String VERSION = "2.7";
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
	public static final String MC = "MC";
	public static final String NA = "NA";
	public static final String NW = "NW";
	public static final String OC = "OC";
	public static final String OD = "OD";
	public static final String OE = "OE";
	public static final String OF = "OF";
	public static final String OH = "OH";
	public static final String OK = "OK";
	public static final String OP = "OP";
	public static final String OR = "OR";
	public static final String PA = "PA";
	public static final String PR = "PR";
	public static final String PY = "PY";
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
		setTableName("Order Control Codes");
		setOID("");

		putMap("AF", "Order/service refill request approval");
		putMap("CA", "Cancel order/service request");
		putMap("CH", "Child order/service");
		putMap("CN", "Combined result");
		putMap("CR", "Canceled as requested");
		putMap("DC", "Discontinue order/service request");
		putMap("DE", "Data errors");
		putMap("DF", "Order/service refill request denied");
		putMap("DR", "Discontinued as requested");
		putMap("FU", "Order/service refilled, unsolicited");
		putMap("HD", "Hold order request");
		putMap("HR", "On hold as requested");
		putMap("LI", "Link order/service to patient care problem or goal");
		putMap("MC", "Miscellaneous Charge - not associated with an order");
		putMap("NA", "Number assigned");
		putMap("NW", "New order/service");
		putMap("OC", "Order/service canceled");
		putMap("OD", "Order/service discontinued");
		putMap("OE", "Order/service released");
		putMap("OF", "Order/service refilled as requested");
		putMap("OH", "Order/service held");
		putMap("OK", "Order/service accepted & OK");
		putMap("OP", "Notification of order for outside dispense");
		putMap("OR", "Released as requested");
		putMap("PA", "Parent order/service");
		putMap("PR", "Previous Results with new order/service");
		putMap("PY", "Notification of replacement order for outside dispense");
		putMap("RE", "Observations/Performed Service to follow");
		putMap("RF", "Refill order/service request");
		putMap("RL", "Release previous hold");
		putMap("RO", "Replacement order");
		putMap("RP", "Order/service replace request");
		putMap("RQ", "Replaced as requested");
		putMap("RR", "Request received");
		putMap("RU", "Replaced unsolicited");
		putMap("SC", "Status changed");
		putMap("SN", "Send order/service number");
		putMap("SR", "Response to send order/service status request");
		putMap("SS", "Send order/service status request");
		putMap("UA", "Unable to accept order/service");
		putMap("UC", "Unable to cancel");
		putMap("UD", "Unable to discontinue");
		putMap("UF", "Unable to refill");
		putMap("UH", "Unable to put on hold");
		putMap("UM", "Unable to replace");
		putMap("UN", "Unlink order/service from patient care problem or goal");
		putMap("UR", "Unable to release");
		putMap("UX", "Unable to change");
		putMap("XO", "Change order/service request");
		putMap("XR", "Changed as requested");
		putMap("XX", "Order/service changed, unsol.");

	}

}
