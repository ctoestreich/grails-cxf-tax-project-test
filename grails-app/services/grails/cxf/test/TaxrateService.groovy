package grails.cxf.test

import grails.com.oursite.webservice.TaxCalculationResponse
import grails.com.oursite.webservice.TaxCalculationRequest

/**
 */
class TaxrateService {

    CalculationResponse getTaxrate(CalculationRequest calculationRequest){
        new CalculationResponse(rate: calculationRequest.lineItems*.rate.sum() / calculationRequest.lineItems.size())
    }

    TaxCalculationResponse processTaxRequest(TaxCalculationRequest taxCalculationRequest){
        new TaxCalculationResponse(city: taxCalculationRequest.originSystem, cityTaxRate: '7')
    }
}
