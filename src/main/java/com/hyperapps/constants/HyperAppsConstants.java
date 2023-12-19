package com.hyperapps.constants;

import java.util.HashMap;

public interface HyperAppsConstants {


	int RETAILER_USER = 1;

	int CUSTOMER_USER = 2;

	int DEVICE_ANDROID = 1;

	int DEVICE_IOS = 2;

	int DEVICE_WINDOWS = 3;

	int DEVICE_BB = 4;

	int ORDER_INITIATED = 1;
	int ORDER_ACCEPTED = 2;
	int ORDER_PROCESSED = 3;
	int ORDER_COMPLETED = 4;
	int ORDER_CANCELED_BY_CUSTOMER = 5;
	int ORDER_CANCELED_BY_RETAILER = 6;
	int ORDER_FAILED = 7;
	
	static HashMap<Integer, String> orderStatus = new HashMap<Integer, String>();
	
	
	static String getOrderStatus(int stat)
	{
		orderStatus.put(1, "Order Initiated");
		orderStatus.put(2, "Order Accepted");
		orderStatus.put(3, "Order Processed");
		orderStatus.put(4, "Order Completed");
		orderStatus.put(5, "Order Cancelled by Customer");
		orderStatus.put(6, "Order Cancelled by Retailer");
		orderStatus.put(7, "Order Failed");
		return orderStatus.get(stat);
	}
	
	
	String RESPONSE_TRUE = "true";
	String RESPONSE_FALSE = "false";

	int ACTIVE = 1;
	
	String ORDER_PLACE_TITLE = "Thanks for Placing Order";
	String ORDER_PLACE_BODY = "Your order has been placed successfully ! Keep the Order Id to track your Order Status";
	

	String BUSINESS_ORDER_PLACE_TITLE = "New Order has been placed";
	String BUSINESS_ORDER_PLACE_BODY = "New Order has been placed by ";

	String ORDER_UPDATE_TITLE = "Order Update";
	String ORDER_UPDATE_PROCESSED = "Your Order has been Processed Successfully !";
	String ORDER_UPDATE_ACCEPTED = "Your Order has been Accepted by Merchant !";
	String ORDER_UPDATE_COMPLETED = "Your Order has been Completed Successfully !";
	String ORDER_UPDATE_CANCELLED_BY_CUSTOMER = "Your Order has been Cancelled !";
	String ORDER_UPDATE_CANCELLED_BY_RETAILER = "Your Order has been Cancelled by Merchant !";
	String ORDER_FAILED_MESSAGE = "We are unable to take your Order";
	
}
