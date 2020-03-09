package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0191 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0191();
		return table;
	}

	public static final String AP = "AP";
	public static final String AU = "AU";
	public static final String FT = "FT";
	public static final String IM = "IM";
	public static final String multipart = "multipart";
	public static final String NS = "NS";
	public static final String SD = "SD";
	public static final String SI = "SI";
	public static final String TEXT = "TEXT";
	public static final String TX = "TX";

	private Table0191(){
		setTableName("Type of referenced data");
		setOID("2.16.840.1.113883.12.191");

		putMap("AP", "Other application data, typically uninterpreted binary data  (HL7 V2.3 and later)");
		putMap("AU", "Audio data  (HL7 V2.3 and later)");
		putMap("FT", "Formatted text (HL7 V2.2 only)");
		putMap("IM", "Image data  (HL7 V2.3 and later)");
		putMap("multipart", "MIME multipart package");
		putMap("NS", "Non-scanned image (HL7 V2.2 only)");
		putMap("SD", "Scanned document (HL7 V2.2 only)");
		putMap("SI", "Scanned image (HL7 V2.2 only)");
		putMap("TEXT", "Machine readable text document (HL7 V2.3.1 and later)");
		putMap("TX", "Machine readable text document (HL7 V2.2 only)");

	}

}
