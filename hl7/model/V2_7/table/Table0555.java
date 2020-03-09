package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0555 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0555();
		return table;
	}

	public static final String BK = "BK";
	public static final String FN = "FN";
	public static final String FS = "FS";
	public static final String GP = "GP";
	public static final String IN = "IN";
	public static final String NP = "NP";
	public static final String PA = "PA";
	public static final String SL = "SL";
	public static final String SS = "SS";
	public static final String SU = "SU";

	private Table0555(){
		setTableName("Invoice Type");
		setOID("");

		putMap("BK", "Block");
		putMap("FN", "Final");
		putMap("FS", "Fee for Service");
		putMap("GP", "Group");
		putMap("IN", "Information Only");
		putMap("NP", "Non Patient");
		putMap("PA", "Partial");
		putMap("SL", "Salary");
		putMap("SS", "By Session");
		putMap("SU", "Supplemental");

	}

}
