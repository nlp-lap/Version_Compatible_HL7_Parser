package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0401 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0401();
		return table;
	}

	public static final String C = "C";
	public static final String MM = "MM";

	private Table0401(){
		setTableName("Government reimbursement program");
		setOID("2.16.840.1.113883.12.401");

		putMap("C", "Medi-Cal");
		putMap("MM", "Medicare");

	}

}
