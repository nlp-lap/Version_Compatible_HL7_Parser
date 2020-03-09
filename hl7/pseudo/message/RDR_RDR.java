package hl7.pseudo.message;

import hl7.bean.Structure;

public class RDR_RDR extends hl7.model.V2_7.message.RDR_RDR{
	public RDR_RDR(){
		super();
	}

	public static RDR_RDR CLASS;
	static{
		CLASS = new RDR_RDR();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

