package grails.cxf.test

import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlElement

/**
 */

@XmlAccessorType(XmlAccessType.NONE)
class CalculationResponse {
    @XmlElement
    Integer rate = 0
}

