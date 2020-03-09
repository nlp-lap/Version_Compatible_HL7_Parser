package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0562 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0562();
		return table;
	}

	public static final String DFADJ = "DFADJ";
	public static final String EFORM = "EFORM";
	public static final String FAX = "FAX";
	public static final String PAPER = "PAPER";
	public static final String PYRDELAY = "PYRDELAY";
	public static final String RTADJ = "RTADJ";

	private Table0562(){
		setTableName("Processing Consideration Codes");
		setOID("");

		putMap("DFADJ", "Deferred Adjudication Processing");
		putMap("EFORM", "Electronic form to follow");
		putMap("FAX", "Fax to follow");
		putMap("PAPER", "Paper documentation to follow");
		putMap("PYRDELAY", "Delayed by a Previous Payer");
		putMap("RTADJ", "Real Time Adjudication Processing");

	}

}
