package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0078 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0078();
		return table;
	}

	public static final String BELOW = "<";
	public static final String ABOVE = ">";
	public static final String A = "A";
	public static final String AA = "AA";
	public static final String AC = "AC";
	public static final String B = "B";
	public static final String D = "D";
	public static final String DET = "DET";
	public static final String H = "H";
	public static final String HH = "HH";
	public static final String I = "I";
	public static final String IND = "IND";
	public static final String L = "L";
	public static final String LL = "LL";
	public static final String MS = "MS";
	public static final String N = "N";
	public static final String ND = "ND";
	public static final String NEG = "NEG";
	public static final String NR = "NR";
	public static final String NULL = "null";
	public static final String POS = "POS";
	public static final String QCF = "QCF";
	public static final String R = "R";
	public static final String RR = "RR";
	public static final String S = "S";
	public static final String TOX = "TOX";
	public static final String U = "U";
	public static final String VS = "VS";
	public static final String W = "W";
	public static final String WR = "WR";

	private Table0078(){
		setTableName("Interpretation Codes");
		setOID("");

		putMap("<", "Below absolute low-off instrument scale");
		putMap(">", "Above absolute high-off instrument scale");
		putMap("A", "Abnormal (applies to non-numeric results)");
		putMap("AA", "Very abnormal (applies to non-numeric units, analogous to panic limits for numeric units)");
		putMap("AC", "Anti-complementary substances present");
		putMap("B", "Better-use when direction not relevant");
		putMap("D", "Significant change down");
		putMap("DET", "Detected");
		putMap("H", "Above high normal");
		putMap("HH", "Above upper panic limits");
		putMap("I", "Intermediate. Indicates for microbiology susceptibilities only.");
		putMap("IND", "Indeterminate");
		putMap("L", "Below low normal");
		putMap("LL", "Below lower panic limits");
		putMap("MS", "Moderately susceptible. Indicates for microbiology susceptibilities only.");
		putMap("N", "Normal (applies to non-numeric results)");
		putMap("ND", "Not Detected");
		putMap("NEG", "Negative");
		putMap("NR", "Non-reactive");
		putMap("null", "No range defined, or normal ranges don't apply");
		putMap("POS", "Positive");
		putMap("QCF", "Quality Control Failure");
		putMap("R", "Resistant. Indicates for microbiology susceptibilities only.");
		putMap("RR", "Reactive");
		putMap("S", "Susceptible. Indicates for microbiology susceptibilities only.");
		putMap("TOX", "Cytotoxic substance present");
		putMap("U", "Significant change up");
		putMap("VS", "Very susceptible. Indicates for microbiology susceptibilities only.");
		putMap("W", "Worse-use when direction not relevant");
		putMap("WR", "Weakly reactive");

	}

}
