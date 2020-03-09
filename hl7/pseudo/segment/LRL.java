package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class LRL extends hl7.model.V2_7.segment.LRL{
	public LRL(){
		super();
	}

	public static LRL CLASS;
	static{
		CLASS = new LRL();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

