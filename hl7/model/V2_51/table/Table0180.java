package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0180 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0180();
		return table;
	}

	public static final String MAC = "MAC";
	public static final String MAD = "MAD";
	public static final String MDC = "MDC";
	public static final String MDL = "MDL";
	public static final String MUP = "MUP";

	private Table0180(){
		setTableName("Record-level event code");
		setOID("2.16.840.1.113883.12.180");

		putMap("MAC", "Reactivate deactivated record");
		putMap("MAD", "Add record to master file");
		putMap("MDC", "Deactivate: discontinue using record in master file, but do not delete from database");
		putMap("MDL", "Delete record from master file");
		putMap("MUP", "Update record for master file");

	}

}
