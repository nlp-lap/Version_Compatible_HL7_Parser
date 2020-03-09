package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class AIL extends hl7.model.V2_7.segment.AIL{
	public AIL(){
		super();
	}

	public static AIL CLASS;
	static{
		CLASS = new AIL();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

