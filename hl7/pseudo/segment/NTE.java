package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class NTE extends hl7.model.V2_7.segment.NTE{
	public NTE(){
		super();
	}

	public static NTE CLASS;
	static{
		CLASS = new NTE();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

