package hl7.pseudo.message;

import hl7.bean.Structure;

public class ORU_R01 extends hl7.model.V2_7.message.ORU_R01{
	public ORU_R01(){
		super();
	}

	public static ORU_R01 CLASS;
	static{
		CLASS = new ORU_R01();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

