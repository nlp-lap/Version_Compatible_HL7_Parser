package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0459 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0459();
		return table;
	}

	public static final String _0 = "0";
	public static final String _1 = "1";
	public static final String _2 = "2";
	public static final String _3 = "3";

	private Table0459(){
		setTableName("Reimbursement Action Code");
		setOID("");

		putMap("0", "OCE line item denial or rejection is not ignored");
		putMap("1", "OCE line item denial or rejection is ignored");
		putMap("2", "External line item denial. Line item is denied even if no OCE edits");
		putMap("3", "External line item rejection. Line item is rejected even if no OCE edits");

	}

}
