package com.example.yingyu.yue_ji.bean.daily;

import java.util.List;

/**
 * Created by wlt on 2016/9/19.
 * E-mail : autumnsassou@163.com
 */
public class DailyBean {

    /**
     * status : 200
     * msg : success
     */

    private MetaBean meta;

    private ResponseBean response;

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public static class MetaBean {
        private int status;
        private String msg;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

    public static class ResponseBean {
        private boolean has_more;
        private String last_key;

        private HeadlineBean headline;


        private List<FeedsBean> feeds;


        private List<BannersBean> banners;
        private List<?> banners_ad;


        private List<FeedsAdBean> feeds_ad;


        private List<ColumnsBean> columns;

        public boolean isHas_more() {
            return has_more;
        }

        public void setHas_more(boolean has_more) {
            this.has_more = has_more;
        }

        public String getLast_key() {
            return last_key;
        }

        public void setLast_key(String last_key) {
            this.last_key = last_key;
        }

        public HeadlineBean getHeadline() {
            return headline;
        }

        public void setHeadline(HeadlineBean headline) {
            this.headline = headline;
        }

        public List<FeedsBean> getFeeds() {
            return feeds;
        }

        public void setFeeds(List<FeedsBean> feeds) {
            this.feeds = feeds;
        }

        public List<BannersBean> getBanners() {
            return banners;
        }

        public void setBanners(List<BannersBean> banners) {
            this.banners = banners;
        }

        public List<?> getBanners_ad() {
            return banners_ad;
        }

        public void setBanners_ad(List<?> banners_ad) {
            this.banners_ad = banners_ad;
        }

        public List<FeedsAdBean> getFeeds_ad() {
            return feeds_ad;
        }

        public void setFeeds_ad(List<FeedsAdBean> feeds_ad) {
            this.feeds_ad = feeds_ad;
        }

        public List<ColumnsBean> getColumns() {
            return columns;
        }

        public void setColumns(List<ColumnsBean> columns) {
            this.columns = columns;
        }

        public static class HeadlineBean {
            private String image;
            private int type;


            private PostBean post;
            private int headline_genre;


            private List<ListBean> list;

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public PostBean getPost() {
                return post;
            }

            public void setPost(PostBean post) {
                this.post = post;
            }

            public int getHeadline_genre() {
                return headline_genre;
            }

            public void setHeadline_genre(int headline_genre) {
                this.headline_genre = headline_genre;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class PostBean {
                private int id;
                private int genre;
                private String title;
                private String description;
                private int publish_time;
                private String image;
                private int start_time;
                private int comment_count;
                private int praise_count;
                private String super_tag;
                private int page_style;
                private int post_id;
                private String appview;
                private String film_length;
                private String datatype;

                private CategoryBean category;


                private ColumnBean column;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getGenre() {
                    return genre;
                }

                public void setGenre(int genre) {
                    this.genre = genre;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public int getPublish_time() {
                    return publish_time;
                }

                public void setPublish_time(int publish_time) {
                    this.publish_time = publish_time;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public int getStart_time() {
                    return start_time;
                }

                public void setStart_time(int start_time) {
                    this.start_time = start_time;
                }

                public int getComment_count() {
                    return comment_count;
                }

                public void setComment_count(int comment_count) {
                    this.comment_count = comment_count;
                }

                public int getPraise_count() {
                    return praise_count;
                }

                public void setPraise_count(int praise_count) {
                    this.praise_count = praise_count;
                }

                public String getSuper_tag() {
                    return super_tag;
                }

                public void setSuper_tag(String super_tag) {
                    this.super_tag = super_tag;
                }

                public int getPage_style() {
                    return page_style;
                }

                public void setPage_style(int page_style) {
                    this.page_style = page_style;
                }

                public int getPost_id() {
                    return post_id;
                }

                public void setPost_id(int post_id) {
                    this.post_id = post_id;
                }

                public String getAppview() {
                    return appview;
                }

                public void setAppview(String appview) {
                    this.appview = appview;
                }

                public String getFilm_length() {
                    return film_length;
                }

                public void setFilm_length(String film_length) {
                    this.film_length = film_length;
                }

                public String getDatatype() {
                    return datatype;
                }

                public void setDatatype(String datatype) {
                    this.datatype = datatype;
                }

                public CategoryBean getCategory() {
                    return category;
                }

                public void setCategory(CategoryBean category) {
                    this.category = category;
                }

                public ColumnBean getColumn() {
                    return column;
                }

                public void setColumn(ColumnBean column) {
                    this.column = column;
                }

                public static class CategoryBean {
                    private int id;
                    private String title;
                    private String normal;
                    private String normal_hl;
                    private String image_lab;
                    private String image_experiment;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getNormal() {
                        return normal;
                    }

                    public void setNormal(String normal) {
                        this.normal = normal;
                    }

                    public String getNormal_hl() {
                        return normal_hl;
                    }

                    public void setNormal_hl(String normal_hl) {
                        this.normal_hl = normal_hl;
                    }

                    public String getImage_lab() {
                        return image_lab;
                    }

                    public void setImage_lab(String image_lab) {
                        this.image_lab = image_lab;
                    }

                    public String getImage_experiment() {
                        return image_experiment;
                    }

                    public void setImage_experiment(String image_experiment) {
                        this.image_experiment = image_experiment;
                    }
                }

                public static class ColumnBean {
                    private int id;
                    private String name;
                    private String description;
                    private boolean subscribe_status;
                    private String icon;
                    private String image;
                    private String image_large;
                    private String content_provider;
                    private int show_type;
                    private int genre;
                    private int subscriber_num;
                    private int post_count;
                    private String sort_time;
                    private String column_tag;


                    private ShareBean share;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public boolean isSubscribe_status() {
                        return subscribe_status;
                    }

                    public void setSubscribe_status(boolean subscribe_status) {
                        this.subscribe_status = subscribe_status;
                    }

                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }

                    public String getImage() {
                        return image;
                    }

                    public void setImage(String image) {
                        this.image = image;
                    }

                    public String getImage_large() {
                        return image_large;
                    }

                    public void setImage_large(String image_large) {
                        this.image_large = image_large;
                    }

                    public String getContent_provider() {
                        return content_provider;
                    }

                    public void setContent_provider(String content_provider) {
                        this.content_provider = content_provider;
                    }

                    public int getShow_type() {
                        return show_type;
                    }

                    public void setShow_type(int show_type) {
                        this.show_type = show_type;
                    }

                    public int getGenre() {
                        return genre;
                    }

                    public void setGenre(int genre) {
                        this.genre = genre;
                    }

                    public int getSubscriber_num() {
                        return subscriber_num;
                    }

                    public void setSubscriber_num(int subscriber_num) {
                        this.subscriber_num = subscriber_num;
                    }

                    public int getPost_count() {
                        return post_count;
                    }

                    public void setPost_count(int post_count) {
                        this.post_count = post_count;
                    }

                    public String getSort_time() {
                        return sort_time;
                    }

                    public void setSort_time(String sort_time) {
                        this.sort_time = sort_time;
                    }

                    public String getColumn_tag() {
                        return column_tag;
                    }

                    public void setColumn_tag(String column_tag) {
                        this.column_tag = column_tag;
                    }

                    public ShareBean getShare() {
                        return share;
                    }

                    public void setShare(ShareBean share) {
                        this.share = share;
                    }

                    public static class ShareBean {
                        private String url;
                        private String title;
                        private String text;
                        private String image;

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }

                        public String getImage() {
                            return image;
                        }

                        public void setImage(String image) {
                            this.image = image;
                        }
                    }
                }
            }

            public static class ListBean {
                private String title;
                private String description;
                private List<?> keywords;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public List<?> getKeywords() {
                    return keywords;
                }

                public void setKeywords(List<?> keywords) {
                    this.keywords = keywords;
                }
            }
        }

        public static class FeedsBean {
            private String image;
            private int type;


            private PostBean post;

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public PostBean getPost() {
                return post;
            }

            public void setPost(PostBean post) {
                this.post = post;
            }

            public static class PostBean {
                private int id;
                private int genre;
                private String title;
                private String description;
                private int publish_time;
                private String image;
                private int start_time;
                private int comment_count;
                private int praise_count;
                private String super_tag;
                private int page_style;
                private int post_id;
                private String appview;
                private String film_length;
                private String datatype;


                private CategoryBean category;


                private ColumnBean column;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getGenre() {
                    return genre;
                }

                public void setGenre(int genre) {
                    this.genre = genre;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public int getPublish_time() {
                    return publish_time;
                }

                public void setPublish_time(int publish_time) {
                    this.publish_time = publish_time;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public int getStart_time() {
                    return start_time;
                }

                public void setStart_time(int start_time) {
                    this.start_time = start_time;
                }

                public int getComment_count() {
                    return comment_count;
                }

                public void setComment_count(int comment_count) {
                    this.comment_count = comment_count;
                }

                public int getPraise_count() {
                    return praise_count;
                }

                public void setPraise_count(int praise_count) {
                    this.praise_count = praise_count;
                }

                public String getSuper_tag() {
                    return super_tag;
                }

                public void setSuper_tag(String super_tag) {
                    this.super_tag = super_tag;
                }

                public int getPage_style() {
                    return page_style;
                }

                public void setPage_style(int page_style) {
                    this.page_style = page_style;
                }

                public int getPost_id() {
                    return post_id;
                }

                public void setPost_id(int post_id) {
                    this.post_id = post_id;
                }

                public String getAppview() {
                    return appview;
                }

                public void setAppview(String appview) {
                    this.appview = appview;
                }

                public String getFilm_length() {
                    return film_length;
                }

                public void setFilm_length(String film_length) {
                    this.film_length = film_length;
                }

                public String getDatatype() {
                    return datatype;
                }

                public void setDatatype(String datatype) {
                    this.datatype = datatype;
                }

                public CategoryBean getCategory() {
                    return category;
                }

                public void setCategory(CategoryBean category) {
                    this.category = category;
                }

                public ColumnBean getColumn() {
                    return column;
                }

                public void setColumn(ColumnBean column) {
                    this.column = column;
                }

                public static class CategoryBean {
                    private int id;
                    private String title;
                    private String normal;
                    private String normal_hl;
                    private String image_lab;
                    private String image_experiment;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getNormal() {
                        return normal;
                    }

                    public void setNormal(String normal) {
                        this.normal = normal;
                    }

                    public String getNormal_hl() {
                        return normal_hl;
                    }

                    public void setNormal_hl(String normal_hl) {
                        this.normal_hl = normal_hl;
                    }

                    public String getImage_lab() {
                        return image_lab;
                    }

                    public void setImage_lab(String image_lab) {
                        this.image_lab = image_lab;
                    }

                    public String getImage_experiment() {
                        return image_experiment;
                    }

                    public void setImage_experiment(String image_experiment) {
                        this.image_experiment = image_experiment;
                    }
                }

                public static class ColumnBean {
                    private int id;
                    private String name;
                    private String description;
                    private boolean subscribe_status;
                    private String icon;
                    private String image;
                    private String image_large;
                    private String content_provider;
                    private int show_type;
                    private int genre;
                    private int subscriber_num;
                    private int post_count;
                    private String sort_time;
                    private String column_tag;


                    private ShareBean share;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public boolean isSubscribe_status() {
                        return subscribe_status;
                    }

                    public void setSubscribe_status(boolean subscribe_status) {
                        this.subscribe_status = subscribe_status;
                    }

                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }

                    public String getImage() {
                        return image;
                    }

                    public void setImage(String image) {
                        this.image = image;
                    }

                    public String getImage_large() {
                        return image_large;
                    }

                    public void setImage_large(String image_large) {
                        this.image_large = image_large;
                    }

                    public String getContent_provider() {
                        return content_provider;
                    }

                    public void setContent_provider(String content_provider) {
                        this.content_provider = content_provider;
                    }

                    public int getShow_type() {
                        return show_type;
                    }

                    public void setShow_type(int show_type) {
                        this.show_type = show_type;
                    }

                    public int getGenre() {
                        return genre;
                    }

                    public void setGenre(int genre) {
                        this.genre = genre;
                    }

                    public int getSubscriber_num() {
                        return subscriber_num;
                    }

                    public void setSubscriber_num(int subscriber_num) {
                        this.subscriber_num = subscriber_num;
                    }

                    public int getPost_count() {
                        return post_count;
                    }

                    public void setPost_count(int post_count) {
                        this.post_count = post_count;
                    }

                    public String getSort_time() {
                        return sort_time;
                    }

                    public void setSort_time(String sort_time) {
                        this.sort_time = sort_time;
                    }

                    public String getColumn_tag() {
                        return column_tag;
                    }

                    public void setColumn_tag(String column_tag) {
                        this.column_tag = column_tag;
                    }

                    public ShareBean getShare() {
                        return share;
                    }

                    public void setShare(ShareBean share) {
                        this.share = share;
                    }

                    public static class ShareBean {
                        private String url;
                        private String title;
                        private String text;
                        private String image;

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }

                        public String getImage() {
                            return image;
                        }

                        public void setImage(String image) {
                            this.image = image;
                        }
                    }
                }
            }
        }

        public static class BannersBean {
            private String image;
            private int type;


            private PostBean post;

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public PostBean getPost() {
                return post;
            }

            public void setPost(PostBean post) {
                this.post = post;
            }

            public static class PostBean {
                private int id;
                private int genre;
                private String title;
                private String description;
                private int publish_time;
                private String image;
                private int start_time;
                private int comment_count;
                private int praise_count;
                private String super_tag;
                private int page_style;
                private int post_id;
                private String appview;
                private String film_length;
                private String datatype;


                private CategoryBean category;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getGenre() {
                    return genre;
                }

                public void setGenre(int genre) {
                    this.genre = genre;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public int getPublish_time() {
                    return publish_time;
                }

                public void setPublish_time(int publish_time) {
                    this.publish_time = publish_time;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public int getStart_time() {
                    return start_time;
                }

                public void setStart_time(int start_time) {
                    this.start_time = start_time;
                }

                public int getComment_count() {
                    return comment_count;
                }

                public void setComment_count(int comment_count) {
                    this.comment_count = comment_count;
                }

                public int getPraise_count() {
                    return praise_count;
                }

                public void setPraise_count(int praise_count) {
                    this.praise_count = praise_count;
                }

                public String getSuper_tag() {
                    return super_tag;
                }

                public void setSuper_tag(String super_tag) {
                    this.super_tag = super_tag;
                }

                public int getPage_style() {
                    return page_style;
                }

                public void setPage_style(int page_style) {
                    this.page_style = page_style;
                }

                public int getPost_id() {
                    return post_id;
                }

                public void setPost_id(int post_id) {
                    this.post_id = post_id;
                }

                public String getAppview() {
                    return appview;
                }

                public void setAppview(String appview) {
                    this.appview = appview;
                }

                public String getFilm_length() {
                    return film_length;
                }

                public void setFilm_length(String film_length) {
                    this.film_length = film_length;
                }

                public String getDatatype() {
                    return datatype;
                }

                public void setDatatype(String datatype) {
                    this.datatype = datatype;
                }

                public CategoryBean getCategory() {
                    return category;
                }

                public void setCategory(CategoryBean category) {
                    this.category = category;
                }

                public static class CategoryBean {
                    private int id;
                    private String title;
                    private String normal;
                    private String normal_hl;
                    private String image_lab;
                    private String image_experiment;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getNormal() {
                        return normal;
                    }

                    public void setNormal(String normal) {
                        this.normal = normal;
                    }

                    public String getNormal_hl() {
                        return normal_hl;
                    }

                    public void setNormal_hl(String normal_hl) {
                        this.normal_hl = normal_hl;
                    }

                    public String getImage_lab() {
                        return image_lab;
                    }

                    public void setImage_lab(String image_lab) {
                        this.image_lab = image_lab;
                    }

                    public String getImage_experiment() {
                        return image_experiment;
                    }

                    public void setImage_experiment(String image_experiment) {
                        this.image_experiment = image_experiment;
                    }
                }
            }
        }

        public static class FeedsAdBean {
            private String image;
            private int type;


            private PostBean post;


            private AdvertisementBean advertisement;


            private CoverBean cover;

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public PostBean getPost() {
                return post;
            }

            public void setPost(PostBean post) {
                this.post = post;
            }

            public AdvertisementBean getAdvertisement() {
                return advertisement;
            }

            public void setAdvertisement(AdvertisementBean advertisement) {
                this.advertisement = advertisement;
            }

            public CoverBean getCover() {
                return cover;
            }

            public void setCover(CoverBean cover) {
                this.cover = cover;
            }

            public static class PostBean {
                private int id;
                private int genre;
                private String title;
                private String description;
                private int publish_time;
                private String image;
                private int start_time;
                private int comment_count;
                private int praise_count;
                private Object super_tag;
                private int page_style;
                private int post_id;
                private String appview;
                private String film_length;
                private String datatype;


                private CategoryBean category;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getGenre() {
                    return genre;
                }

                public void setGenre(int genre) {
                    this.genre = genre;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public int getPublish_time() {
                    return publish_time;
                }

                public void setPublish_time(int publish_time) {
                    this.publish_time = publish_time;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public int getStart_time() {
                    return start_time;
                }

                public void setStart_time(int start_time) {
                    this.start_time = start_time;
                }

                public int getComment_count() {
                    return comment_count;
                }

                public void setComment_count(int comment_count) {
                    this.comment_count = comment_count;
                }

                public int getPraise_count() {
                    return praise_count;
                }

                public void setPraise_count(int praise_count) {
                    this.praise_count = praise_count;
                }

                public Object getSuper_tag() {
                    return super_tag;
                }

                public void setSuper_tag(Object super_tag) {
                    this.super_tag = super_tag;
                }

                public int getPage_style() {
                    return page_style;
                }

                public void setPage_style(int page_style) {
                    this.page_style = page_style;
                }

                public int getPost_id() {
                    return post_id;
                }

                public void setPost_id(int post_id) {
                    this.post_id = post_id;
                }

                public String getAppview() {
                    return appview;
                }

                public void setAppview(String appview) {
                    this.appview = appview;
                }

                public String getFilm_length() {
                    return film_length;
                }

                public void setFilm_length(String film_length) {
                    this.film_length = film_length;
                }

                public String getDatatype() {
                    return datatype;
                }

                public void setDatatype(String datatype) {
                    this.datatype = datatype;
                }

                public CategoryBean getCategory() {
                    return category;
                }

                public void setCategory(CategoryBean category) {
                    this.category = category;
                }

                public static class CategoryBean {
                    private int id;
                    private String title;
                    private String normal;
                    private String normal_hl;
                    private String image_lab;
                    private String image_experiment;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getNormal() {
                        return normal;
                    }

                    public void setNormal(String normal) {
                        this.normal = normal;
                    }

                    public String getNormal_hl() {
                        return normal_hl;
                    }

                    public void setNormal_hl(String normal_hl) {
                        this.normal_hl = normal_hl;
                    }

                    public String getImage_lab() {
                        return image_lab;
                    }

                    public void setImage_lab(String image_lab) {
                        this.image_lab = image_lab;
                    }

                    public String getImage_experiment() {
                        return image_experiment;
                    }

                    public void setImage_experiment(String image_experiment) {
                        this.image_experiment = image_experiment;
                    }
                }
            }

            public static class AdvertisementBean {
                private String feedback_url;
                private int ad_location;
                private int ad_type;
                private String ad_url;
                private int title_reveal;
                private String ad_icon_url;

                public String getFeedback_url() {
                    return feedback_url;
                }

                public void setFeedback_url(String feedback_url) {
                    this.feedback_url = feedback_url;
                }

                public int getAd_location() {
                    return ad_location;
                }

                public void setAd_location(int ad_location) {
                    this.ad_location = ad_location;
                }

                public int getAd_type() {
                    return ad_type;
                }

                public void setAd_type(int ad_type) {
                    this.ad_type = ad_type;
                }

                public String getAd_url() {
                    return ad_url;
                }

                public void setAd_url(String ad_url) {
                    this.ad_url = ad_url;
                }

                public int getTitle_reveal() {
                    return title_reveal;
                }

                public void setTitle_reveal(int title_reveal) {
                    this.title_reveal = title_reveal;
                }

                public String getAd_icon_url() {
                    return ad_icon_url;
                }

                public void setAd_icon_url(String ad_icon_url) {
                    this.ad_icon_url = ad_icon_url;
                }
            }

            public static class CoverBean {
                private String image;
                private String title;

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
            }
        }

        public static class ColumnsBean {
            private int id;
            private String name;
            private String description;
            private boolean subscribe_status;
            private String icon;
            private String image;
            private String image_large;
            private String content_provider;
            private int show_type;
            private int genre;
            private int subscriber_num;
            private int post_count;
            private String sort_time;
            private String column_tag;


            private ShareBean share;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public boolean isSubscribe_status() {
                return subscribe_status;
            }

            public void setSubscribe_status(boolean subscribe_status) {
                this.subscribe_status = subscribe_status;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getImage_large() {
                return image_large;
            }

            public void setImage_large(String image_large) {
                this.image_large = image_large;
            }

            public String getContent_provider() {
                return content_provider;
            }

            public void setContent_provider(String content_provider) {
                this.content_provider = content_provider;
            }

            public int getShow_type() {
                return show_type;
            }

            public void setShow_type(int show_type) {
                this.show_type = show_type;
            }

            public int getGenre() {
                return genre;
            }

            public void setGenre(int genre) {
                this.genre = genre;
            }

            public int getSubscriber_num() {
                return subscriber_num;
            }

            public void setSubscriber_num(int subscriber_num) {
                this.subscriber_num = subscriber_num;
            }

            public int getPost_count() {
                return post_count;
            }

            public void setPost_count(int post_count) {
                this.post_count = post_count;
            }

            public String getSort_time() {
                return sort_time;
            }

            public void setSort_time(String sort_time) {
                this.sort_time = sort_time;
            }

            public String getColumn_tag() {
                return column_tag;
            }

            public void setColumn_tag(String column_tag) {
                this.column_tag = column_tag;
            }

            public ShareBean getShare() {
                return share;
            }

            public void setShare(ShareBean share) {
                this.share = share;
            }

            public static class ShareBean {
                private String url;
                private String title;
                private String text;
                private String image;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }
            }
        }
    }
}
