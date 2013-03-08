package grails.cxf.test

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlElementWrapper

@XmlAccessorType(XmlAccessType.NONE)
class CalculationRequest {

    @XmlElement
    String uuid = new UUID(1,2).toString()

    @XmlElementWrapper(name="lineItems")
    @XmlElement(name="lineItem")
    List<CalculationRequestLineItem> lineItems


    static hasMany = [lineItems:CalculationRequestLineItem]

    static constraints = {
        //Attributes
        uuid(blank:false)
        //Elements
        lineItems(minSize:0, nullable:true)
    }

    static mapping = {
        lineItems lazy:false
    }
}