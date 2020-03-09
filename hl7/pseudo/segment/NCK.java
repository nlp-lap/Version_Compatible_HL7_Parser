package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class NCK extends hl7.model.V2_7.segment.NCK{
	public NCK(){
		super();
	}

	public static NCK CLASS;
	static{
		CLASS = new NCK();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

