package com.saurabh.exception;

import java.io.Serializable;

public class UnCheckedException extends RuntimeException implements Serializable {

	private static final long serialVersionUID=1l;
	UnCheckedException(String exception)
	{
		super(exception);
	}
	
}
