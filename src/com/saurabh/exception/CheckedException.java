package com.saurabh.exception;

import java.io.Serializable;

public class CheckedException extends Exception implements Serializable {

	private static final long serialVersionUID=1l;
	CheckedException(String exception)
	{
		super(exception);
	}
}
