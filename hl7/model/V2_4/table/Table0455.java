package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0455 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0455();
		return table;
	}

	public static final String _131 = "131";
	public static final String _141 = "141";

	private Table0455(){
		setTableName("Type of bill code");
		setOID("2.16.840.1.113883.12.455");

		putMap("131", "Hospital - Outpatient - Admit thru Discharge Claim");
		putMap("141", "Hospital - Other - Admit thru Discharge Claim");

	}

}
