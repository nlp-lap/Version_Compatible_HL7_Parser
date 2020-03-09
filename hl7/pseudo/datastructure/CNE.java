package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class CNE extends hl7.model.V2_7.datastructure.CNE{
	public CNE(){
		super();
	}
	
	public static CNE CLASS;
	static{
		CLASS = new CNE();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
