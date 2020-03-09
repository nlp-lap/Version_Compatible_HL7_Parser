package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class LCC extends hl7.model.V2_7.segment.LCC{
	public LCC(){
		super();
	}

	public static LCC CLASS;
	static{
		CLASS = new LCC();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

