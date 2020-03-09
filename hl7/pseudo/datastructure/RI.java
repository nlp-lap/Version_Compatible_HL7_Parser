package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class RI extends hl7.model.V2_7.datastructure.RI{
	public RI(){
		super();
	}
	
	public static RI CLASS;
	static{
		CLASS = new RI();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
