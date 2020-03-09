package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class MFA extends hl7.model.V2_7.segment.MFA{
	public MFA(){
		super();
	}

	public static MFA CLASS;
	static{
		CLASS = new MFA();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

