
package com.microsoft.bingads.v13.customermanagement;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "CustomerManagementService", targetNamespace = "https://bingads.microsoft.com/Customer/v13", wsdlLocation = "https://clientcenter.api.sandbox.bingads.microsoft.com/Api/CustomerManagement/v13/CustomerManagementService.svc?wsdl")
public class CustomerManagementService
    extends Service
{

    private static final URL CUSTOMERMANAGEMENTSERVICE_WSDL_LOCATION;
    private static final WebServiceException CUSTOMERMANAGEMENTSERVICE_EXCEPTION;
    private static final QName CUSTOMERMANAGEMENTSERVICE_QNAME = new QName("https://bingads.microsoft.com/Customer/v13", "CustomerManagementService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://clientcenter.api.sandbox.bingads.microsoft.com/Api/CustomerManagement/v13/CustomerManagementService.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUSTOMERMANAGEMENTSERVICE_WSDL_LOCATION = url;
        CUSTOMERMANAGEMENTSERVICE_EXCEPTION = e;
    }

    public CustomerManagementService() {
        super(__getWsdlLocation(), CUSTOMERMANAGEMENTSERVICE_QNAME);
    }

    public CustomerManagementService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CUSTOMERMANAGEMENTSERVICE_QNAME, features);
    }

    public CustomerManagementService(URL wsdlLocation) {
        super(wsdlLocation, CUSTOMERMANAGEMENTSERVICE_QNAME);
    }

    public CustomerManagementService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CUSTOMERMANAGEMENTSERVICE_QNAME, features);
    }

    public CustomerManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerManagementService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ICustomerManagementService
     */
    @WebEndpoint(name = "BasicHttpBinding_ICustomerManagementService")
    public ICustomerManagementService getBasicHttpBindingICustomerManagementService() {
        return super.getPort(new QName("https://bingads.microsoft.com/Customer/v13", "BasicHttpBinding_ICustomerManagementService"), ICustomerManagementService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICustomerManagementService
     */
    @WebEndpoint(name = "BasicHttpBinding_ICustomerManagementService")
    public ICustomerManagementService getBasicHttpBindingICustomerManagementService(WebServiceFeature... features) {
        return super.getPort(new QName("https://bingads.microsoft.com/Customer/v13", "BasicHttpBinding_ICustomerManagementService"), ICustomerManagementService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUSTOMERMANAGEMENTSERVICE_EXCEPTION!= null) {
            throw CUSTOMERMANAGEMENTSERVICE_EXCEPTION;
        }
        return CUSTOMERMANAGEMENTSERVICE_WSDL_LOCATION;
    }

}
