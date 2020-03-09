package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0232 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0232();
		return table;
	}

	public static final String _01 = "01";
	public static final String _02 = "02";
	public static final String _03 = "03";

	private Table0232(){
		setTableName("Insurance company contact reason");
		setOID("2.16.840.1.113883.12.232");

		putMap("01", "Medicare claim status");
		putMap("02", "Medicaid claim status");
		putMap("03", "Name/address change");

	}

}
