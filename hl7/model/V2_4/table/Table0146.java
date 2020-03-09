package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0146 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0146();
		return table;
	}

	public static final String DF = "DF";
	public static final String LM = "LM";
	public static final String PC = "PC";
	public static final String RT = "RT";
	public static final String UL = "UL";

	private Table0146(){
		setTableName("Amount type");
		setOID("2.16.840.1.113883.12.146");

		putMap("DF", "Differential");
		putMap("LM", "Limit");
		putMap("PC", "Percentage");
		putMap("RT", "Rate");
		putMap("UL", "Unlimited");

	}

}
