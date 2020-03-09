package hl7.pseudo.message;

import hl7.bean.Structure;

public class PPG_PCG extends hl7.model.V2_7.message.PPG_PCG{
	public PPG_PCG(){
		super();
	}

	public static PPG_PCG CLASS;
	static{
		CLASS = new PPG_PCG();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

