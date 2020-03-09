package hl7.pseudo.message;

import hl7.bean.Structure;

public class QRY_PCK extends hl7.model.V2_31.message.QRY_PCK{
	public QRY_PCK(){
		super();
	}

	public static QRY_PCK CLASS;
	static{
		CLASS = new QRY_PCK();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

