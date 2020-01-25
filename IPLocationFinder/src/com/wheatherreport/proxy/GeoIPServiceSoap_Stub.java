// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.wheatherreport.proxy;

import com.sun.xml.rpc.server.http.MessageContextProperties;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.encoding.literal.*;
import com.sun.xml.rpc.soap.streaming.*;
import com.sun.xml.rpc.soap.message.*;
import com.sun.xml.rpc.soap.SOAPVersion;
import com.sun.xml.rpc.soap.SOAPEncodingConstants;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.lang.reflect.*;
import java.lang.Class;
import com.sun.xml.rpc.client.SenderException;
import com.sun.xml.rpc.client.*;
import com.sun.xml.rpc.client.http.*;
import javax.xml.rpc.handler.*;
import javax.xml.rpc.JAXRPCException;
import javax.xml.rpc.soap.SOAPFaultException;

public class GeoIPServiceSoap_Stub
    extends com.sun.xml.rpc.client.StubBase
    implements com.wheatherreport.proxy.GeoIPServiceSoap {
    
    
    
    /*
     *  public constructor
     */
    public GeoIPServiceSoap_Stub(HandlerChain handlerChain) {
        super(handlerChain);
        _setProperty(ENDPOINT_ADDRESS_PROPERTY, "http://www.webservicex.net/geoipservice.asmx");
    }
    
    
    /*
     *  implementation of getGeoIPContext
     */
    public com.wheatherreport.proxy.GeoIP getGeoIPContext()
        throws java.rmi.RemoteException {
        
        try {
            
            StreamingSenderState _state = _start(_handlerChain);
            
            InternalSOAPMessage _request = _state.getRequest();
            _request.setOperationCode(GetGeoIPContext_OPCODE);
            
            com.wheatherreport.proxy.GetGeoIPContext _myGetGeoIPContext = new com.wheatherreport.proxy.GetGeoIPContext();
            
            SOAPBlockInfo _bodyBlock = new SOAPBlockInfo(ns1_GetGeoIPContext_GetGeoIPContext_QNAME);
            _bodyBlock.setValue(_myGetGeoIPContext);
            _bodyBlock.setSerializer(ns1_myGetGeoIPContext_LiteralSerializer);
            _request.setBody(_bodyBlock);
            
            _state.getMessageContext().setProperty(HttpClientTransport.HTTP_SOAPACTION_PROPERTY, "http://www.webservicex.net/GetGeoIPContext");
            
            _send((java.lang.String) _getProperty(ENDPOINT_ADDRESS_PROPERTY), _state);
            
            com.wheatherreport.proxy.GetGeoIPContextResponse _result = null;
            java.lang.Object _responseObj = _state.getResponse().getBody().getValue();
            if (_responseObj instanceof SOAPDeserializationState) {
                _result = (com.wheatherreport.proxy.GetGeoIPContextResponse)((SOAPDeserializationState) _responseObj).getInstance();
            } else {
                _result = (com.wheatherreport.proxy.GetGeoIPContextResponse)_responseObj;
            }
            
            return _result.getGetGeoIPContextResult();
            
        } catch (RemoteException e) {
            // let this one through unchanged
            throw e;
        } catch (JAXRPCException e) {
            throw new RemoteException(e.getMessage(), e);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException)e;
            } else {
                throw new RemoteException(e.getMessage(), e);
            }
        }
    }
    
    /*
     *  implementation of getGeoIP
     */
    public com.wheatherreport.proxy.GeoIP getGeoIP(java.lang.String IPAddress)
        throws java.rmi.RemoteException {
        
        try {
            
            StreamingSenderState _state = _start(_handlerChain);
            
            InternalSOAPMessage _request = _state.getRequest();
            _request.setOperationCode(GetGeoIP_OPCODE);
            
            com.wheatherreport.proxy.GetGeoIP _myGetGeoIP = new com.wheatherreport.proxy.GetGeoIP();
            _myGetGeoIP.setIPAddress(IPAddress);
            
            SOAPBlockInfo _bodyBlock = new SOAPBlockInfo(ns1_GetGeoIP_GetGeoIP_QNAME);
            _bodyBlock.setValue(_myGetGeoIP);
            _bodyBlock.setSerializer(ns1_myGetGeoIP_LiteralSerializer);
            _request.setBody(_bodyBlock);
            
            _state.getMessageContext().setProperty(HttpClientTransport.HTTP_SOAPACTION_PROPERTY, "http://www.webservicex.net/GetGeoIP");
            
            _send((java.lang.String) _getProperty(ENDPOINT_ADDRESS_PROPERTY), _state);
            
            com.wheatherreport.proxy.GetGeoIPResponse _result = null;
            java.lang.Object _responseObj = _state.getResponse().getBody().getValue();
            if (_responseObj instanceof SOAPDeserializationState) {
                _result = (com.wheatherreport.proxy.GetGeoIPResponse)((SOAPDeserializationState) _responseObj).getInstance();
            } else {
                _result = (com.wheatherreport.proxy.GetGeoIPResponse)_responseObj;
            }
            
            return _result.getGetGeoIPResult();
            
        } catch (RemoteException e) {
            // let this one through unchanged
            throw e;
        } catch (JAXRPCException e) {
            throw new RemoteException(e.getMessage(), e);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException)e;
            } else {
                throw new RemoteException(e.getMessage(), e);
            }
        }
    }
    
    
    /*
     *  this method deserializes the request/response structure in the body
     */
    protected void _readFirstBodyElement(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState  state) throws Exception {
        int opcode = state.getRequest().getOperationCode();
        switch (opcode) {
            case GetGeoIPContext_OPCODE:
                _deserialize_GetGeoIPContext(bodyReader, deserializationContext, state);
                break;
            case GetGeoIP_OPCODE:
                _deserialize_GetGeoIP(bodyReader, deserializationContext, state);
                break;
            default:
                throw new SenderException("sender.response.unrecognizedOperation", java.lang.Integer.toString(opcode));
        }
    }
    
    
    
    /*
     * This method deserializes the body of the GetGeoIPContext operation.
     */
    private void _deserialize_GetGeoIPContext(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState state) throws Exception {
        java.lang.Object myGetGeoIPContextResponseObj =
            ns1_myGetGeoIPContextResponse_LiteralSerializer.deserialize(ns1_GetGeoIPContext_GetGeoIPContextResponse_QNAME,
                bodyReader, deserializationContext);
        
        SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_GetGeoIPContext_GetGeoIPContextResponse_QNAME);
        bodyBlock.setValue(myGetGeoIPContextResponseObj);
        state.getResponse().setBody(bodyBlock);
    }
    
    /*
     * This method deserializes the body of the GetGeoIP operation.
     */
    private void _deserialize_GetGeoIP(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState state) throws Exception {
        java.lang.Object myGetGeoIPResponseObj =
            ns1_myGetGeoIPResponse_LiteralSerializer.deserialize(ns1_GetGeoIP_GetGeoIPResponse_QNAME,
                bodyReader, deserializationContext);
        
        SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_GetGeoIP_GetGeoIPResponse_QNAME);
        bodyBlock.setValue(myGetGeoIPResponseObj);
        state.getResponse().setBody(bodyBlock);
    }
    
    
    
    protected java.lang.String _getDefaultEnvelopeEncodingStyle() {
        return null;
    }
    
    public java.lang.String _getImplicitEnvelopeEncodingStyle() {
        return "";
    }
    
    public java.lang.String _getEncodingStyle() {
        return SOAPNamespaceConstants.ENCODING;
    }
    
    public void _setEncodingStyle(java.lang.String encodingStyle) {
        throw new UnsupportedOperationException("cannot set encoding style");
    }
    
    
    
    
    
    /*
     * This method returns an array containing (prefix, nsURI) pairs.
     */
    protected java.lang.String[] _getNamespaceDeclarations() {
        return myNamespace_declarations;
    }
    
    /*
     * This method returns an array containing the names of the headers we understand.
     */
    public javax.xml.namespace.QName[] _getUnderstoodHeaders() {
        return understoodHeaderNames;
    }
    
    
    protected void _preHandlingHook(StreamingSenderState state) throws Exception {
        super._preHandlingHook(state);
    }
    
    
    protected boolean _preRequestSendingHook(StreamingSenderState state) throws Exception {
        boolean bool = false;
        bool = super._preRequestSendingHook(state);
        return bool;
    }
    
    public void _initialize(InternalTypeMappingRegistry registry) throws Exception {
        super._initialize(registry);
        ns1_myGetGeoIPContextResponse_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.wheatherreport.proxy.GetGeoIPContextResponse.class, ns1_GetGeoIPContextResponse_TYPE_QNAME);
        ns1_myGetGeoIP_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.wheatherreport.proxy.GetGeoIP.class, ns1_GetGeoIP_TYPE_QNAME);
        ns1_myGetGeoIPContext_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.wheatherreport.proxy.GetGeoIPContext.class, ns1_GetGeoIPContext_TYPE_QNAME);
        ns1_myGetGeoIPResponse_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.wheatherreport.proxy.GetGeoIPResponse.class, ns1_GetGeoIPResponse_TYPE_QNAME);
    }
    
    private static final javax.xml.namespace.QName _portName = new QName("http://www.webservicex.net/", "GeoIPServiceSoap");
    private static final int GetGeoIPContext_OPCODE = 0;
    private static final int GetGeoIP_OPCODE = 1;
    private static final javax.xml.namespace.QName ns1_GetGeoIPContext_GetGeoIPContext_QNAME = new QName("http://www.webservicex.net/", "GetGeoIPContext");
    private static final javax.xml.namespace.QName ns1_GetGeoIPContext_TYPE_QNAME = new QName("http://www.webservicex.net/", "GetGeoIPContext");
    private CombinedSerializer ns1_myGetGeoIPContext_LiteralSerializer;
    private static final javax.xml.namespace.QName ns1_GetGeoIPContext_GetGeoIPContextResponse_QNAME = new QName("http://www.webservicex.net/", "GetGeoIPContextResponse");
    private static final javax.xml.namespace.QName ns1_GetGeoIPContextResponse_TYPE_QNAME = new QName("http://www.webservicex.net/", "GetGeoIPContextResponse");
    private CombinedSerializer ns1_myGetGeoIPContextResponse_LiteralSerializer;
    private static final javax.xml.namespace.QName ns1_GetGeoIP_GetGeoIP_QNAME = new QName("http://www.webservicex.net/", "GetGeoIP");
    private static final javax.xml.namespace.QName ns1_GetGeoIP_TYPE_QNAME = new QName("http://www.webservicex.net/", "GetGeoIP");
    private CombinedSerializer ns1_myGetGeoIP_LiteralSerializer;
    private static final javax.xml.namespace.QName ns1_GetGeoIP_GetGeoIPResponse_QNAME = new QName("http://www.webservicex.net/", "GetGeoIPResponse");
    private static final javax.xml.namespace.QName ns1_GetGeoIPResponse_TYPE_QNAME = new QName("http://www.webservicex.net/", "GetGeoIPResponse");
    private CombinedSerializer ns1_myGetGeoIPResponse_LiteralSerializer;
    private static final java.lang.String[] myNamespace_declarations =
                                        new java.lang.String[] {
                                            "ns0", "http://www.webservicex.net/"
                                        };
    
    private static final QName[] understoodHeaderNames = new QName[] {  };
}
