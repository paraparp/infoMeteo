package com.parapar.meteo.errors;

import java.util.Date;

public class ExceptionResponseEntity {
	private Date timestamp;
	private String mensaje;
	private String detalles;
	private String httpCodeMsg;

	public ExceptionResponseEntity(Date timestamp, String message, String details, String httpCodeMsg) {
		super();
		this.timestamp = timestamp;
		this.mensaje = message;
		this.detalles = details;
		this.httpCodeMsg = httpCodeMsg;
	}

	public ExceptionResponseEntity(Date timestamp, String httpCodeMsg) {
		super();
		this.timestamp = timestamp;
		this.httpCodeMsg = httpCodeMsg;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public String getHttpCodeMsg() {
		return httpCodeMsg;
	}

	public void setHttpCodeMsg(String httpCodeMsg) {
		this.httpCodeMsg = httpCodeMsg;
	}

	@Override
	public String toString() {
		return "ExceptionResponseEntity [timestamp=" + timestamp + ", mensaje=" + mensaje + ", detalles=" + detalles
				+ ", httpCodeMsg=" + httpCodeMsg + "]";
	}

	

}