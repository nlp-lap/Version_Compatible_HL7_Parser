package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PAC extends hl7.model.V2_7.segment.PAC{
	public PAC(){
		super();
	}

	public static PAC CLASS;
	static{
		CLASS = new PAC();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

