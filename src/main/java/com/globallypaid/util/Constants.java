package com.globallypaid.util;

public class Constants {
  private Constants() {
    throw new IllegalStateException("Constants class");
  }

  public static final String SANDBOX_BASE_URL = "sandbox.transactions.globallypaid.com";
  public static final String LIVE_BASE_URL = "transactions.globallypaid.com";
  public static final String API_BASE_URL = "/api";
  public static final String VERSION = "/v";
  public static final String API_VERSION_NUMBER = "1";
  public static final String API_VERSION = VERSION.concat(API_VERSION_NUMBER);
  public static final String HMAC_HEADER = "hmac";

  public static final String HMAC_ALGORITHM_TYPE = "HmacSHA256";
  public static final String ZERO_CODE = "00";
  public static final String RESPONSE_CODE = "response_code";
  public static final String MESSAGE = "message";
  public static final String SLASH = "/";
}
