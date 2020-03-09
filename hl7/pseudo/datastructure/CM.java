package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class CM extends hl7.model.V2_3.datastructure.CM{
	public CM(){
		super();
	}
	
	public static CM CLASS;
	static{
		CLASS = new CM();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
