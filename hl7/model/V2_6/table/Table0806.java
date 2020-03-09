package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0806 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0806();
		return table;
	}

	public static final String EOG = "EOG";
	public static final String PCA = "PCA";
	public static final String STM = "STM";

	private Table0806(){
		setTableName("Sterilization Type");
		setOID("2.16.840.1.113883.12.806");

		putMap("EOG", "Ethylene Oxide Gas");
		putMap("PCA", "Peracetic acid");
		putMap("STM", "Steam");

	}

}
