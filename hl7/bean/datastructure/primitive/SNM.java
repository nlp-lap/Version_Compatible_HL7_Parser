package hl7.bean.datastructure.primitive;

import java.io.Serializable;

import hl7.bean.datastructure.Primitive;

public class SNM extends Primitive implements Serializable{
	private static final long serialVersionUID = 1L;
	public SNM(){
		description = "String of Telephone Number Digits";
		type = SNM;
	}
	public SNM(String value){
		this();
		setValue(value);
	}
	
	public SNM cloneClass(String originalVersion, String setVersion){
		return new SNM();
	}
	
	public static SNM CLASS;
	static{
		CLASS = new SNM();
	}
	
	public String getType(){
		return type;
	}

}
