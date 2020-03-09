package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class DTN extends hl7.model.V2_7.datastructure.DTN{
	public DTN(){
		super();
	}
	
	public static DTN CLASS;
	static{
		CLASS = new DTN();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
