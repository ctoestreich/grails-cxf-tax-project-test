package grails.com.oursite.webservice

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement

@XmlAccessorType(XmlAccessType.NONE)
class TaxCalculationRequest {

    @XmlElement
    String uuid
    @XmlElement
    String originSystem
    @XmlElement
    String originApplication
    @XmlElement
    Date version
    @XmlElement
    String writeTaxRegistry
    @XmlElement
    Date transactionDate
    @XmlElement
    String transactionType
    @XmlElement
    Double taxableAmount
    @XmlElement
    String customerExempt
    @XmlElement
    String orderNumber
    @XmlElement
    TaxCalculationTaxLocation taxLocation
    @XmlElement
    Double quantity
    @XmlElement
    Double extendedPrice
    @XmlElement
    Double freightAmt
    @XmlElement
    String processedMillis

//	@XmlElementWrapper(name="lineItems")
//    @XmlElement(name="lineItem")
    @XmlElement
    List<TaxCalculationRequestLineItem> lineItems
    static hasMany = [lineItems: TaxCalculationRequestLineItem]


    static constraints = {
        //Attributes
        uuid(blank: false)
        originSystem(blank: false)
        originApplication(blank: false)
        version(blank: false)

        //Elements
        writeTaxRegistry(blank: false)
        transactionDate(blank: false)
        transactionType(blank: false)
        taxableAmount(blank: false)
        customerExempt(blank: false)
        orderNumber(minSize: 0, nullable: true)
        taxLocation(blank: false)
        quantity(minSize: 0, nullable: true)
        extendedPrice(minSize: 0, nullable: true)
        freightAmt(minSize: 0, nullable: true)
        lineItems(minSize: 0, nullable: true)
        processedMillis(minSize: 0, nullable: true)
    }

    static mapping = {
        taxLocation lazy: false
        lineItems lazy: false
    }

}
