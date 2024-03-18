//package com.springboot.Filter;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//
//import com.springboot.Service.UserInfoUserDetailService;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//public class JwtAuthFinter {
//	@Autowired
//	private JwtService jwtService;
//	
//	@Autowired
//	private UserInfoUserDetailService userDetailService;
//
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//		
//		String token=null;
//		String username=null;
//		
//		String authHeader = request.getHeader("Authorization");
//		if(authHeader!=null && authHeader.startsWith("Bearer ")) {
//			
//			token = authHeader.substring(7);
//			
//			username = jwtService.extractUsername(token);
//		
//if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
//			
//			UserDetails userDetails = userDetailService.loadUserByUsername(username);
//			
//			if(jwtService.validateToken(token, userDetails)) {
//				
//				UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//				authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//				SecurityContextHolder.getContext().setAuthentication(authToken);
//			
//			}
//		}
//		filterChain.doFilter(request, response);
//	}
//
//}
//
//}
