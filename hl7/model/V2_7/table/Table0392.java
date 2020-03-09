package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0392 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0392();
		return table;
	}

	public static final String DB = "DB";
	public static final String NA = "NA";
	public static final String NP = "NP";
	public static final String SS = "SS";

	private Table0392(){
		setTableName("Match Reason");
		setOID("");

		putMap("DB", "Match on Date of Birth");
		putMap("NA", "Match on Name (Alpha Match)");
		putMap("NP", "Match on Name (Phonetic Match)");
		putMap("SS", "Match on Social Security Number");

	}

}
