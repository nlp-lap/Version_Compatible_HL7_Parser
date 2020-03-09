package hl7.pseudo.message;

import hl7.bean.Structure;

public class PPP_PCC extends hl7.model.V2_3.message.PPP_PCC{
	public PPP_PCC(){
		super();
	}

	public static PPP_PCC CLASS;
	static{
		CLASS = new PPP_PCC();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

