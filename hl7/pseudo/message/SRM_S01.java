package hl7.pseudo.message;

import hl7.bean.Structure;

public class SRM_S01 extends hl7.model.V2_7.message.SRM_S01{
	public SRM_S01(){
		super();
	}

	public static SRM_S01 CLASS;
	static{
		CLASS = new SRM_S01();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

