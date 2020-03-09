package hl7.pseudo.message;

import hl7.bean.Structure;

public class RPI_I01 extends hl7.model.V2_7.message.RPI_I01{
	public RPI_I01(){
		super();
	}

	public static RPI_I01 CLASS;
	static{
		CLASS = new RPI_I01();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

