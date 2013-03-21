package grails.com.oursite.webservice

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement


@XmlAccessorType(XmlAccessType.NONE)
class TaxCalculationResponseLineItem {

	@XmlElement
	String type
	@XmlElement
	String productId
	@XmlElement
	String description
	@XmlElement
	Integer quantity
	@XmlElement
	String amount
	@XmlElement
	String extendedAmount
	
	// Hide from WSDL
//	@XmlTransient 
	TaxCalculationResponse taxCalculationResponse
	static belongsTo = [TaxCalculationResponse]
		
	static constraints = {
		productId(blank:true, nullable:true)
		description(blank:true, nullable:true)
		quantity(min:0, nullable:true)
		amount(blank:false, nullable:false)
		extendedAmount(blank:false, nullable:false)
	}
}
