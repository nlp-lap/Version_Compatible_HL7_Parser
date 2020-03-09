package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class CNS extends hl7.model.V2_7.segment.CNS{
	public CNS(){
		super();
	}

	public static CNS CLASS;
	static{
		CLASS = new CNS();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

