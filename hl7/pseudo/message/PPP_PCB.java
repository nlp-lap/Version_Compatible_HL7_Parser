package hl7.pseudo.message;

import hl7.bean.Structure;

public class PPP_PCB extends hl7.model.V2_7.message.PPP_PCB{
	public PPP_PCB(){
		super();
	}

	public static PPP_PCB CLASS;
	static{
		CLASS = new PPP_PCB();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

