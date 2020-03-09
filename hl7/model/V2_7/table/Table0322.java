package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0322 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0322();
		return table;
	}

	public static final String CP = "CP";
	public static final String NA = "NA";
	public static final String PA = "PA";
	public static final String RE = "RE";

	private Table0322(){
		setTableName("Completion Status");
		setOID("");

		putMap("CP", "Complete");
		putMap("NA", "Not Administered");
		putMap("PA", "Partially Administered");
		putMap("RE", "Refused");

	}

}
