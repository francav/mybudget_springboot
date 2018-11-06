package br.com.victorpfranca.mybudget.transaction.rules;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class DataSerieLancamentoInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;

	public DataSerieLancamentoInvalidaException(String message) {
		super(message);
	}

	public DataSerieLancamentoInvalidaException(String message, Throwable cause) {
		super(message, cause);
	}

}