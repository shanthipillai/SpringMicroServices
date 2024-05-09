package com.springsecurity.explorer.controller;

import java.sql.Date;
import java.util.Optional;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTToken {

	private long timeoutSession = 2 * 60000;
	private final String secreteKey = "fergughsbur2363rb76r2#^@#@#3h87xbr";

	public String createToken(String userId) {
		// TODO Auto-generated method stub
		String token = Jwts.builder().setSubject(userId).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + timeoutSession))
				.signWith(SignatureAlgorithm.HS256, secreteKey).compact();
		boolean stateOfToken=isTokenExipred(token);
		return token;
	}
	
	
	public String validateToken(String token, String userId)
	{
		String attempt=null;
	Optional<String> userNameFromToken=	getUserNameFromToken(token);
	boolean isexpired=isTokenExipred(token);
	String userNameOfToken=null;
	if(userNameFromToken.isPresent())
	{
		userNameOfToken=userNameFromToken.get();
	}
	
	   if((isexpired && userId.equalsIgnoreCase(userNameOfToken)==true))
			   {
		          attempt="Authenticated Successfully";
			   }
	   else
	   {
		   attempt="Invalid Attempt";
	   }
		//return isexpired && userId.equalsIgnoreCase(userNameOfToken);
	   return attempt;
	}
	
	
	
	public Optional<String> getUserNameFromToken(String token)
	{
		
		String username=null;
		try
		{
		username=Jwts.parser().setSigningKey(secreteKey).parseClaimsJws(token).getBody().getSubject();
		}
		
		catch(ExpiredJwtException eje)
		{
			eje.getMessage();
		}
		return username==null?Optional.empty():Optional.of(username);
		
	}

	
	
	public boolean isTokenExipred(String token)
	{
		java.util.Date expirytime=	Jwts.parser().setSigningKey(secreteKey).parseClaimsJws(token).getBody().getExpiration();
	    System.out.println(expirytime);
	    return expirytime.after(new java.util.Date());
	}
}
