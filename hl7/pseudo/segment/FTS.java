package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class FTS extends hl7.model.V2_7.segment.FTS{
	public FTS(){
		super();
	}

	public static FTS CLASS;
	static{
		CLASS = new FTS();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

