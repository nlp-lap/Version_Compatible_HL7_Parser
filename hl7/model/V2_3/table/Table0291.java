package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0291 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0291();
		return table;
	}

	public static final String BASIC = "BASIC";
	public static final String DICOM = "DICOM";
	public static final String FAX = "FAX";
	public static final String GIF = "GIF";
	public static final String JOT = "JOT";
	public static final String JPEG = "JPEG";
	public static final String Octet_stream = "Octet-stream";
	public static final String PICT = "PICT";
	public static final String PostScript = "PostScript";
	public static final String TIFF = "TIFF";

	private Table0291(){
		setTableName("Subtype of Referenced Data");
		setOID("2.16.840.1.113883.12.291");

		putMap("BASIC", "ISDN PCM audio data");
		putMap("DICOM", "Digital Imaging and Communications in Medicine");
		putMap("FAX", "Facsimile data");
		putMap("GIF", "Needs formal description");
		putMap("JOT", "Electronic ink data (Jot 1.0 standard)");
		putMap("JPEG", "Needs formal description");
		putMap("Octet-stream", "Uninterpreted binary data");
		putMap("PICT", "PICT format image data");
		putMap("PostScript", "PostScript program");
		putMap("TIFF", "TIFF image data");

	}

}
