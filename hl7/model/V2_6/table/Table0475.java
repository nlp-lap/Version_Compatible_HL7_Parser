package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0475 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0475();
		return table;
	}

	public static final String _01 = "01";
	public static final String _02 = "02";
	public static final String _03 = "03";
	public static final String _04 = "04";
	public static final String _05 = "05";

	private Table0475(){
		setTableName("Charge Type Reason");
		setOID("2.16.840.1.113883.12.475");

		putMap("01", "Allergy");
		putMap("02", "Intolerance");
		putMap("03", "Treatment Failure");
		putMap("04", "Patient Request");
		putMap("05", "No Exception");

	}

}
