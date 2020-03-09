package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0349 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0349();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String _5 = "5";

	private Table0349(){
		setTableName("PSRO/UR approval indicator");
		setOID("2.16.840.1.113883.12.349");

		putMap("1", "Approved by the PSRO/UR as billed");
		putMap("2", "Automatic approval as billed based on focused review");
		putMap("3", "Partial approval");
		putMap("4", "Admission denied");
		putMap("5", "Postpayment review applicable");

	}

}
