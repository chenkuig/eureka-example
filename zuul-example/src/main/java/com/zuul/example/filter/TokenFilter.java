package com.zuul.example.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class TokenFilter extends ZuulFilter {

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return null;
	}

}
