package hl7.pseudo.message;

import hl7.bean.Structure;

public class PPP_PCD extends hl7.model.V2_3.message.PPP_PCD{
	public PPP_PCD(){
		super();
	}

	public static PPP_PCD CLASS;
	static{
		CLASS = new PPP_PCD();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

