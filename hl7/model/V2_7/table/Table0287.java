package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0287 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0287();
		return table;
	}

	public static final String AD = "AD";
	public static final String CO = "CO";
	public static final String DE = "DE";
	public static final String LI = "LI";
	public static final String UC = "UC";
	public static final String UN = "UN";
	public static final String UP = "UP";

	private Table0287(){
		setTableName("Problem/Goal Action Code");
		setOID("");

		putMap("AD", "ADD");
		putMap("CO", "CORRECT");
		putMap("DE", "DELETE");
		putMap("LI", "LINK");
		putMap("UC", "UNCHANGED *");
		putMap("UN", "UNLINK");
		putMap("UP", "UPDATE");

	}

}
