package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class EQP extends hl7.model.V2_7.segment.EQP{
	public EQP(){
		super();
	}

	public static EQP CLASS;
	static{
		CLASS = new EQP();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

