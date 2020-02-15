
package com.demo.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.demo.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SaveEmpResponse_QNAME = new QName("http://ws.demo.com/", "saveEmpResponse");
    private final static QName _GetEmpDetailsResponse_QNAME = new QName("http://ws.demo.com/", "getEmpDetailsResponse");
    private final static QName _SaveEmp_QNAME = new QName("http://ws.demo.com/", "saveEmp");
    private final static QName _GetEmpList_QNAME = new QName("http://ws.demo.com/", "getEmpList");
    private final static QName _GetEmpListResponse_QNAME = new QName("http://ws.demo.com/", "getEmpListResponse");
    private final static QName _GetEmpDetails_QNAME = new QName("http://ws.demo.com/", "getEmpDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.demo.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmpList }
     * 
     */
    public GetEmpList createGetEmpList() {
        return new GetEmpList();
    }

    /**
     * Create an instance of {@link GetEmpListResponse }
     * 
     */
    public GetEmpListResponse createGetEmpListResponse() {
        return new GetEmpListResponse();
    }

    /**
     * Create an instance of {@link GetEmpDetails }
     * 
     */
    public GetEmpDetails createGetEmpDetails() {
        return new GetEmpDetails();
    }

    /**
     * Create an instance of {@link SaveEmp }
     * 
     */
    public SaveEmp createSaveEmp() {
        return new SaveEmp();
    }

    /**
     * Create an instance of {@link SaveEmpResponse }
     * 
     */
    public SaveEmpResponse createSaveEmpResponse() {
        return new SaveEmpResponse();
    }

    /**
     * Create an instance of {@link GetEmpDetailsResponse }
     * 
     */
    public GetEmpDetailsResponse createGetEmpDetailsResponse() {
        return new GetEmpDetailsResponse();
    }

    /**
     * Create an instance of {@link Emp }
     * 
     */
    public Emp createEmp() {
        return new Emp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveEmpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demo.com/", name = "saveEmpResponse")
    public JAXBElement<SaveEmpResponse> createSaveEmpResponse(SaveEmpResponse value) {
        return new JAXBElement<SaveEmpResponse>(_SaveEmpResponse_QNAME, SaveEmpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demo.com/", name = "getEmpDetailsResponse")
    public JAXBElement<GetEmpDetailsResponse> createGetEmpDetailsResponse(GetEmpDetailsResponse value) {
        return new JAXBElement<GetEmpDetailsResponse>(_GetEmpDetailsResponse_QNAME, GetEmpDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveEmp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demo.com/", name = "saveEmp")
    public JAXBElement<SaveEmp> createSaveEmp(SaveEmp value) {
        return new JAXBElement<SaveEmp>(_SaveEmp_QNAME, SaveEmp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demo.com/", name = "getEmpList")
    public JAXBElement<GetEmpList> createGetEmpList(GetEmpList value) {
        return new JAXBElement<GetEmpList>(_GetEmpList_QNAME, GetEmpList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demo.com/", name = "getEmpListResponse")
    public JAXBElement<GetEmpListResponse> createGetEmpListResponse(GetEmpListResponse value) {
        return new JAXBElement<GetEmpListResponse>(_GetEmpListResponse_QNAME, GetEmpListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demo.com/", name = "getEmpDetails")
    public JAXBElement<GetEmpDetails> createGetEmpDetails(GetEmpDetails value) {
        return new JAXBElement<GetEmpDetails>(_GetEmpDetails_QNAME, GetEmpDetails.class, null, value);
    }

}
