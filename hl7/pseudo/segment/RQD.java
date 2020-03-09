package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class RQD extends hl7.model.V2_7.segment.RQD{
	public RQD(){
		super();
	}

	public static RQD CLASS;
	static{
		CLASS = new RQD();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

