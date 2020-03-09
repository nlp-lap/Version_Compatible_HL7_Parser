package hl7.model.V2_2.table;

import hl7.bean.table.Table;

public class Table0076 extends Table{
	private static final String VERSION = "2.2";
	public static Table getInstance(){
		if(table==null) new Table0076();
		return table;
	}

	public static final String ACK = "ACK";
	public static final String ADR = "ADR";
	public static final String ADT = "ADT";
	public static final String ARD = "ARD";
	public static final String BAR = "BAR";
	public static final String DFT = "DFT";
	public static final String DSR = "DSR";
	public static final String MCF = "MCF";
	public static final String MFD = "MFD";
	public static final String MFK = "MFK";
	public static final String MFN = "MFN";
	public static final String MFR = "MFR";
	public static final String NMD = "NMD";
	public static final String NMQ = "NMQ";
	public static final String NMR = "NMR";
	public static final String ORF = "ORF";
	public static final String ORM = "ORM";
	public static final String ORR = "ORR";
	public static final String ORU = "ORU";
	public static final String OSQ = "OSQ";
	public static final String QRY = "QRY";
	public static final String RAR = "RAR";
	public static final String RAS = "RAS";
	public static final String RDE = "RDE";
	public static final String RDR = "RDR";
	public static final String RDS = "RDS";
	public static final String RER = "RER";
	public static final String RGR = "RGR";
	public static final String RGV = "RGV";
	public static final String ROR = "ROR";
	public static final String RRA = "RRA";
	public static final String RRD = "RRD";
	public static final String RRE = "RRE";
	public static final String RRG = "RRG";
	public static final String UDM = "UDM";

	private Table0076(){
		setTableName("MESSAGE TYPE");
		setOID("2.16.840.1.113883.12.76");

		putMap("ACK", "General acknowledgement message");
		putMap("ADR", "ADT response");
		putMap("ADT", "ADT message");
		putMap("ARD", "Ancillary report (display)");
		putMap("BAR", "Add / change billing account");
		putMap("DFT", "Detail financial transaction");
		putMap("DSR", "Display response");
		putMap("MCF", "Delayed acknowledgement");
		putMap("MFD", "Master files delayed application acknowledgement");
		putMap("MFK", "Master file application acknowledgement");
		putMap("MFN", "Master files notification");
		putMap("MFR", "Master files response");
		putMap("NMD", "Network management data");
		putMap("NMQ", "Network management query");
		putMap("NMR", "Network management response");
		putMap("ORF", "Observational result (record response)");
		putMap("ORM", "Order message");
		putMap("ORR", "Order acknowledgement message");
		putMap("ORU", "Observational result (unsolicited)");
		putMap("OSQ", "Order status query");
		putMap("QRY", "Query");
		putMap("RAR", "Pharmacy administration information");
		putMap("RAS", "Pharmacy administration message");
		putMap("RDE", "Pharmacy encoded order message");
		putMap("RDR", "Pharmacy dispense information");
		putMap("RDS", "Pharmacy dispense message");
		putMap("RER", "Pharmacy encoded order information");
		putMap("RGR", "Pharmacy dose information");
		putMap("RGV", "Pharmacy give message");
		putMap("ROR", "Pharmacy prescription order response");
		putMap("RRA", "Pharmacy administration acknowledgment");
		putMap("RRD", "Pharmacy dispense acknowledgment");
		putMap("RRE", "Pharmacy encoded order acknowledgment");
		putMap("RRG", "Pharmacy give acknowledgment");
		putMap("UDM", "Unsolicited display message");

	}

}
