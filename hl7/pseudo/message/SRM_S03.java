package hl7.pseudo.message;

import hl7.bean.Structure;

public class SRM_S03 extends hl7.model.V2_3.message.SRM_S03{
	public SRM_S03(){
		super();
	}

	public static SRM_S03 CLASS;
	static{
		CLASS = new SRM_S03();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

