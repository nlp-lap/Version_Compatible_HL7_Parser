package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0301 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0301();
		return table;
	}

	public static final String DNS = "DNS";
	public static final String GUID = "GUID";
	public static final String HCD = "HCD";
	public static final String HL7 = "HL7";
	public static final String ISO = "ISO";
	public static final String L_M_N = "L,M,N";
	public static final String Random = "Random";
	public static final String UUID = "UUID";
	public static final String x400 = "x400";
	public static final String x500 = "x500";

	private Table0301(){
		setTableName("Universal ID type");
		setOID("2.16.840.1.113883.12.301");

		putMap("DNS", "An Internet dotted name. Either in ASCII or as integers");
		putMap("GUID", "Same as UUID.");
		putMap("HCD", "The CEN Healthcare Coding Scheme Designator. (Identifiers used in DICOM follow this assignment scheme.)");
		putMap("HL7", "Reserved for future HL7 registration schemes");
		putMap("ISO", "An International Standards Organization Object Identifier");
		putMap("L,M,N", "These are reserved for locally defined coding schemes.");
		putMap("Random", "Usually a base64 encoded string of random bits.  The uniqueness depends on the length of the bits.  Mail systems often generate ASCII string  unique names, from a  combination of random bits and system names.  Obviously, such identifiers will not be con");
		putMap("UUID", "The DCE Universal Unique Identifier");
		putMap("x400", "An X.400 MHS format identifier");
		putMap("x500", "An X.500 directory name");

	}

}
