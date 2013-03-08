package grails.cxf.test

/**
 */
class TaxrateService {

    CalculationResponse getTaxrate(CalculationRequest calculationRequest){
        new CalculationResponse(rate: calculationRequest.lineItems*.rate.sum() / calculationRequest.lineItems.size())
    }
}
