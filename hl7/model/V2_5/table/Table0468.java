package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0468 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0468();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String _5 = "5";

	private Table0468(){
		setTableName("Payment Adjustment Code");
		setOID("2.16.840.1.113883.12.468");

		putMap("1", "No payment adjustment");
		putMap("2", "Designated current drug or biological payment adjustment applies to APC (status indicator G)");
		putMap("3", "Designated new device payment adjustment applies to APC (status indicator H)");
		putMap("4", "Designated new drug or new biological payment adjustment applies to APC (status indicator J)");
		putMap("5", "Deductible not applicable (specific list of HCPCS codes)");

	}

}
