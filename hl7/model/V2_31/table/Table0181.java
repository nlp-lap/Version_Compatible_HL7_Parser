package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0181 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0181();
		return table;
	}

	public static final String S = "S";
	public static final String U = "U";

	private Table0181(){
		setTableName("MFN record-level error return");
		setOID("2.16.840.1.113883.12.181");

		putMap("S", "Successful posting of the record defined by the MFE segment");
		putMap("U", "Unsuccessful posting of the record defined by the MFE segment");

	}

}
