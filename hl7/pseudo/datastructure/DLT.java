package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class DLT extends hl7.model.V2_7.datastructure.DLT{
	public DLT(){
		super();
	}
	
	public static DLT CLASS;
	static{
		CLASS = new DLT();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
