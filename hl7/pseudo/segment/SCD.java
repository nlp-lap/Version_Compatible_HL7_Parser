package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class SCD extends hl7.model.V2_7.segment.SCD{
	public SCD(){
		super();
	}

	public static SCD CLASS;
	static{
		CLASS = new SCD();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

