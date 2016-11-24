package sdk.Connection;

public interface ResponseCallback<T> {

  void success(T data);

  //ændring i kode
  void error(int status);

}
