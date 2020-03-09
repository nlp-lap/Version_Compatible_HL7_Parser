package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PRB extends hl7.model.V2_7.segment.PRB{
	public PRB(){
		super();
	}

	public static PRB CLASS;
	static{
		CLASS = new PRB();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

