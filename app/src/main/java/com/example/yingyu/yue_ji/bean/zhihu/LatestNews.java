package com.example.yingyu.yue_ji.bean.zhihu;

import java.util.List;


public class LatestNews {

    //http://news-at.zhihu.com/api/4/news/latest



    private String date;


    private List<Stories> stories;
    /**
     * ga_prefix : 091817
     * id : 8802910
     * image : http://pic2.zhimg.com/34afc742188aaa7707a016ffc35cdc9d.jpg
     * title : 知乎好问题 · 有哪些好吃又健康而且适合在家做的甜品？
     * type : 0
     */

    private List<TopStories> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Stories> getStories() {
        return stories;
    }

    public void setStories(List<Stories> stories) {
        this.stories = stories;
    }

    public List<TopStories> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStories> top_stories) {
        this.top_stories = top_stories;
    }

    public static class Stories {
        private String ga_prefix;
        private String id;
        private String title;
        private int type;
        private List<String> images;

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        @Override
        public String toString() {
            return "Stories{" +
                    "ga_prefix='" + ga_prefix + '\'' +
                    ", id=" + id +
                    ", title='" + title + '\'' +
                    ", type=" + type +
                    ", images=" + images +
                    '}';
        }
    }

    public static class TopStories {
        private String ga_prefix;
        private String id;
        private String image;
        private String title;
        private int type;

        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "TopStories{" +
                    "ga_prefix='" + ga_prefix + '\'' +
                    ", id=" + id +
                    ", image='" + image + '\'' +
                    ", title='" + title + '\'' +
                    ", type=" + type +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "LatestNews{" +
                "date='" + date + '\'' +
                ", stories=" + stories +
                ", top_stories=" + top_stories +
                '}';
    }
}
