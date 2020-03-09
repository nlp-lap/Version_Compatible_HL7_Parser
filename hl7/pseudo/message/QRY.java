package hl7.pseudo.message;

import hl7.bean.Structure;

public class QRY extends hl7.model.V2_51.message.QRY{
	public QRY(){
		super();
	}

	public static QRY CLASS;
	static{
		CLASS = new QRY();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

