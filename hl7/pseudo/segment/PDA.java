package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PDA extends hl7.model.V2_7.segment.PDA{
	public PDA(){
		super();
	}

	public static PDA CLASS;
	static{
		CLASS = new PDA();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

