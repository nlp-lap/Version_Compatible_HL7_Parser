package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0518 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0518();
		return table;
	}

	public static final String EQV = "EQV";
	public static final String EXTN = "EXTN";
	public static final String INLV = "INLV";

	private Table0518(){
		setTableName("Override type");
		setOID("2.16.840.1.113883.12.518");

		putMap("EQV", "Equivalence Override");
		putMap("EXTN", "Extension Override");
		putMap("INLV", "Interval Override");

	}

}
