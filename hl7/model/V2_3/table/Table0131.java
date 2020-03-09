package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0131 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0131();
		return table;
	}

	public static final String BP = "BP";
	public static final String CP = "CP";
	public static final String EP = "EP";
	public static final String PR = "PR";

	private Table0131(){
		setTableName("Contact Role");
		setOID("2.16.840.1.113883.12.131");

		putMap("BP", "Billing contact person");
		putMap("CP", "Contact person");
		putMap("EP", "Emergency contact person");
		putMap("PR", "Person preparing referral");

	}

}
