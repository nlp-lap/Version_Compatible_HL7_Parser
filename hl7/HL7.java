package hl7;

import hl7.bean.message.MessageStructure;

import java.util.ArrayList;

import builder.util.Util;

public class HL7 {
	public static void main(String[] args) throws Exception{
		String file = "./message/ADT_A01_25.hl7";
		String message = Util.load(file);
		new HL7(message);
	}
	
	public String MESSAGE_TYPE = null;
	public String MESSAGE_VERSION = null;
	private String[] msh_comps;
	public HL7(String message){
		MessageStructure.FIELD_SEPARATOR = '|';
		MessageStructure.COMPONENT_SEPARATOR = '^';
		MessageStructure.REPEATITION_SEPARATOR = '~';
		MessageStructure.ESCAPE_SEPARATOR = '\\';
		MessageStructure.SUBCOMPONENT_SEPARATOR = '&';
		
		String[] segs = Util.divide(message, MessageStructure.SEGMENT_TERMINATOR);
		if(segs!=null){
			String msh = segs[0];
			if(msh.startsWith("MSH")){
				msh_comps = Util.divide(msh, MessageStructure.FIELD_SEPARATOR);
				String separators = msh_comps[1];
				MessageStructure.COMPONENT_SEPARATOR = separators.charAt(0);
				MessageStructure.REPEATITION_SEPARATOR = separators.charAt(1);
				MessageStructure.ESCAPE_SEPARATOR = separators.charAt(2);
				MessageStructure.SUBCOMPONENT_SEPARATOR = separators.charAt(3);
				
				MESSAGE_TYPE = msh_comps[8];
				MESSAGE_VERSION = msh_comps[11];
			}
		}
	}
	
	public String getMessageClassName(){
		if(MESSAGE_TYPE==null) return null;
		if(msh_comps[8]!=null){
			String[] types = Util.divide(msh_comps[8], MessageStructure.COMPONENT_SEPARATOR);
			if(types.length==3){
				return types[2];
			}else if(types.length==2){
				return types[0]+"_"+types[1];
			}
		}
		return null;
	}
	
	
}
