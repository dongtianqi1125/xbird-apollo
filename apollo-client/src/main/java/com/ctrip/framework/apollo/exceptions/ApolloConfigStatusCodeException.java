package com.ctrip.framework.apollo.exceptions;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public class ApolloConfigStatusCodeException extends RuntimeException {
  private static final long serialVersionUID = 1L;
  private final int statusCode;

  public ApolloConfigStatusCodeException(int statusCode, String message) {
    super(String.format("[status code: %d] %s", statusCode, message));
    this.statusCode = statusCode;
  }

  public int getStatusCode() {
    return statusCode;
  }
}
