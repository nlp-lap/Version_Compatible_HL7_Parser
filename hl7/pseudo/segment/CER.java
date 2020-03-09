package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class CER extends hl7.model.V2_7.segment.CER{
	public CER(){
		super();
	}

	public static CER CLASS;
	static{
		CLASS = new CER();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

