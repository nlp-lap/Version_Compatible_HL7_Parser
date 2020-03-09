package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0339 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0339();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";

	private Table0339(){
		setTableName("Advanced Beneficiary Notice Code");
		setOID("2.16.840.1.113883.12.339");

		putMap("1", "Service is subject to medical necessity procedures");
		putMap("2", "Patient has been informed of responsibility, and agrees to pay for service");
		putMap("3", "Patient has been informed of responsibility, and asks that the payer be billed");
		putMap("4", "Advanced Beneficiary Notice has not been signed");

	}

}
