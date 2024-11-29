package org.example.BuilderPattern;

public class Swagger {

    private String url;
    private String title;
    private String description;
    private String tag;

    private Swagger(Builder builder){
        this.url=builder.url;
        this.title=builder.title;
        this.description=builder.description;
        this.tag=builder.tag;
    }
    public static class Builder{

        private String url;
        private String title;
        private String description;
        private String tag;

        public Builder setUrl(String url){
            this.url=url;
            return this;
        }

        public Builder setTitle(String title){
            this.title=title;
            return this;
        }

        public Builder setDescription(String description){
            this.description=description;
            return this;
        }
        public Builder setTag(String tag){
            this.tag=tag;
            return this;
        }
        public Swagger build(){
            return new Swagger(this);
        }
    }

    @Override
    public String toString() {
        return "Swagger{" +
                "url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
