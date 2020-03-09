package hl7.bean.group;

import java.util.ArrayList;

import hl7.bean.Structure;
import hl7.bean.datastructure.DataStructure;

public abstract class Group implements Structure{
	public abstract Group cloneClass(String originalVersion, String setVersion);
	public abstract boolean needsNewGroup(String segmentType, Structure[] comps);
//	public abstract void decode(int[] index, String[] comps) throws Exception;
	public abstract void decode(String originalVersion, String setVersion, String VERSION, int[] index, int prevLength, String[] comps) throws Exception;
	
	public abstract int indexStandard(String segmentType);
	
	public String setVersion = "";
	protected boolean seekOriginalVersion = true;
	public String originalVersion = "";
	public String encodeVersion = "";
	public String type = "";

	public String getType(){
		return type;
	}
	public void setVersion(String setVersion){
	}
	public void originalVersion(String originalVersion){
	}
	public Structure[][] getComponents(){
		return null;
	}
	public void decode(String component) throws Exception{
//		throw new Exception("No matching segment version");
	}
	
	public String encode() throws Exception{
//		throw new Exception("No matching segment version");
		return "";
	}
	
	public String encode(Structure[][] subComponents) throws Exception{
//		throw new Exception("No matching segment version");
		return "";
	}
	
	public String makeMessage(Structure[][] components, String version) throws Exception{
//		throw new Exception("No matching segment version");
		return "";
	}
	
	
	public static final String INSURANCE = "INSURANCE";
	public static final String PROCEDURE = "PROCEDURE";
	
	
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
    			list.add(sb.toString());
    			sb.setLength(0);
    		}else{
    			sb.append(ch);
    		}
    	}
    	list.add(sb.toString());
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
