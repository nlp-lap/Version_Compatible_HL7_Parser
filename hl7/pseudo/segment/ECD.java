package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ECD extends hl7.model.V2_7.segment.ECD{
	public ECD(){
		super();
	}

	public static ECD CLASS;
	static{
		CLASS = new ECD();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

