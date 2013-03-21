package com.oursite.soap

import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebResult

import org.grails.cxf.utils.GrailsCxfEndpoint

import grails.com.oursite.webservice.TaxCalculationRequest
import grails.com.oursite.webservice.TaxCalculationResponse

@GrailsCxfEndpoint()
class TaxcalcService {

	def taxrateService
	
	@WebMethod()
	@WebResult(name='taxCalculationResponse')
    TaxCalculationResponse calculateTax(@WebParam(name='taxCalcReq') TaxCalculationRequest taxCalcReq) {

        taxrateService.processTaxRequest(taxCalcReq)
    }

    /*
    Test XML

    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:soap="http://soap.oursite.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <soap:calculateTax>
         <taxCalcReq>
            <uuid>UUID</uuid>
            <originSystem>ORIGIN</originSystem>
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
</soapenv:Envelope>
     */

    /*
    Expected Response

    <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns2:calculateTaxResponse xmlns:ns2="http://soap.oursite.com/">
         <taxCalculationResponse>
            <cityTaxRate>7</cityTaxRate>
            <city>ORIGIN</city>
         </taxCalculationResponse>
      </ns2:calculateTaxResponse>
   </soap:Body>
</soap:Envelope>
     */
}
