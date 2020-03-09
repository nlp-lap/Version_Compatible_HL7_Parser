package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0806 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0806();
		return table;
	}

	public static final String EOG = "EOG";
	public static final String PCA = "PCA";
	public static final String STM = "STM";

	private Table0806(){
		setTableName("Sterilization Type");
		setOID("");

		putMap("EOG", "Ethylene Oxide Gas");
		putMap("PCA", "Peracetic acid");
		putMap("STM", "Steam");

	}

}
