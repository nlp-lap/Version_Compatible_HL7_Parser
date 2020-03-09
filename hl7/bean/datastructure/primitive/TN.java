package hl7.bean.datastructure.primitive;

import java.io.Serializable;

import hl7.bean.datastructure.Primitive;

public class TN extends Primitive implements Serializable{
	private static final long serialVersionUID = 1L;
	public TN(){
		description = "Telephone Number";
		type = TN;
	}
	public TN(String value){
		this();
		setValue(value);
	}
	
	public TN cloneClass(String originalVersion, String setVersion){
		return new TN();
	}
	
	public static TN CLASS;
	static{
		CLASS = new TN();
	}
	
	public String getType(){
		return type;
	}

}
