package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0466 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0466();
		return table;
	}

	public static final String _031 = "031";
	public static final String _163 = "163";
	public static final String _181 = "181";

	private Table0466(){
		setTableName("Ambulatory Payment Classification Code");
		setOID("2.16.840.1.113883.12.466");

		putMap("031", "Dental procedures");
		putMap("163", "Excision/biopsy");
		putMap("181", "Level 1 skin repair.");

	}

}
