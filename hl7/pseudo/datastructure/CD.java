package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class CD extends hl7.model.V2_7.datastructure.CD{
	public CD(){
		super();
	}
	
	public static CD CLASS;
	static{
		CLASS = new CD();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
