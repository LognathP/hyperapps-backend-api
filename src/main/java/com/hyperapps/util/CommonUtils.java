package com.hyperapps.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.modelmapper.ModelMapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hyperapps.dto.CustomerDTO;
import com.hyperapps.logger.ConfigProperties;

public class CommonUtils {

	private static final ModelMapper modelMapper = new ModelMapper();

	public static double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
		if ((lat1 == lat2) && (lon1 == lon2)) {
			return 0;
		} else {
			double theta = lon1 - lon2;
			double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2))
					+ Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
			dist = Math.acos(dist);
			dist = Math.toDegrees(dist);
			dist = dist * 60 * 1.1515;
			if (unit.equals("K")) {
				dist = dist * 1.609344;
			} else if (unit.equals("N")) {
				dist = dist * 0.8684;
			}
			return (dist);
		}
	}

	public static int emptyIntToZero(String s) {
		if (s.length() == 0) {
			return 0;
		} else {
			return Integer.parseInt(s);
		}

	}

	public static void closeDB(Connection con, ResultSet rs, PreparedStatement ps) throws SQLException {
		if (con != null) {
			con.close();
		}
		if (rs != null) {
			rs.close();
		}
		if (ps != null) {
			ps.close();
		}

	}

	public static int getRecordLimit(int limit, ConfigProperties configProp) {
		int pageLimit = 0;
		int maxLimit = Integer.parseInt(configProp.getConfigValue("page.max.limit"));
		int defaultLimit = Integer.parseInt(configProp.getConfigValue("page.default.limit"));
		if (limit > maxLimit) {
			pageLimit = maxLimit;
		} else if (limit == 0) {
			pageLimit = defaultLimit;
		} else {
			pageLimit = limit;
		}
		return pageLimit;
	}

	public static int getOffset(int offset, int limit) {
		if (offset == 0) {
			return 0;
		} else {
			return offset * limit;
		}
	}

	public static <T> T convertToClass(String request, Class<T> targetClass)
			throws JsonMappingException, JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue((String) request, targetClass);
	}

	public static <E, D> D convertToDto(E entity, Class<D> dtoClass) {
		return modelMapper.map(entity, dtoClass);
	}

	public static <D, E> E convertToEntity(D dto, Class<E> entityClass) {
		return modelMapper.map(dto, entityClass);
	}
}
