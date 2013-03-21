package grails.com.oursite.webservice

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.NONE)
class TaxCalculationResponseError {

	@XmlElement
	String code
	@XmlElement
	String data
	@XmlElement
	String severity
	@XmlElement
	String location
	
	// Hide from WSDL
//	@XmlTransient 
	TaxCalculationResponse taxCalculationResponse
	static belongsTo = [TaxCalculationResponse]
	
    static constraints = {
		code(blank:true, nullable:true)
		data(blank:true, nullable:true)
		severity(blank:true, nullable:true)
		location(blank:true, nullable:true)
    }
	
}
