package com.deepstack.exception;

public class ApiConnectionException extends GloballyPaidException {

  public ApiConnectionException(String message, Throwable e) {
    super(message, e);
  }
}
