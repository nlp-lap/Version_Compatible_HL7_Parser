package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0369 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0369();
		return table;
	}

	public static final String B = "B";
	public static final String C = "C";
	public static final String E = "E";
	public static final String F = "F";
	public static final String G = "G";
	public static final String L = "L";
	public static final String O = "O";
	public static final String P = "P";
	public static final String Q = "Q";
	public static final String R = "R";
	public static final String V = "V";

	private Table0369(){
		setTableName("Specimen Role");
		setOID("2.16.840.1.113883.12.369");

		putMap("B", "Blind Sample");
		putMap("C", "Calibrator, used for initial setting of calibration");
		putMap("E", "Electronic QC, used with manufactured reference providing signals that simulate QC results");
		putMap("F", "Specimen used for testing proficiency of the organization performing the testing (Filler)");
		putMap("G", "Group (where a specimen consists of multiple individual elements that are not individually identified)");
		putMap("L", "Pool (aliquots of individual specimens combined to form a single specimen representing all of the components.)");
		putMap("O", "Specimen used for testing Operator Proficiency");
		putMap("P", "Patient");
		putMap("Q", "Control specimen");
		putMap("R", "Replicate");
		putMap("V", "Verifying Calibrator, used for periodic calibration checks");

	}

}
