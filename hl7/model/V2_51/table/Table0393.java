package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0393 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0393();
		return table;
	}

	public static final String LINKSOFT_2_01 = "LINKSOFT_2.01";
	public static final String MATCHWARE_1_2 = "MATCHWARE_1.2";

	private Table0393(){
		setTableName("Match algorithms");
		setOID("2.16.840.1.113883.12.393");

		putMap("LINKSOFT_2.01", "Proprietary algorithm for LinkSoft v2.01");
		putMap("MATCHWARE_1.2", "Proprietary algorithm for MatchWare v1.2");

	}

}
