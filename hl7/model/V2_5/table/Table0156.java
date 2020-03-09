package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0156 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0156();
		return table;
	}

	public static final String ANY = "ANY";
	public static final String COL = "COL";
	public static final String ORD = "ORD";
	public static final String RCT = "RCT";
	public static final String REP = "REP";
	public static final String SCHED = "SCHED";

	private Table0156(){
		setTableName("Which date/time qualifier");
		setOID("2.16.840.1.113883.12.156");

		putMap("ANY", "Any date/time within a range");
		putMap("COL", "Collection date/time, equivalent to film or sample collection date/time");
		putMap("ORD", "Order date/time");
		putMap("RCT", "Specimen receipt date/time, receipt of specimen in filling ancillary (Lab)");
		putMap("REP", "Report date/time, report date/time at filing ancillary (i.e., Lab)");
		putMap("SCHED", "Schedule date/time");

	}

}
