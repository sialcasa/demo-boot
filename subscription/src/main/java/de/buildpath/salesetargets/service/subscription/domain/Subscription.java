package de.buildpath.salesetargets.service.subscription.domain;

public class Subscription {

    private final long id;
    private final String content;

    public Subscription(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}