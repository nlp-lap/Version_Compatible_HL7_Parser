package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0291 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0291();
		return table;
	}

	public static final String x_hl7_cda_level_one = "x-hl7-cda-level-one";

	private Table0291(){
		setTableName("Subtype of referenced data");
		setOID("2.16.840.1.113883.12.291");

		putMap("x-hl7-cda-level-one", "HL7 Clinical Document Architecture Level One document");

	}

}
