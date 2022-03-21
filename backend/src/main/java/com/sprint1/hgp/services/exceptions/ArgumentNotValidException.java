package com.sprint1.hgp.services.exceptions;

public class ArgumentNotValidException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ArgumentNotValidException(String msg) {
		super(msg);
	}
}
