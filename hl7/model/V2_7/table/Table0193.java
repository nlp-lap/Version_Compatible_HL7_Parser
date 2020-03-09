package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0193 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0193();
		return table;
	}

	public static final String AT = "AT";
	public static final String LM = "LM";
	public static final String PC = "PC";
	public static final String UL = "UL";

	private Table0193(){
		setTableName("Amount Class");
		setOID("");

		putMap("AT", "Amount");
		putMap("LM", "Limit");
		putMap("PC", "Percentage");
		putMap("UL", "Unlimited");

	}

}
