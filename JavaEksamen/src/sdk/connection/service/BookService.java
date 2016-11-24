package sdk.connection.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import sdk.connection.Connection;
import sdk.connection.ResponseCallback;
import sdk.connection.ResponseParser;
import sdk.models.Book;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class BookService {

    private Connection connection;
    private Gson gson;

    public BookService() {
        this.connection = new Connection();
        this.gson = new Gson();
    }

    public void getAll(final ResponseCallback<ArrayList<Book>> responseCallback) {
        HttpGet getRequest = new HttpGet(Connection.serverURL + "/books");
        getRequest.addHeader("filter", "{\"include\":[\"authors\",\"publisher\"]}");

        this.connection.execute(getRequest, new ResponseParser() {
            public void payload(String json) {
                ArrayList<Book> books = gson.fromJson(json, new TypeToken<ArrayList<Book>>() {
                }.getType());
                responseCallback.success(books);
            }

            public void error(int status) {
                responseCallback.error(status);
            }
        });
