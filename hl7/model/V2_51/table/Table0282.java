package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0282 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0282();
		return table;
	}

	public static final String AM = "AM";
	public static final String RP = "RP";
	public static final String SO = "SO";
	public static final String WR = "WR";

	private Table0282(){
		setTableName("Referral disposition");
		setOID("2.16.840.1.113883.12.282");

		putMap("AM", "Assume Management");
		putMap("RP", "Return Patient After Evaluation");
		putMap("SO", "Second Opinion");
		putMap("WR", "Send Written Report");

	}

}
