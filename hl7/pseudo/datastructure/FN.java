package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class FN extends hl7.model.V2_7.datastructure.FN{
	public FN(){
		super();
	}
	
	public static FN CLASS;
	static{
		CLASS = new FN();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
