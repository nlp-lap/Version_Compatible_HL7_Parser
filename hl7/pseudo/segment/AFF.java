package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class AFF extends hl7.model.V2_7.segment.AFF{
	public AFF(){
		super();
	}

	public static AFF CLASS;
	static{
		CLASS = new AFF();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

