package com.javanauta.usuario.infrastructure.exceptions;

public class ResourceNotFindException extends RuntimeException {

	public ResourceNotFindException(String mensagem) {
		super(mensagem);
	}
	
	public ResourceNotFindException(String mensagem, Throwable throwable) {
		super(mensagem, throwable);
	}
}
