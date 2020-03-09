package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class CX extends hl7.model.V2_7.datastructure.CX{
	public CX(){
		super();
	}
	
	public static CX CLASS;
	static{
		CLASS = new CX();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
