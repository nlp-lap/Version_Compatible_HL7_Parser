package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0076 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0076();
		return table;
	}

	public static final String ACK = "ACK";
	public static final String ADR = "ADR";
	public static final String ADT = "ADT";
	public static final String BAR = "BAR";
	public static final String BPS = "BPS";
	public static final String BRP = "BRP";
	public static final String BRT = "BRT";
	public static final String BTS = "BTS";
	public static final String CCF = "CCF";
	public static final String CCI = "CCI";
	public static final String CCM = "CCM";
	public static final String CCQ = "CCQ";
	public static final String CCU = "CCU";
	public static final String CQU = "CQU";
	public static final String CRM = "CRM";
	public static final String CSU = "CSU";
	public static final String DFT = "DFT";
	public static final String DOC = "DOC";
	public static final String DSR = "DSR";
	public static final String EAC = "EAC";
	public static final String EAN = "EAN";
	public static final String EAR = "EAR";
	public static final String EHC = "EHC";
	public static final String ESR = "ESR";
	public static final String ESU = "ESU";
	public static final String INR = "INR";
	public static final String INU = "INU";
	public static final String LSR = "LSR";
	public static final String LSU = "LSU";
	public static final String MDM = "MDM";
	public static final String MFD = "MFD";
	public static final String MFK = "MFK";
	public static final String MFN = "MFN";
	public static final String MFQ = "MFQ";
	public static final String MFR = "MFR";
	public static final String NMD = "NMD";
	public static final String NMQ = "NMQ";
	public static final String NMR = "NMR";
	public static final String OMB = "OMB";
	public static final String OMD = "OMD";
	public static final String OMG = "OMG";
	public static final String OMI = "OMI";
	public static final String OML = "OML";
	public static final String OMN = "OMN";
	public static final String OMP = "OMP";
	public static final String OMS = "OMS";
	public static final String OPL = "OPL";
	public static final String OPR = "OPR";
	public static final String OPU = "OPU";
	public static final String ORA = "ORA";
	public static final String ORB = "ORB";
	public static final String ORD = "ORD";
	public static final String ORF = "ORF";
	public static final String ORG = "ORG";
	public static final String ORI = "ORI";
	public static final String ORL = "ORL";
	public static final String ORM = "ORM";
	public static final String ORN = "ORN";
	public static final String ORP = "ORP";
	public static final String ORR = "ORR";
	public static final String ORS = "ORS";
	public static final String ORU = "ORU";
	public static final String OSM = "OSM";
	public static final String OSQ = "OSQ";
	public static final String OSR = "OSR";
	public static final String OUL = "OUL";
	public static final String PEX = "PEX";
	public static final String PGL = "PGL";
	public static final String PIN = "PIN";
	public static final String PMU = "PMU";
	public static final String PPG = "PPG";
	public static final String PPP = "PPP";
	public static final String PPR = "PPR";
	public static final String PPT = "PPT";
	public static final String PPV = "PPV";
	public static final String PRR = "PRR";
	public static final String PTR = "PTR";
	public static final String QBP = "QBP";
	public static final String QCK = "QCK";
	public static final String QCN = "QCN";
	public static final String QRY = "QRY";
	public static final String QSB = "QSB";
	public static final String QSX = "QSX";
	public static final String QVR = "QVR";
	public static final String RAR = "RAR";
	public static final String RAS = "RAS";
	public static final String RCI = "RCI";
	public static final String RCL = "RCL";
	public static final String RDE = "RDE";
	public static final String RDR = "RDR";
	public static final String RDS = "RDS";
	public static final String RDY = "RDY";
	public static final String REF = "REF";
	public static final String RER = "RER";
	public static final String RGR = "RGR";
	public static final String RGV = "RGV";
	public static final String ROR = "ROR";
	public static final String RPA = "RPA";
	public static final String RPI = "RPI";
	public static final String RPL = "RPL";
	public static final String RPR = "RPR";
	public static final String RQA = "RQA";
	public static final String RQC = "RQC";
	public static final String RQI = "RQI";
	public static final String RQP = "RQP";
	public static final String RRA = "RRA";
	public static final String RRD = "RRD";
	public static final String RRE = "RRE";
	public static final String RRG = "RRG";
	public static final String RRI = "RRI";
	public static final String RSP = "RSP";
	public static final String RTB = "RTB";
	public static final String SCN = "SCN";
	public static final String SDN = "SDN";
	public static final String SDR = "SDR";
	public static final String SIU = "SIU";
	public static final String SLN = "SLN";
	public static final String SLR = "SLR";
	public static final String SMD = "SMD";
	public static final String SQM = "SQM";
	public static final String SQR = "SQR";
	public static final String SRM = "SRM";
	public static final String SRR = "SRR";
	public static final String SSR = "SSR";
	public static final String SSU = "SSU";
	public static final String STC = "STC";
	public static final String STI = "STI";
	public static final String SUR = "SUR";
	public static final String TBR = "TBR";
	public static final String TCR = "TCR";
	public static final String TCU = "TCU";
	public static final String UDM = "UDM";
	public static final String VXQ = "VXQ";
	public static final String VXR = "VXR";
	public static final String VXU = "VXU";
	public static final String VXX = "VXX";

	private Table0076(){
		setTableName("Message Type");
		setOID("");

		putMap("ACK", "General acknowledgment message");
		putMap("ADR", "ADT response");
		putMap("ADT", "ADT message");
		putMap("BAR", "Add/change billing account");
		putMap("BPS", "Blood product dispense status message");
		putMap("BRP", "Blood product dispense status acknowledgement message");
		putMap("BRT", "Blood product transfusion/disposition acknowledgement message");
		putMap("BTS", "Blood product transfusion/disposition message");
		putMap("CCF", "Collaborative Care Fetch");
		putMap("CCI", "Collaborative Care Information");
		putMap("CCM", "Collaborative Care Message");
		putMap("CCQ", "Collaborative Care Referral");
		putMap("CCU", "Collaborative Care Referral");
		putMap("CQU", "Collaborative Care Referral");
		putMap("CRM", "Clinical study registration message");
		putMap("CSU", "Unsolicited study data message");
		putMap("DFT", "Detail financial transactions");
		putMap("DOC", "Document response");
		putMap("DSR", "Display response");
		putMap("EAC", "Automated equipment command message");
		putMap("EAN", "Automated equipment notification message");
		putMap("EAR", "Automated equipment response message");
		putMap("EHC", "Health Care Invoice");
		putMap("ESR", "Automated equipment status update acknowledgment message");
		putMap("ESU", "Automated equipment status update message");
		putMap("INR", "Automated equipment inventory request message");
		putMap("INU", "Automated equipment inventory update message");
		putMap("LSR", "Automated equipment log/service request message");
		putMap("LSU", "Automated equipment log/service update message");
		putMap("MDM", "Medical document management");
		putMap("MFD", "Master files delayed application acknowledgment");
		putMap("MFK", "Master files application acknowledgment");
		putMap("MFN", "Master files notification");
		putMap("MFQ", "Master files query");
		putMap("MFR", "Master files response");
		putMap("NMD", "Application management data message");
		putMap("NMQ", "Application management query message");
		putMap("NMR", "Application management response message");
		putMap("OMB", "Blood product order message");
		putMap("OMD", "Dietary order");
		putMap("OMG", "General clinical order message");
		putMap("OMI", "Imaging order");
		putMap("OML", "Laboratory order message");
		putMap("OMN", "Non-stock requisition order message");
		putMap("OMP", "Pharmacy/treatment order message");
		putMap("OMS", "Stock requisition order message");
		putMap("OPL", "Population/Location-Based Laboratory Order Message");
		putMap("OPR", "Population/Location-Based Laboratory Order Acknowledgment Message");
		putMap("OPU", "Unsolicited Population/Location-Based Laboratory Observation Message");
		putMap("ORA", "Observation Report  Acknowledgment");
		putMap("ORB", "Blood product order acknowledgement message");
		putMap("ORD", "Dietary order acknowledgment message");
		putMap("ORF", "Query for results of observation");
		putMap("ORG", "General clinical order acknowledgment message");
		putMap("ORI", "Imaging order acknowledgement message");
		putMap("ORL", "Laboratory acknowledgment message (unsolicited)");
		putMap("ORM", "Pharmacy/treatment order message");
		putMap("ORN", "Non-stock requisition - General order acknowledgment message");
		putMap("ORP", "Pharmacy/treatment order acknowledgment message");
		putMap("ORR", "General order response message response to any ORM");
		putMap("ORS", "Stock requisition - Order acknowledgment message");
		putMap("ORU", "Unsolicited transmission of an observation message");
		putMap("OSM", "Specimen Shipment Message");
		putMap("OSQ", "Query response for order status");
		putMap("OSR", "Query response for order status");
		putMap("OUL", "Unsolicited laboratory observation message");
		putMap("PEX", "Product experience message");
		putMap("PGL", "Patient goal message");
		putMap("PIN", "Patient insurance information");
		putMap("PMU", "Add personnel record");
		putMap("PPG", "Patient pathway message (goal-oriented)");
		putMap("PPP", "Patient pathway message (problem-oriented)");
		putMap("PPR", "Patient problem message");
		putMap("PPT", "Patient pathway goal-oriented response");
		putMap("PPV", "Patient goal response");
		putMap("PRR", "Patient problem response");
		putMap("PTR", "Patient pathway problem-oriented response");
		putMap("QBP", "Query by parameter");
		putMap("QCK", "Deferred query");
		putMap("QCN", "Cancel query");
		putMap("QRY", "Query, original mode");
		putMap("QSB", "Create subscription");
		putMap("QSX", "Cancel subscription/acknowledge message");
		putMap("QVR", "Query for previous events");
		putMap("RAR", "Pharmacy/treatment administration information");
		putMap("RAS", "Pharmacy/treatment administration message");
		putMap("RCI", "Return clinical information");
		putMap("RCL", "Return clinical list");
		putMap("RDE", "Pharmacy/treatment encoded order message");
		putMap("RDR", "Pharmacy/treatment dispense information");
		putMap("RDS", "Pharmacy/treatment dispense message");
		putMap("RDY", "Display based response");
		putMap("REF", "Patient referral");
		putMap("RER", "Pharmacy/treatment encoded order information");
		putMap("RGR", "Pharmacy/treatment dose information");
		putMap("RGV", "Pharmacy/treatment give message");
		putMap("ROR", "Pharmacy/treatment order response");
		putMap("RPA", "Return patient authorization");
		putMap("RPI", "Return patient information");
		putMap("RPL", "Return patient display list");
		putMap("RPR", "Return patient list");
		putMap("RQA", "Request patient authorization");
		putMap("RQC", "Request clinical information");
		putMap("RQI", "Request patient information");
		putMap("RQP", "Request patient demographics");
		putMap("RRA", "Pharmacy/treatment administration acknowledgment message");
		putMap("RRD", "Pharmacy/treatment dispense acknowledgment message");
		putMap("RRE", "Pharmacy/treatment encoded order acknowledgment message");
		putMap("RRG", "Pharmacy/treatment give acknowledgment message");
		putMap("RRI", "Return referral information");
		putMap("RSP", "Segment pattern response");
		putMap("RTB", "Tabular response");
		putMap("SCN", "Notification of Anti-Microbial Device Cycle Data");
		putMap("SDN", "Notification of Anti-Microbial Device Data");
		putMap("SDR", "Sterilization anti-microbial device data request");
		putMap("SIU", "Schedule information unsolicited");
		putMap("SLN", "Notification of New Sterilization Lot");
		putMap("SLR", "Sterilization lot request");
		putMap("SMD", "Sterilization anti-microbial device cycle data request");
		putMap("SQM", "Schedule query message");
		putMap("SQR", "Schedule query response");
		putMap("SRM", "Schedule request message");
		putMap("SRR", "Scheduled request response");
		putMap("SSR", "Specimen status request message");
		putMap("SSU", "Specimen status update message");
		putMap("STC", "Notification of Sterilization Configuration");
		putMap("STI", "Sterilization item request");
		putMap("SUR", "Summary product experience report");
		putMap("TBR", "Tabular data response");
		putMap("TCR", "Automated equipment test code settings request message");
		putMap("TCU", "Automated equipment test code settings update message");
		putMap("UDM", "Unsolicited display update message");
		putMap("VXQ", "Query for vaccination record");
		putMap("VXR", "Vaccination record response");
		putMap("VXU", "Unsolicited vaccination record update");
		putMap("VXX", "Response for vaccination query with multiple PID matches");

	}

}
