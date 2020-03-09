package hl7.pseudo.message;

import hl7.bean.Structure;

public class PMU_B01 extends hl7.model.V2_7.message.PMU_B01{
	public PMU_B01(){
		super();
	}

	public static PMU_B01 CLASS;
	static{
		CLASS = new PMU_B01();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

