
package com.demo.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EmpServiceImplService", targetNamespace = "http://ws.demo.com/", wsdlLocation = "http://localhost:8182/WS/empservice?wsdl")
public class EmpServiceImplService
    extends Service
{

    private final static URL EMPSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException EMPSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName EMPSERVICEIMPLSERVICE_QNAME = new QName("http://ws.demo.com/", "EmpServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8182/WS/empservice?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMPSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        EMPSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public EmpServiceImplService() {
        super(__getWsdlLocation(), EMPSERVICEIMPLSERVICE_QNAME);
    }

    public EmpServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMPSERVICEIMPLSERVICE_QNAME, features);
    }

    public EmpServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, EMPSERVICEIMPLSERVICE_QNAME);
    }

    public EmpServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMPSERVICEIMPLSERVICE_QNAME, features);
    }

    public EmpServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmpServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EmpService
     */
    @WebEndpoint(name = "EmpServiceImplPort")
    public EmpService getEmpServiceImplPort() {
        return super.getPort(new QName("http://ws.demo.com/", "EmpServiceImplPort"), EmpService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmpService
     */
    @WebEndpoint(name = "EmpServiceImplPort")
    public EmpService getEmpServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.demo.com/", "EmpServiceImplPort"), EmpService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMPSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw EMPSERVICEIMPLSERVICE_EXCEPTION;
        }
        return EMPSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
