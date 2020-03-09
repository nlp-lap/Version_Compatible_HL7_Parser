package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class CK extends hl7.model.V2_4.datastructure.CK{
	public CK(){
		super();
	}
	
	public static CK CLASS;
	static{
		CLASS = new CK();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
