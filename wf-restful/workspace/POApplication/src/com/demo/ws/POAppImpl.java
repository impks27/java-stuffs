package com.demo.ws;

import javax.jws.WebService;

@WebService(endpointInterface="com.demo.ws.POApp",
wsdlLocation="WEB-INF/wsdl/POApp.wsdl",
portName="POAppPort",serviceName="POAppService",
targetNamespace="http://ws.demo.com/")
public class POAppImpl implements POApp {

	@Override
	public Invoice submitPO(Order order) {
		Invoice invoice=new Invoice();
		invoice.setCustName(order.getCustName());
		invoice.setItemName(order.getItemName());
		invoice.setTotalPrice(order.getItemQty()*order.getItemPrice());
		return invoice;
	}

}
