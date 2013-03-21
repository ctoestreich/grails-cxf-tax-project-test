package grails.com.oursite.webservice

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement

@XmlAccessorType(XmlAccessType.NONE)
class TaxCalculationResponse {

	@XmlElement
	String uuid
	@XmlElement
	String originSystem
	@XmlElement
	String originApplication
	@XmlElement
	Date version
	@XmlElement
	String returnCode
	@XmlElement
	String totalSalesTax
	@XmlElement
	String combinedTaxRate
	@XmlElement
	String stateTaxAmt
	@XmlElement
	String countyTaxAmt
	@XmlElement
	String cityTaxAmt
	@XmlElement
	String localTaxAmt
	@XmlElement
	String geoCodeIndicator
	@XmlElement
	String transactionType
	@XmlElement
	String transactionCode
	@XmlElement
	Date transactionDate
	@XmlElement
	String stateTaxInclusionFlag
	@XmlElement
	String stateTaxRate
	@XmlElement
	String stateRateInd
	@XmlElement
	Double stateTaxType
	@XmlElement
	String countyTaxRate
	@XmlElement
	String countyRateInd
	@XmlElement
	String countyTaxType
	@XmlElement
	String cityTaxRate
	@XmlElement
	String cityRateInd
	@XmlElement
	String cityTaxType
	@XmlElement
	String localTaxRate
	@XmlElement
	String localRateInd
	@XmlElement
	String localTaxType
	@XmlElement
	String countyTransitRate
	@XmlElement
	String countyTransitTax
	@XmlElement
	String cityTransitRate
	@XmlElement
	String cityTransitTax
	@XmlElement
	String currency
	@XmlElement
	String stateOrProvince
	@XmlElement
	String county
	@XmlElement
	String countyLocalRate
	@XmlElement
	String city
	@XmlElement
	String cityLocalRate
	@XmlElement
	String country
	@XmlElement
	String processedMillis
	@XmlElement
	Date processedDate
	
//	@XmlElementWrapper(name="exceptions")
//	@XmlElement(name="exception")
	@XmlElement
	List<TaxCalculationResponseError> exceptions
	
//	@XmlElementWrapper(name="lineItems")
//	@XmlElement(name="lineItem")
	@XmlElement
	List<TaxCalculationResponseLineItem> lineItems
	
	static hasMany = [lineItems:TaxCalculationResponseLineItem, exceptions:TaxCalculationResponseError]
	
    static constraints = {
		//Attributes
		uuid(blank:false, nullable:false)
		originSystem(blank:false, nullable:false)
		originApplication(blank:false, nullable:false)
		version(blank:false,nullable:false)
		
		//Elements
		returnCode(blank:false, nullable:false)
		lineItems(minSize:0, nullable:true)
		stateTaxAmt(blank:false, nullable:false)
		countyTaxAmt(blank:false, nullable:false)
		cityTaxAmt(blank:false, nullable:false)
		localTaxAmt(blank:false, nullable:false)
		geoCodeIndicator(blank:true, nullable:true)
		transactionType(blank:true, nullable:true)
		transactionCode(blank:true, nullable:true)
		transactionDate(blank:false)
		stateTaxInclusionFlag(blank:true, nullable:true)
		stateTaxRate(blank:false, nullable:false)
		stateRateInd(blank:true, nullable:true)
		stateTaxType(blank:true, nullable:true)
		countyTaxRate(blank:false, nullable:false)
		countyRateInd(blank:true, nullable:true)
		countyTaxType(blank:true, nullable:true)
		cityTaxRate(blank:false, nullable:false)
		cityRateInd(blank:true, nullable:true)
		cityTaxType(blank:true, nullable:true)
		localTaxRate(blank:false, nullable:false)
		localRateInd(blank:true, nullable:true)
		localTaxType(blank:true, nullable:true)
		countyTransitRate(blank:false, nullable:false)
		countyTransitTax(blank:false, nullable:false)
		cityTransitRate(blank:false, nullable:false)
		cityTransitTax(blank:false, nullable:false)
		
		currency(blank:true, nullable:true)
		stateOrProvince(blank:true, nullable:true)
		country(blank:true, nullable:true)
		county(blank:true, nullable:true)
		countyLocalRate(blank:false, nullable:false)
		city(blank:true, nullable:true)
		cityLocalRate(blank:false, nullable:false)
		
		exceptions(minSize:0, nullable:true)
		processedMillis(minSize:0, nullable:true)
		processedDate(blank:false)
    }
}
