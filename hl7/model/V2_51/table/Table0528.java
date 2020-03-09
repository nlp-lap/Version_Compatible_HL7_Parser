package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0528 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0528();
		return table;
	}

	public static final String AC = "AC";
	public static final String ACD = "ACD";
	public static final String ACM = "ACM";
	public static final String ACV = "ACV";
	public static final String HS = "HS";
	public static final String IC = "IC";
	public static final String ICD = "ICD";
	public static final String ICM = "ICM";
	public static final String ICV = "ICV";
	public static final String PC = "PC";
	public static final String PCD = "PCD";
	public static final String PCM = "PCM";
	public static final String PCV = "PCV";

	private Table0528(){
		setTableName("Event related period");
		setOID("2.16.840.1.113883.12.528");

		putMap("AC", "before meal (from lat. ante cibus)");
		putMap("ACD", "before lunch (from lat. ante cibus diurnus)");
		putMap("ACM", "before breakfast (from lat. ante cibus matutinus)");
		putMap("ACV", "before dinner (from lat. ante cibus vespertinus)");
		putMap("HS", "the hour of sleep (e.g., H18-22)");
		putMap("IC", "between meals (from lat. inter cibus)");
		putMap("ICD", "between lunch and dinner");
		putMap("ICM", "between breakfast and lunch");
		putMap("ICV", "between dinner and the hour of sleep");
		putMap("PC", "after meal (from lat. post cibus)");
		putMap("PCD", "after lunch (from lat. post cibus diurnus)");
		putMap("PCM", "after breakfast (from lat. post cibus matutinus)");
		putMap("PCV", "after dinner (from lat. post cibus vespertinus)");

	}

}
