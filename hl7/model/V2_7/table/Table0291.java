package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0291 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0291();
		return table;
	}

	public static final String x_hl7_cda_level_one = "x-hl7-cda-level-one";

	private Table0291(){
		setTableName("Subtype of Referenced Data");
		setOID("");

		putMap("x-hl7-cda-level-one", "HL7 Clinical Document Architecture Level One document");

	}

}
