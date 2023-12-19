package com.hyperapps.constants;

public interface StoreQueryConstants {

	public String GET_STORE_LOC_TIME_QUERY = "select d.delivery_areas,p.business_operating_timings,p.business_name,p.physical_store_address,p.business_phone,p.store_latitude,p.store_longitude from deliveries d,profiles p where p.id = d.store_id and d.store_id=?";
}
