package hl7.bean.datastructure.primitive;

import java.io.Serializable;

import hl7.bean.datastructure.Primitive;


public class ID extends Primitive  implements Serializable{
	private static final long serialVersionUID = 1L;
	public ID(){
		description = "coded value for HL7 defined tables";
		type = ID;
	}
	public ID(String value){
		this();
		setValue(value);
	}
	
	public ID cloneClass(String originalVersion, String setVersion){
		return new ID();
	}
	
	public static ID CLASS;
	static{
		CLASS = new ID();
	}
	public String getType(){
		return type;
	}
}