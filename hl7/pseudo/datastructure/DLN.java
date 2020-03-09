package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class DLN extends hl7.model.V2_7.datastructure.DLN{
	public DLN(){
		super();
	}
	
	public static DLN CLASS;
	static{
		CLASS = new DLN();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
