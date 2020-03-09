package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class TCD extends hl7.model.V2_7.segment.TCD{
	public TCD(){
		super();
	}

	public static TCD CLASS;
	static{
		CLASS = new TCD();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

