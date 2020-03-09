package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0556 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0556();
		return table;
	}

	public static final String AMB = "AMB";
	public static final String DENT = "DENT";

	private Table0556(){
		setTableName("Benefit Group");
		setOID("");

		putMap("AMB", "AMBULATORY CARE");
		putMap("DENT", "DENTAL");

	}

}
