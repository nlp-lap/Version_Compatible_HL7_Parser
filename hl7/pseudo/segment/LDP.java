package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class LDP extends hl7.model.V2_7.segment.LDP{
	public LDP(){
		super();
	}

	public static LDP CLASS;
	static{
		CLASS = new LDP();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

