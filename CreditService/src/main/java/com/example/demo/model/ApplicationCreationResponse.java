package com.example.demo.model;

public class ApplicationCreationResponse {
	
	private ResponseStatus status;
	private Application app;

	/**
	 * @return the status
	 */
	public ResponseStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(ResponseStatus status) {
		this.status = status;
	}

	/**
	 * @return the user
	 */
	public Application getApp() {
		return app;
	}

	/**
	 * @param user the user to set
	 */
	public void setApp(Application app) {
		this.app = app;
	}

}

