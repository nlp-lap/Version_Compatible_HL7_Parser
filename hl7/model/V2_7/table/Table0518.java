package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0518 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0518();
		return table;
	}

	public static final String EQV = "EQV";
	public static final String EXTN = "EXTN";
	public static final String INLV = "INLV";

	private Table0518(){
		setTableName("Override Type");
		setOID("");

		putMap("EQV", "Equivalence Override");
		putMap("EXTN", "Extension Override");
		putMap("INLV", "Interval Override");

	}

}
