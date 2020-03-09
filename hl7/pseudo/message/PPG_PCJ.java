package hl7.pseudo.message;

import hl7.bean.Structure;

public class PPG_PCJ extends hl7.model.V2_3.message.PPG_PCJ{
	public PPG_PCJ(){
		super();
	}

	public static PPG_PCJ CLASS;
	static{
		CLASS = new PPG_PCJ();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

