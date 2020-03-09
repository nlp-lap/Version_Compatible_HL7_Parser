package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0291 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0291();
		return table;
	}

	public static final String BASIC = "BASIC";
	public static final String DICOM = "DICOM";
	public static final String FAX = "FAX";
	public static final String GIF = "GIF";
	public static final String HTML = "HTML";
	public static final String JOT = "JOT";
	public static final String JPEG = "JPEG";
	public static final String Octet_stream = "Octet-stream";
	public static final String PICT = "PICT";
	public static final String PostScript = "PostScript";
	public static final String RTF = "RTF";
	public static final String SGML = "SGML";
	public static final String TIFF = "TIFF";
	public static final String x_hl7_cda_level_one = "x-hl7-cda-level-one";
	public static final String XML = "XML";

	private Table0291(){
		setTableName("Subtype of referenced data");
		setOID("2.16.840.1.113883.12.291");

		putMap("BASIC", "ISDN PCM audio data");
		putMap("DICOM", "Digital Imaging and Communications in Medicine");
		putMap("FAX", "Facsimile data");
		putMap("GIF", "Graphics Interchange Format");
		putMap("HTML", "Hypertext Markup Language");
		putMap("JOT", "Electronic ink data (Jot 1.0 standard)");
		putMap("JPEG", "Joint Photographic Experts Group");
		putMap("Octet-stream", "Uninterpreted binary data");
		putMap("PICT", "PICT format image data");
		putMap("PostScript", "PostScript program");
		putMap("RTF", "Rich Text Format");
		putMap("SGML", "Standard Generalized Markup Language (HL7 V2.3.1 and later)");
		putMap("TIFF", "TIFF image data");
		putMap("x-hl7-cda-level-one", "HL7 Clinical Document Architecture Level One document");
		putMap("XML", "Extensible Markup Language (HL7 V2.3.1 and later)");

	}

}
