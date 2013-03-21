package org.grails.cxf.test

import geb.spock.GebReportingSpec
import wslite.soap.SOAPClient
import wslite.soap.SOAPResponse
import wslite.soap.SOAPVersion

class AnnotatedTaxCalculationServiceSpec extends GebReportingSpec {

    SOAPClient client = new SOAPClient("http://localhost:${System.getProperty("server.port", "8080")}/grails-cxf-test/services/taxcalc")

    def "invoke get taxcalc method"() {
        when:
        SOAPResponse response = client.send(SOAPVersion.V1_1,
                                            connectTimeout:7000,
                                            readTimeout:9000,
                                            """<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:soap="http://soap.oursite.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <soap:calculateTax>
         <taxCalcReq>
            <uuid>UUID</uuid>
            <originSystem>${origin}</originSystem>
            <originApplication>MINNEAPOLIS</originApplication>
            <version>2013-03-21T00:00:00.000-05:00</version>
            <writeTaxRegistry>Y</writeTaxRegistry>
            <transactionDate>2013-03-21T00:00:00.000-05:00</transactionDate>
            <transactionType>A</transactionType>
            <taxableAmount>12.00</taxableAmount>
            <customerExempt>I LOVE TURTLES</customerExempt>
            <orderNumber>1234</orderNumber>
            <taxLocation>
               <addressLine1>1234 Here St</addressLine1>
               <country>US</country>
               <city>Minneapolis</city>
               <county>Hennepin</county>
               <stateOrProvince>MN</stateOrProvince>
               <postalCode>55401</postalCode>
            </taxLocation>
            <quantity>1.00</quantity>
            <extendedPrice>12.00</extendedPrice>
            <freightAmt>1.00</freightAmt>
            <processedMillis>1</processedMillis>
            <lineItems>
               <type>1</type>
               <productId>2</productId>
               <description>3</description>
               <quantity>4</quantity>
               <amount>5.00</amount>
               <extendedAmount>6.00</extendedAmount>
            </lineItems>
         </taxCalcReq>
      </soap:calculateTax>
   </soapenv:Body>
</soapenv:Envelope>""")

        def methodResponse = response.body.calculateTaxResponse.taxCalculationResponse

        then:
        response.httpResponse.statusCode == 200
        response.soapVersion == SOAPVersion.V1_1
        "7" == methodResponse.cityTaxRate.text()
        origin == methodResponse.city.text()

        where:
        origin << ["ORIGIN","TEST","DATA"]
    }
}
