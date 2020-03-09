package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class TCC extends hl7.model.V2_7.segment.TCC{
	public TCC(){
		super();
	}

	public static TCC CLASS;
	static{
		CLASS = new TCC();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

