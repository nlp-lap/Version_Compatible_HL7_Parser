package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0301 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0301();
		return table;
	}

	public static final String CLIA = "CLIA";
	public static final String CLIP = "CLIP";
	public static final String DNS = "DNS";
	public static final String EUI64 = "EUI64";
	public static final String GUID = "GUID";
	public static final String HCD = "HCD";
	public static final String HL7 = "HL7";
	public static final String ISO = "ISO";
	public static final String L_M_N = "L,M,N";
	public static final String Random = "Random";
	public static final String URI = "URI";
	public static final String UUID = "UUID";
	public static final String x400 = "x400";
	public static final String x500 = "x500";

	private Table0301(){
		setTableName("Universal ID Type");
		setOID("");

		putMap("CLIA", "Clinical Laboratory Improvement Amendments. Allows for the ability to designate organization identifier as a CLIA assigned number (for labs)");
		putMap("CLIP", "Clinical laboratory Improvement Program. Allows for the ability to designate organization identifier as a CLIP assigned number (for labs).A? Used by US Department of Defense.");
		putMap("DNS", "An Internet host name, in accordance with RFC 1035; or an IP address. Either in ASCII or as integers, with periods between components (dotted notation).");
		putMap("EUI64", "IEEE 64-bit Extended Unique Identifier is comprised of a  24-bit company identifier and a 40-bit instance identifier.  The value shall be formatted as 16 ASCII HEX digits, for example, AABBCC1122334455.  The 24-bit company identifier, formally known as");
		putMap("GUID", "Same as UUID.");
		putMap("HCD", "The CEN Healthcare Coding Scheme Designator");
		putMap("HL7", "HL7 registration schemes");
		putMap("ISO", "An International Standards Organization Object Identifier (OID), in accordance with ISO/IEC 8824.  Formatted as decimal digits separated by periods; recommended limit of 64 characters");
		putMap("L,M,N", "Locally defined coding entity identifier.");
		putMap("Random", "Usually a base64 encoded string of random bits.<p>Note: Random IDs are typically used for instance identifiers, rather than an identifier of an Assigning Authority that issues instance identifiers");
		putMap("URI", "Uniform Resource Identifier");
		putMap("UUID", "The DCE Universal Unique Identifier, in accordance with RFC 4122. Recommended format is 32 hexadecimal digits separated by hyphens, in the digit grouping 8-4-4-4-12");
		putMap("x400", "An X.400 MHS identifier. Recommended format is in accordance with RFC 1649");
		putMap("x500", "An X.500 directory name");

	}

}
