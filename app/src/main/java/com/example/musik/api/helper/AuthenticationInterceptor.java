package com.example.musik.api.helper;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AuthenticationInterceptor implements Interceptor {
    private String key;

    public AuthenticationInterceptor(String key) {
        this.key = key;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        Request.Builder builder = original.newBuilder()
                .header("client_id", key)
                .method(original.method(), original.body());
        Request request = builder.build();
        return chain.proceed(request);
    }
}
