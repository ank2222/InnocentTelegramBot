package com.puzan.telegrambot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Post {

    private String kind;
    private Url url;
    private Context context;
    private SearchInformation searchInformation;
    private List<Item> items = new ArrayList<>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Post() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Url getUrl() {
        return url;
    }

    public void setUrl(Url url) {
        this.url = url;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public SearchInformation getSearchInformation() {
        return searchInformation;
    }

    public void setSearchInformation(SearchInformation searchInformation) {
        this.searchInformation = searchInformation;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public class Context {

        private String title;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    public static class Image {
        public Image() {
        }

        private String contextLink;
        private int height;
        private int width;
        private int byteSize;
        private String thumbnailLink;
        private int thumbnailHeight;
        private int thumbnailWidth;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public String getContextLink() {
            return contextLink;
        }

        public void setContextLink(String contextLink) {
            this.contextLink = contextLink;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getByteSize() {
            return byteSize;
        }

        public void setByteSize(int byteSize) {
            this.byteSize = byteSize;
        }

        public String getThumbnailLink() {
            return thumbnailLink;
        }

        public void setThumbnailLink(String thumbnailLink) {
            this.thumbnailLink = thumbnailLink;
        }

        public int getThumbnailHeight() {
            return thumbnailHeight;
        }

        public void setThumbnailHeight(int thumbnailHeight) {
            this.thumbnailHeight = thumbnailHeight;
        }

        public int getThumbnailWidth() {
            return thumbnailWidth;
        }

        public void setThumbnailWidth(int thumbnailWidth) {
            this.thumbnailWidth = thumbnailWidth;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    public static class Item {

        private String kind;
        private String title;
        private String htmlTitle;
        private String link;
        private String displayLink;
        private String snippet;
        private String htmlSnippet;
        private String mime;
        private String fileFormat;
        private Image image;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public Item() {
        }

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getHtmlTitle() {
            return htmlTitle;
        }

        public void setHtmlTitle(String htmlTitle) {
            this.htmlTitle = htmlTitle;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getDisplayLink() {
            return displayLink;
        }

        public void setDisplayLink(String displayLink) {
            this.displayLink = displayLink;
        }

        public String getSnippet() {
            return snippet;
        }

        public void setSnippet(String snippet) {
            this.snippet = snippet;
        }

        public String getHtmlSnippet() {
            return htmlSnippet;
        }

        public void setHtmlSnippet(String htmlSnippet) {
            this.htmlSnippet = htmlSnippet;
        }

        public String getMime() {
            return mime;
        }

        public void setMime(String mime) {
            this.mime = mime;
        }

        public String getFileFormat() {
            return fileFormat;
        }

        public void setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
        }

        public Image getImage() {
            return image;
        }

        public void setImage(Image image) {
            this.image = image;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }


    public class SearchInformation {

        private float searchTime;
        private String formattedSearchTime;
        private String totalResults;
        private String formattedTotalResults;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public float getSearchTime() {
            return searchTime;
        }

        public void setSearchTime(float searchTime) {
            this.searchTime = searchTime;
        }

        public String getFormattedSearchTime() {
            return formattedSearchTime;
        }

        public void setFormattedSearchTime(String formattedSearchTime) {
            this.formattedSearchTime = formattedSearchTime;
        }

        public String getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(String totalResults) {
            this.totalResults = totalResults;
        }

        public String getFormattedTotalResults() {
            return formattedTotalResults;
        }

        public void setFormattedTotalResults(String formattedTotalResults) {
            this.formattedTotalResults = formattedTotalResults;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    public static class Url {

        private String type;
        private String template;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }


}

