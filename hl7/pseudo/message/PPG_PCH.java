package hl7.pseudo.message;

import hl7.bean.Structure;

public class PPG_PCH extends hl7.model.V2_3.message.PPG_PCH{
	public PPG_PCH(){
		super();
	}

	public static PPG_PCH CLASS;
	static{
		CLASS = new PPG_PCH();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

