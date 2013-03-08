package grails.cxf.test

import org.grails.cxf.utils.GrailsCxfEndpoint
import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebResult

@GrailsCxfEndpoint()
class CalculationNewService {

    def taxrateService

    @WebMethod()
    @WebResult(name='calculationResponse')
    CalculationResponse getTaxRate(@WebParam CalculationRequest calculationRequest) {
        taxrateService.getTaxrate(calculationRequest)
    }
}
