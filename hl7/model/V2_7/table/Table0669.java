package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0669 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0669();
		return table;
	}

	public static final String LCC = "LCC";
	public static final String LCN = "LCN";
	public static final String LCP = "LCP";
	public static final String LLD = "LLD";

	private Table0669(){
		setTableName("Load Status");
		setOID("");

		putMap("LCC", "Load is Complete");
		putMap("LCN", "Load Canceled");
		putMap("LCP", "Load In Process");
		putMap("LLD", "Building a Load");

	}

}
