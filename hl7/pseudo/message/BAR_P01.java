package hl7.pseudo.message;

import hl7.bean.Structure;

public class BAR_P01 extends hl7.model.V2_7.message.BAR_P01{
	public BAR_P01(){
		super();
	}

	public static BAR_P01 CLASS;
	static{
		CLASS = new BAR_P01();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

