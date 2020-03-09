package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0144 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0144();
		return table;
	}

	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";
	public static final String _4 = "4";
	public static final String _5 = "5";
	public static final String _6 = "6";
	public static final String _7 = "7";

	private Table0144(){
		setTableName("Eligibility Source");
		setOID("2.16.840.1.113883.12.144");

		putMap("1", "Insurance company");
		putMap("2", "Employer");
		putMap("3", "Insured presented policy");
		putMap("4", "Insured presented card");
		putMap("5", "Signed statement on file");
		putMap("6", "Verbal information");
		putMap("7", "None");

	}

}
