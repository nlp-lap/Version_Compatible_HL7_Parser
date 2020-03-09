package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0232 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0232();
		return table;
	}

	public static final String _01 = "01";
	public static final String _02 = "02";
	public static final String _03 = "03";

	private Table0232(){
		setTableName("Insurance Company Contact Reason");
		setOID("");

		putMap("01", "Medicare claim status");
		putMap("02", "Medicaid claim status");
		putMap("03", "Name/address change");

	}

}
