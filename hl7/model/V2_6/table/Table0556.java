package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0556 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0556();
		return table;
	}

	public static final String AMB = "AMB";
	public static final String DENT = "DENT";

	private Table0556(){
		setTableName("Benefit Group");
		setOID("2.16.840.1.113883.12.556");

		putMap("AMB", "AMBULATORY CARE");
		putMap("DENT", "DENTAL");

	}

}
