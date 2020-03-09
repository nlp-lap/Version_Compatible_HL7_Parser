package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0205 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0205();
		return table;
	}

	public static final String AP = "AP";
	public static final String DC = "DC";
	public static final String IC = "IC";
	public static final String PF = "PF";
	public static final String TF = "TF";
	public static final String TP = "TP";
	public static final String UP = "UP";

	private Table0205(){
		setTableName("Price Type");
		setOID("2.16.840.1.113883.12.205");

		putMap("AP", "Administrative Price or Handling Fee");
		putMap("DC", "Direct Unit Cost");
		putMap("IC", "Indirect Unit Cost");
		putMap("PF", "Professional Fee for Performing Provider");
		putMap("TF", "Technology Fee for Use of Equipment");
		putMap("TP", "Total Price");
		putMap("UP", "Unit Price, may be based on length of procedure or service");

	}

}
