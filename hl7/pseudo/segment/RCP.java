package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class RCP extends hl7.model.V2_7.segment.RCP{
	public RCP(){
		super();
	}

	public static RCP CLASS;
	static{
		CLASS = new RCP();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

