package hl7.bean.datastructure;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Composite extends DataStructure implements Serializable{
	private static final long serialVersionUID = 1L;
	protected String originalComponent;
	public void decode(String component) throws Exception{
		originalComponent = component;
//		throw new Exception("No matching composite version");
	}
	
	public String encode() throws Exception{
//		throw new Exception("No matching composite version");
		originalComponent="";
		return originalComponent;
	}
	
	public String encode(DataStructure[] subComponents) throws Exception{
//		throw new Exception("No matching composite version");
		originalComponent="";
		return originalComponent;
	}
	
	public String makeMessage(DataStructure[] components, String version) throws Exception{
//		throw new Exception("No matching composite version");
		originalComponent="";
		return originalComponent;
	}
	
	public String getType(){
		return type;
	}
	
	protected String[] divide(String message, char delimiter){
		if(message==null) return null;
		ArrayList<String> list = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
    	for(int i=0; i<message.length(); i++){
    		char ch = message.charAt(i); 
    		if(ch==delimiter){
    			list.add(sb.toString());
    			sb.setLength(0);
    		}else{
    			sb.append(ch);
    		}
    	}
    	if(sb.length()>0) list.add(sb.toString());
    	return (list.size()>0)?list.toArray(new String[0]):null;
	}
}
