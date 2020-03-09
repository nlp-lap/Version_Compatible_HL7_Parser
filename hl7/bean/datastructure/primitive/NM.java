package hl7.bean.datastructure.primitive;

import java.io.Serializable;

import hl7.bean.datastructure.Primitive;

public class NM extends Primitive implements Serializable{
	private static final long serialVersionUID = 1L;
	public NM(){
		description = "Numeric";
		type = NM;
	}
	public NM(String value){
		this();
		setValue(value);
	}
	
	public NM cloneClass(String originalVersion, String setVersion){
		return new NM();
	}
	
	public static NM CLASS;
	static{
		CLASS = new NM();
	}
	public String getType(){
		return type;
	}

}
