package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class CNS extends hl7.model.V2_31.datastructure.CNS{
	public CNS(){
		super();
	}
	
	public static CNS CLASS;
	static{
		CLASS = new CNS();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
