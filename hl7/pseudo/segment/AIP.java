package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class AIP extends hl7.model.V2_7.segment.AIP{
	public AIP(){
		super();
	}

	public static AIP CLASS;
	static{
		CLASS = new AIP();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

