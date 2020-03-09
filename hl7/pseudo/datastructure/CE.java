package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class CE extends hl7.model.V2_6.datastructure.CE{
	public CE(){
		super();
	}
	
	public static CE CLASS;
	static{
		CLASS = new CE();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
