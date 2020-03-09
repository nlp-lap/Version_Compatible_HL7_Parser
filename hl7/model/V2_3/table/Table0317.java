package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0317 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0317();
		return table;
	}

	public static final String _9900 = "9900";
	public static final String _9901 = "9901";
	public static final String _9902 = "9902";
	public static final String _9903 = "9903";
	public static final String _9904 = "9904";

	private Table0317(){
		setTableName("Annotations");
		setOID("2.16.840.1.113883.12.317");

		putMap("9900", "Pace spike");
		putMap("9901", "SAS marker");
		putMap("9902", "Sense marker");
		putMap("9903", "Beat marker");
		putMap("9904", "etc.");

	}

}
