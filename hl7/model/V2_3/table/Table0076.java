package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0076 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0076();
		return table;
	}

	public static final String ACK = "ACK";
	public static final String ADR = "ADR";
	public static final String ADT = "ADT";
	public static final String ARD = "ARD";
	public static final String BAR = "BAR";
	public static final String CNQ = "CNQ";
	public static final String CSU = "CSU";
	public static final String DFT = "DFT";
	public static final String DOC = "DOC";
	public static final String DSR = "DSR";
	public static final String EDR = "EDR";
	public static final String EQQ = "EQQ";
	public static final String ERP = "ERP";
	public static final String ERQ = "ERQ";
	public static final String MCF = "MCF";
	public static final String MDM = "MDM";
	public static final String MFD = "MFD";
	public static final String MFK = "MFK";
	public static final String MFN = "MFN";
	public static final String MFQ = "MFQ";
	public static final String MFR = "MFR";
	public static final String ORF = "ORF";
	public static final String ORM = "ORM";
	public static final String ORR = "ORR";
	public static final String ORU = "ORU";
	public static final String OSQ = "OSQ";
	public static final String OSR = "OSR";
	public static final String PEX = "PEX";
	public static final String PGL = "PGL";
	public static final String PIN = "PIN";
	public static final String PPG = "PPG";
	public static final String PPR = "PPR";
	public static final String PPT = "PPT";
	public static final String PPV = "PPV";
	public static final String PRR = "PRR";
	public static final String PTR = "PTR";
	public static final String QCK = "QCK";
	public static final String QRY = "QRY";
	public static final String RAR = "RAR";
	public static final String RAS = "RAS";
	public static final String RCI = "RCI";
	public static final String RCL = "RCL";
	public static final String RDE = "RDE";
	public static final String RDR = "RDR";
	public static final String RDS = "RDS";
	public static final String REF = "REF";
	public static final String RER = "RER";
	public static final String RGR = "RGR";
	public static final String RGV = "RGV";
	public static final String ROC = "ROC";
	public static final String ROD = "ROD";
	public static final String ROR = "ROR";
	public static final String RPA = "RPA";
	public static final String RPI = "RPI";
	public static final String RPL = "RPL";
	public static final String RPR = "RPR";
	public static final String RQA = "RQA";
	public static final String RQC = "RQC";
	public static final String RQI = "RQI";
	public static final String RQP = "RQP";
	public static final String RQQ = "RQQ";
	public static final String RRA = "RRA";
	public static final String RRD = "RRD";
	public static final String RRE = "RRE";
	public static final String RRG = "RRG";
	public static final String RRI = "RRI";
	public static final String SIU = "SIU";
	public static final String SPQ = "SPQ";
	public static final String SQM = "SQM";
	public static final String SQR = "SQR";
	public static final String SRM = "SRM";
	public static final String SRR = "SRR";
	public static final String TBR = "TBR";
	public static final String UDM = "UDM";
	public static final String VQQ = "VQQ";
	public static final String VXQ = "VXQ";
	public static final String VXR = "VXR";
	public static final String VXU = "VXU";
	public static final String VXX = "VXX";

	private Table0076(){
		setTableName("Message Type");
		setOID("2.16.840.1.113883.12.76");

		putMap("ACK", "General acknowledgment message");
		putMap("ADR", "Patient query response");
		putMap("ADT", "ADT message");
		putMap("ARD", "Ancillary RPT (display)");
		putMap("BAR", "Add/change billing account");
		putMap("CNQ", "Cancel query");
		putMap("CSU", "Unsolicited clinical study data");
		putMap("DFT", "Detail financial transaction");
		putMap("DOC", "Document Response");
		putMap("DSR", "Display response");
		putMap("EDR", "Enhanced display response");
		putMap("EQQ", "Embedded query language query");
		putMap("ERP", "Event replay response");
		putMap("ERQ", "Event replay query");
		putMap("MCF", "Delayed acknowledgment");
		putMap("MDM", "Documentation message");
		putMap("MFD", "Master files delayed application ack");
		putMap("MFK", "Master files application ack");
		putMap("MFN", "Master files notification");
		putMap("MFQ", "Master files query");
		putMap("MFR", "Master files query response");
		putMap("ORF", "Observ. result/record response");
		putMap("ORM", "Order message");
		putMap("ORR", "Order acknowledgment message");
		putMap("ORU", "Observ result/unsolicited");
		putMap("OSQ", "Order status query");
		putMap("OSR", "Order status response");
		putMap("PEX", "Product experience");
		putMap("PGL", "Patient goal");
		putMap("PIN", "Patient information");
		putMap("PPG", "Patient Pathway (goal-oriented) message");
		putMap("PPR", "Patient problem");
		putMap("PPT", "Patient Pathway (goal oriented) response");
		putMap("PPV", "Patient Goal Response");
		putMap("PRR", "Patient Problem Response");
		putMap("PTR", "Patient Pathway (problem-oriented) response");
		putMap("QCK", "Query General  Acknowledgment");
		putMap("QRY", "Query, original Mode");
		putMap("RAR", "Pharmacy administration information");
		putMap("RAS", "Pharmacy administration message");
		putMap("RCI", "Return clinical information");
		putMap("RCL", "Return clinical list");
		putMap("RDE", "Pharmacy encoded order message");
		putMap("RDR", "Pharmacy dispense information");
		putMap("RDS", "Pharmacy dispense message");
		putMap("REF", "Patient referral");
		putMap("RER", "Pharmacy encoded order information");
		putMap("RGR", "Pharmacy dose information");
		putMap("RGV", "Pharmacy give message");
		putMap("ROC", "Request clinical information");
		putMap("ROD", "Request pateint demographics");
		putMap("ROR", "Pharmacy prescription order response");
		putMap("RPA", "Return patient authorization");
		putMap("RPI", "Return patient information");
		putMap("RPL", "Return patient display list");
		putMap("RPR", "Return patient list");
		putMap("RQA", "Request patient authorization");
		putMap("RQC", "Request Clinical Information");
		putMap("RQI", "Request patient information");
		putMap("RQP", "Request Patient Demographics");
		putMap("RQQ", "??? Page 2-68");
		putMap("RRA", "Pharmacy administration acknowledgment");
		putMap("RRD", "Pharmacy dispense acknowledgment");
		putMap("RRE", "Pharmacy encoded order acknowledgment");
		putMap("RRG", "Pharmacy give acknowledgment");
		putMap("RRI", "Return patient referral");
		putMap("SIU", "Schedule information unsolicited");
		putMap("SPQ", "Stored procedure request");
		putMap("SQM", "Schedule query");
		putMap("SQR", "Schedule query response");
		putMap("SRM", "Study registration");
		putMap("SRR", "Scheduled request response");
		putMap("TBR", "Tabular response");
		putMap("UDM", "Unsolicited display message");
		putMap("VQQ", "Virtual table query");
		putMap("VXQ", "Query for vaccination record");
		putMap("VXR", "Vaccination query record response");
		putMap("VXU", "Unsolicited vaccinnation record update");
		putMap("VXX", "Vaccination query response with multiple PID matches");

	}

}
