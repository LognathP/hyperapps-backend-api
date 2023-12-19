package com.hyperapps.constants;

public interface OrderQueryConstants {
	
	String GET_ORDER_ITEMS_BYID = "select o2.id,o2.order_item_quantity,o2.price_per_unit,o2.item_status,o2.total,\r\n" + 
			"p.name,p.image_path,p.description from orderitems o2,products p where o2.product_id = p.id and o2.order_id = ?";
	
	String GET_OFFER_DETAILS_BYID = "select o.id,o.offer_heading,o.offer_description,o.offer_percentage,o.offer_flat_amount,o.offer_type,\r\n" + 
			"	o.offer_start_date,o.offer_valid,o.active,o.store_id from offers o,offer_order oo where o.id = oo.offer_id and oo.order_id = ?";
	
	String GET_CUSTOMER_ORDERS = "SELECT o.id,\r\n"
			+ " o.order_details,\r\n"
			+ " o.created_at,\r\n"
			+ " o.updated_at,\r\n"
			+ " o.customer_id,\r\n"
			+ " o.status,\r\n"
			+ " o.store_id,\r\n"
			+ " o.order_total,\r\n"
			+ " o.order_grand_total,\r\n"
			+ " o.payment_details,\r\n"
			+ " c.customers_firstname,\r\n"
			+ " c.customers_email_address,\r\n"
			+ " c.customers_telephone,\r\n"
			+ " ca.street_name,\r\n"
			+ " ca.pin_code,\r\n"
			+ " ca.city_name,\r\n"
			+ " ca.state,\r\n"
			+ " ca.country,\r\n"
			+ " p.business_name,\r\n"
			+ " p.physical_store_address,\r\n"
			+ " p.business_phone,\r\n"
			+ " p.user_image,\r\n"
			+ " oda.location,\r\n"
			+ " o.pickup,\r\n"
			+ " o.payment_method\r\n"
			+ "FROM orders o \r\n"
			+ "INNER JOIN customers c ON o.customer_id = c.id \r\n"
			+ "INNER JOIN order_delivery_address oda ON o.id = oda.order_id \r\n"
			+ "INNER JOIN profiles p ON p.id = o.store_id \r\n"
			+ "LEFT JOIN customer_addresses ca ON ca.customer_id = o.customer_id and ca.id = oda.address_id \r\n"
			+ "WHERE c.id = ? order by created_at desc limit ? offset ?";
	
	String GET_ORDER_STATUS = "select status from orders where id= ?";
	
	String UPDATE_ORDER_STATUS = "update orders set order_details = ?, status= ? where id = ?";
	
	String INSERT_ORDER_TABLE = "insert into orders (created_at,updated_at,customer_id,store_id,status,order_total,order_grand_total,payment_details,order_details,pickup,payment_method )\r\n" + 
			"values (current_timestamp,current_timestamp,?,?,?,?,?,?,?,?,?)";
	
	String INSERT_ORDER_ITEMS_TABLE ="insert into orderitems (order_id,order_item_quantity,price_per_unit,product_id,item_status,total,created_at,updated_at) values\r\n" + 
			"(?,?,?,?,?,?,current_timestamp,current_timestamp);";
	
	String INSERT_ORDER_DELIVERY_TABLE = "insert into order_delivery_address (address_type,location,order_id,created_at,updated_at,address_id) values (?,?,?,current_timestamp,current_timestamp,?);";
	
	String INSERT_OFFER_ORDER = "insert into offer_order (offer_id,order_id,created_at,updated_at) values (?,?,current_timestamp,current_timestamp)";

	String GET_CUSTOMER_ID_BY_ORDERID = "select customer_id from orders where id = ?";
		
	String INSERT_DUNZO_TOKEN = "insert into dunzo_token (token) values (?)";
	
	String GET_DUNZO_TOKEN = "select token from dunzo_token";
	
	String DELETE_DUNZO_TOKEN = "delete from dunzo_token";
	
	String INSERT_DUNZO_TASK = "INSERT INTO dunzo_task "
			+ "(task_id, created_at, updated_at, state, response, request,order_id,api) "
			+ "VALUES(?,current_timestamp,current_timestamp,?,?,?,?,?)";
	
	String GET_ORDER_ID_BY_TASK = "select distinct(order_id) from dunzo_task where task_id = ?";
	
	String GET_TASK_ID_BY_ORDER = "select distinct(task_id) from dunzo_task where order_id = ?";
	
	String GET_ALL_DUNZO_TASKS = "SELECT task_id,api,request,response,state, created_at, updated_at "
			+ "FROM dunzo_task order by created_at desc";
	
	String GET_DUNZO_TASK_BY_ID = "SELECT task_id,api,request,response,state, created_at, updated_at "
			+ "FROM dunzo_task where task_id = ?";
	

	}
