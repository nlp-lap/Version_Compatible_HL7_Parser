package hl7.bean.message;

import hl7.bean.Structure;
import hl7.bean.datastructure.DataStructure;
import hl7.bean.segment.Segment;

import java.util.ArrayList;

import builder.util.Util;

public abstract class MessageStructure implements Structure{
	private static final long serialVersionUID = 1L;
	public String setVersion = "";
	protected boolean seekOriginalVersion = true;
	public String originalVersion="";
	public String encodeVersion="";
	
//	public String description;
	public String type;
//	public boolean required;
//	public boolean optional;
//	public boolean conditional;
//	public boolean repeatable;
	
	public void setVersion(String setVersion){
	}
	public void originalVersion(String originalVersion){
	}
	public Structure[][] getComponents(){
		return null;
	}
	
	public String getType(){
		return type;
	}
	
	public void decode(String component) throws Exception{
		throw new Exception("No matching segment version");
	}
	
	public String encode() throws Exception{
		throw new Exception("No matching segment version");
	}
	
	public String encode(Structure[][] subComponents) throws Exception{
		throw new Exception("No matching segment version");
	}
	
	public String makeMessage(Structure[][] components, String version) throws Exception{
		throw new Exception("No matching segment version");
	}
	
	
	public static final char SEGMENT_TERMINATOR = (char)0x0D;
	public static final char NEWLINE_CHARACTER = (char)0x0A;
	public static char FIELD_SEPARATOR = '|';
	public static char COMPONENT_SEPARATOR = '^';
	public static char REPEATITION_SEPARATOR = '~';
	public static char ESCAPE_SEPARATOR = '\\';
	public static char SUBCOMPONENT_SEPARATOR = '&';
	public static int V21 = 0;
	public static int V22 = 1;
	public static int V23 = 2;
	public static int V231 = 3;
	public static int V24 = 4;
	public static int V25 = 5;
	public static int V251 = 6;
	public static int V26 = 7;
	public static int V27 = 8;
	
	public static int getVersionCode(String version){
		switch(version){
		case "2.1":
			return V21;
		case "2.2":
			return V22;
		case "2.3":
			return V23;
		case "2.3.1":
			return V231;
		case "2.4":
			return V24;
		case "2.5":
			return V25;
		case "2.5.1":
			return V251;
		case "2.6":
			return V26;
		case "2.7":
			return V27;
		}
		return -1;
	}
	
	public static final String ADT_A01 = "ADT_A01";
	
	private static void setSeparator(String MSH_Segment){
		MessageStructure.FIELD_SEPARATOR = MSH_Segment.charAt(3);
		MessageStructure.COMPONENT_SEPARATOR = MSH_Segment.charAt(4);
		MessageStructure.REPEATITION_SEPARATOR = MSH_Segment.charAt(5);
		MessageStructure.ESCAPE_SEPARATOR = MSH_Segment.charAt(6);
		MessageStructure.SUBCOMPONENT_SEPARATOR = MSH_Segment.charAt(7);
	}
	public static String getMessageVersion(String message) throws Exception{
		String[] segments = Util.divide(message, MessageStructure.SEGMENT_TERMINATOR, (char)0x0A);
		if(segments[0].startsWith(Segment.MSH)){
			setSeparator(segments[0]);	//Separator ÀÎ½Ä
			String[] components = Util.divide(segments[0], MessageStructure.FIELD_SEPARATOR);
			String version = components[11];
			return version;
		}
		return null;
	}
	
	protected String[] divide(String message, char... delimiters){
		ArrayList<String> list = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
    	for(int i=0; i<message.length(); i++){
    		char ch = message.charAt(i);
    		boolean exist = false;
    		for(int c=0; c<delimiters.length; c++){
    			if(ch==delimiters[c]){
    				exist = true;
    				break;
    			}
    		}
    		if(exist){
    			if(sb.toString().trim().length()>0) list.add(sb.toString().trim());
    			sb.setLength(0);
    		}else{
    			sb.append(ch);
    		}
    	}
    	if(sb.toString().trim().length()>0) list.add(sb.toString().trim());
    	return (list.size()>0)?list.toArray(new String[0]):null;
	}
	
//	protected void addStructure(Structure[][] components, Structure structure, int index){
//		if(components.length<=index) return;
//		Structure[] comps = components[index];
//		Structure[] newComps;
//		newComps = (comps==null)?new Structure[1]:new Structure[comps.length+1];
//		for(int i=0; i<newComps.length-1; i++) newComps[i]=comps[i];
//		newComps[newComps.length-1] = structure;
//		components[index] = newComps;
//	}
}
