package br.com.thehero.login.exception;

public class EmailNotFoundException extends RuntimeException {

  public EmailNotFoundException(String msg) {
    super(msg);
  }

}
