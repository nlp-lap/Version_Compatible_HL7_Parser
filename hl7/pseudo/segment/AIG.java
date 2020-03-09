package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class AIG extends hl7.model.V2_7.segment.AIG{
	public AIG(){
		super();
	}

	public static AIG CLASS;
	static{
		CLASS = new AIG();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

