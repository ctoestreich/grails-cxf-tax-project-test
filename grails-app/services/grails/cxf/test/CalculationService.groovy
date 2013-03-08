package grails.cxf.test

class CalculationService {

    static expose=['cxf']

    def taxrateService

    CalculationResponse getTaxRate(CalculationRequest calculationRequest) {
        taxrateService.getTaxrate(calculationRequest)
    }
}
