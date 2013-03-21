package grails.com.oursite.webservice

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.NONE)
class TaxCalculationTaxLocation {
	@XmlElement
	String addressLine1
	@XmlElement
	String addressLine2
	@XmlElement
	String country
	@XmlElement
	String city
	@XmlElement
	String county
	@XmlElement
	String stateOrProvince
	@XmlElement
	String postalCode
	
	// Hide from WSDL
//	@XmlTransient 
	static belongsTo = [TaxCalculationRequest]
	TaxCalculationRequest taxCalcReq
	 
    static constraints = {
		addressLine1(blank:true, nullable:true)
		addressLine2(blank:true, nullable:true)
		country(blank:true, nullable:true)
		city(blank:true, nullable:true)
		county(blank:true, nullable:true)
		stateOrProvince(blank:true, nullable:true)
		postalCode(size:0..10)
    }
}
