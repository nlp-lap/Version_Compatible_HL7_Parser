package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ARQ extends hl7.model.V2_7.segment.ARQ{
	public ARQ(){
		super();
	}

	public static ARQ CLASS;
	static{
		CLASS = new ARQ();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

