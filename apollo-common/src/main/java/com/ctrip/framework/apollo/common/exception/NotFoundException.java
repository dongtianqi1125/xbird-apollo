package com.ctrip.framework.apollo.common.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends AbstractApolloHttpException {

  private static final long serialVersionUID = 1L;

  public NotFoundException(String str) {
    super(str);
    setHttpStatus(HttpStatus.NOT_FOUND);
  }
}
