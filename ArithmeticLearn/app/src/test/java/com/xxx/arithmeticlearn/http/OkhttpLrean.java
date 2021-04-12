package com.xxx.arithmeticlearn.http;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkhttpLrean {

    private Call call;

    @Test
    public void testStart(){

        OkHttpClient oc = new OkHttpClient().newBuilder().build();
        Request request = new Request.Builder().url("Url").get().build();
        call = oc.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {

            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {

            }
        });

    }
}
