package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ERQ extends hl7.model.V2_51.segment.ERQ{
	public ERQ(){
		super();
	}

	public static ERQ CLASS;
	static{
		CLASS = new ERQ();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

