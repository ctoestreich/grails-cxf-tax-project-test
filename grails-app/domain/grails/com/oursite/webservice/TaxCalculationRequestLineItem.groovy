package grails.com.oursite.webservice

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.NONE)
class TaxCalculationRequestLineItem {

	@XmlElement
	String type
	@XmlElement
	String productId
	@XmlElement
	String description
	@XmlElement
	Integer quantity
	@XmlElement
	Double amount
	@XmlElement
	Double extendedAmount
	
	// Hide from WSDL
	static belongsTo = [TaxCalculationRequest]
	TaxCalculationRequest taxCalculationRequest
		
    static constraints = {
		productId(blank:true, nullable:true)
		description(blank:true, nullable:true)
		quantity(min:0, nullable:true)
		amount(min:0.0d, nullable:true)
		extendedAmount(min:0.0d, nullable:true)
    }
	
}
