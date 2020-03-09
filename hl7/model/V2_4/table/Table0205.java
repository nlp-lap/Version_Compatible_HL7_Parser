package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0205 extends Table{
	private static final String VERSION = "2.4";
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
		setTableName("Price type");
		setOID("2.16.840.1.113883.12.205");

		putMap("AP", "administrative price or handling fee");
		putMap("DC", "direct unit cost");
		putMap("IC", "indirect unit cost");
		putMap("PF", "professional fee for performing provider");
		putMap("TF", "technology fee for use of equipment");
		putMap("TP", "total price");
		putMap("UP", "unit price, may be based on length of procedure or service");

	}

}
