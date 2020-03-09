package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0334 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0334();
		return table;
	}

	public static final String AP = "AP";
	public static final String GT = "GT";
	public static final String IN = "IN";
	public static final String PT = "PT";

	private Table0334(){
		setTableName("Disabled person");
		setOID("2.16.840.1.113883.12.334");

		putMap("AP", "Associated party");
		putMap("GT", "Guarantor");
		putMap("IN", "Insured");
		putMap("PT", "Patient");

	}

}
