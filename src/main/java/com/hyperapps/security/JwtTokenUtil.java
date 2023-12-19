package com.hyperapps.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

public class JwtTokenUtil {

	private static final String SECRET_KEY = "your-secret-key";
	private static final long EXPIRATION_TIME = 3600000;

	public static String generateToken(Map<String, Object> claims, String subject) {
		Date now = new Date();
		Date expirationDate = new Date(now.getTime() + EXPIRATION_TIME);
		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(now).setExpiration(expirationDate)
				.signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();
	}

	public static Boolean isTokenExpired(String token) {
		Claims claims = Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
		Date expirationDate = claims.getExpiration();
		return expirationDate.before(new Date());
	}

	public static Boolean isTokenValid(String token, String expectedSubject, Map<String, Object> expectedClaims) {
		Jws<Claims> jws = Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token);
		Claims claims = jws.getBody();

		String actualSubject = claims.getSubject();
		if (!expectedSubject.equals(actualSubject)) {
			return false;
		}

		for (Map.Entry<String, Object> entry : expectedClaims.entrySet()) {
			String claimKey = entry.getKey();
			Object expectedValue = entry.getValue();
			Object actualValue = claims.get(claimKey);
			if (!expectedValue.equals(actualValue)) {
				return false;
			}
		}

		return true;
	}

}