package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0514 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0514();
		return table;
	}

	public static final String ABOINC = "ABOINC";
	public static final String ACUTHEHTR = "ACUTHEHTR";
	public static final String ALLERGIC1 = "ALLERGIC1";
	public static final String ALLERGIC2 = "ALLERGIC2";
	public static final String ALLERGICR = "ALLERGICR";
	public static final String ANAPHYLAC = "ANAPHYLAC";
	public static final String BACTCONTAM = "BACTCONTAM";
	public static final String DELAYEDHTR = "DELAYEDHTR";
	public static final String DELAYEDSTR = "DELAYEDSTR";
	public static final String GVHD = "GVHD";
	public static final String HYPOTENS = "HYPOTENS";
	public static final String NONHTR1 = "NONHTR1";
	public static final String NONHTR2 = "NONHTR2";
	public static final String NONHTRREC = "NONHTRREC";
	public static final String NONIMMUNE = "NONIMMUNE";
	public static final String NONSPEC = "NONSPEC";
	public static final String NORXN = "NORXN";
	public static final String PTP = "PTP";
	public static final String VOLOVER = "VOLOVER";

	private Table0514(){
		setTableName("Transfusion Adverse Reaction");
		setOID("");

		putMap("ABOINC", "ABO Incompatible Transfusion Reaction");
		putMap("ACUTHEHTR", "Acute Hemolytic Transfusion Reaction");
		putMap("ALLERGIC1", "Allergic Reaction - First");
		putMap("ALLERGIC2", "Allergic Reaction - Recurrent");
		putMap("ALLERGICR", "Allergic Reaction - Repeating");
		putMap("ANAPHYLAC", "Anaphylactic Reaction");
		putMap("BACTCONTAM", "Reaction to Bacterial Contamination");
		putMap("DELAYEDHTR", "Delayed Hemolytic Transfusion Reaction");
		putMap("DELAYEDSTR", "Delayed Serological Transfusion Reaction");
		putMap("GVHD", "Graft vs Host Disease - Transfusion - Associated");
		putMap("HYPOTENS", "Non-hemolytic Hypotensive Reaction");
		putMap("NONHTR1", "Non-Hemolytic Fever Chill Transfusion Reaction - First");
		putMap("NONHTR2", "Non-Hemolytic Fever Chill Transfusion Reaction - Recurrent");
		putMap("NONHTRREC", "Non-Hemolytic Fever Chill Transfusion Reaction - Repeating");
		putMap("NONIMMUNE", "Non-Immune Hemolysis");
		putMap("NONSPEC", "Non-Specific, Non-Hemolytic Transfusion Reaction");
		putMap("NORXN", "No Evidence of Transfusion Reaction");
		putMap("PTP", "Posttransfusion Purpura");
		putMap("VOLOVER", "Symptoms most likely due to volume overload");

	}

}
