package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0078 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0078();
		return table;
	}

	public static final String BELOW = "<";
	public static final String ABOVE = ">";
	public static final String A = "A";
	public static final String AA = "AA";
	public static final String B = "B";
	public static final String D = "D";
	public static final String H = "H";
	public static final String HH = "HH";
	public static final String I = "I";
	public static final String L = "L";
	public static final String LL = "LL";
	public static final String MS = "MS";
	public static final String N = "N";
	public static final String NULL = "null";
	public static final String R = "R";
	public static final String S = "S";
	public static final String U = "U";
	public static final String VS = "VS";
	public static final String W = "W";

	private Table0078(){
		setTableName("Abnormal Flags");
		setOID("2.16.840.1.113883.12.78");

		putMap("<", "Below absolute low-off instrument scale");
		putMap(">", "Above absolute high-off instrument scale");
		putMap("A", "Abnormal (applies to non-numeric results)");
		putMap("AA", "Very abnormal (applies to non-numeric units, analagous to panic limits for numeric units)");
		putMap("B", "Better--use when direction not relevant");
		putMap("D", "Significant change down");
		putMap("H", "Above high normal");
		putMap("HH", "Above upper panic limits");
		putMap("I", "Intermediate (microbiology sensitivies only)");
		putMap("L", "Below low normal");
		putMap("LL", "Below lower panic limits");
		putMap("MS", "Moderately sensitive (microbiology sensitivies only)");
		putMap("N", "Normal (applies to non-numeric results)");
		putMap("null", "No range defined, or normal ranges don't apply");
		putMap("R", "Resistant (microbiology sensitivies only)");
		putMap("S", "Sensitive (microbiology sensitivies only)");
		putMap("U", "Significant change up");
		putMap("VS", "Very sensitive (microbiology sensitivies only)");
		putMap("W", "Worse--use when direction not relevant");

	}

}
