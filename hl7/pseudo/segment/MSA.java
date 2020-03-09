package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class MSA extends hl7.model.V2_7.segment.MSA{
	public MSA(){
		super();
	}

	public static MSA CLASS;
	static{
		CLASS = new MSA();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

