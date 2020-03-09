package hl7.bean.datastructure.primitive;

import java.io.Serializable;

import hl7.bean.datastructure.Primitive;

public class GTS extends Primitive  implements Serializable{
	private static final long serialVersionUID = 1L;
	public GTS(){
		description = "General Timing Specification";
		type = GTS;
	}
	public GTS(String value){
		this();
		setValue(value);
	}
	
	public GTS cloneClass(String originalVersion, String setVersion){
		return new GTS();
	}
	
	public static GTS CLASS;
	static{
		CLASS = new GTS();
	}
	public String getType(){
		return type;
	}

}
