package hl7.model.V2_1.table;

import hl7.bean.table.Table;

public class Table0076 extends Table{
	private static final String VERSION = "2.1";
	public static Table getInstance(){
		if(table==null) new Table0076();
		return table;
	}

	public static final String ACK = "ACK";
	public static final String ARD = "ARD";
	public static final String BAR = "BAR";
	public static final String DSR = "DSR";
	public static final String MCF = "MCF";
	public static final String ORF = "ORF";
	public static final String ORM = "ORM";
	public static final String ORR = "ORR";
	public static final String ORU = "ORU";
	public static final String OSQ = "OSQ";
	public static final String UDM = "UDM";

	private Table0076(){
		setTableName("MESSAGE TYPE");
		setOID("2.16.840.1.113883.12.76");

		putMap("ACK", "General Acknowledgment       CNT       II");
		putMap("ARD", "Ancillary RPT (display)      ANR       VII");
		putMap("BAR", "Add/change billing account   BLN       VI");
		putMap("DSR", "Display response             QRY       V");
		putMap("MCF", "Delayed acknowledgment       CNT       II");
		putMap("ORF", "Observ. Result/record resp.  ANR       VII");
		putMap("ORM", "Order                        ORD       IV");
		putMap("ORR", "Order response message       ORD       IV");
		putMap("ORU", "Observ. result/unsolicited   ANR       VII");
		putMap("OSQ", "Order status query           ORD       IV");
		putMap("UDM", "Unsolicited display          QRY       V");

	}

}
