package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0401 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0401();
		return table;
	}

	public static final String C = "C";
	public static final String MM = "MM";

	private Table0401(){
		setTableName("Government Reimbursement Program");
		setOID("");

		putMap("C", "Medi-Cal");
		putMap("MM", "Medicare");

	}

}
