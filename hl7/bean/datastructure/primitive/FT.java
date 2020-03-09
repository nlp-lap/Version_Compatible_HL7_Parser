package hl7.bean.datastructure.primitive;

import java.io.Serializable;

import hl7.bean.datastructure.Primitive;

public class FT extends Primitive  implements Serializable{
	private static final long serialVersionUID = 1L;
	public FT(){
		description = "Formatted Text Data";
		type = FT;
	}
	public FT(String value){
		this();
		setValue(value);
	}
	
	public FT cloneClass(String originalVersion, String setVersion){
		return new FT();
	}
	
	public static FT CLASS;
	static{
		CLASS = new FT();
	}
	public String getType(){
		return type;
	}

}
