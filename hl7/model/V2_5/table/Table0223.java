package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0223 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0223();
		return table;
	}

	public static final String C = "C";
	public static final String M = "M";
	public static final String O = "O";
	public static final String S = "S";
	public static final String U = "U";

	private Table0223(){
		setTableName("Living Dependency");
		setOID("2.16.840.1.113883.12.223");

		putMap("C", "Small Children Dependent");
		putMap("M", "Medical Supervision Required");
		putMap("O", "Other");
		putMap("S", "Spouse Dependent");
		putMap("U", "Unknown");

	}

}
