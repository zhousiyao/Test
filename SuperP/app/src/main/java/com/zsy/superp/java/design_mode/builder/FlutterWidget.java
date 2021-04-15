package com.zsy.superp.java.design_mode.builder;

import android.graphics.Color;

public class FlutterWidget {

    private String url;
    private String title;
    private Color color;

    public FlutterWidget(){
        this(new Builder());
    }

    public FlutterWidget(Builder builder){
        this.url = builder.url;
        this.title = builder.title;
        this.color = builder.color;
    }

    static class Builder{
        private String url;
        private String title;
        private Color color;

        public Builder url(String url){
            this.url = url;
            return this;
        }
        public Builder title(String title){
            this.title = title;
            return this;
        }
        public Builder color(Color color){
            this.color = color;
            return this;
        }

        public FlutterWidget build(){
            return new FlutterWidget(this);
        }
    }
}
