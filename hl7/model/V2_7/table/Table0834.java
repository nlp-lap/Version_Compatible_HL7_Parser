package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0834 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0834();
		return table;
	}

	public static final String application = "application";
	public static final String audio = "audio";
	public static final String image = "image";
	public static final String model = "model";
	public static final String multipart = "multipart";
	public static final String text = "text";
	public static final String video = "video";

	private Table0834(){
		setTableName("MIME Types");
		setOID("");

		putMap("application", "Application data");
		putMap("audio", "Audio data");
		putMap("image", "Image data");
		putMap("model", "Model data");
		putMap("multipart", "MIME multipart package");
		putMap("text", "Text data");
		putMap("video", "Video data");

	}

}
