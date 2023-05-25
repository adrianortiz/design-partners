package com.codizer.creational.prototype;

public class Document implements Cloneable {

    private String paragraph1;
    private String paragraph2;
    private String paragraph3;

    public Document() {
        super();
    }

    public String getParagraph1() {
        return paragraph1;
    }

    public void setParagraph1(String paragraph1) {
        this.paragraph1 = paragraph1;
    }

    public String getParagraph2() {
        return paragraph2;
    }

    public void setParagraph2(String paragraph2) {
        this.paragraph2 = paragraph2;
    }

    public String getParagraph3() {
        return paragraph3;
    }

    public void setParagraph3(String paragraph3) {
        this.paragraph3 = paragraph3;
    }

    public Object clone() {

        Document newDocument = new Document();
        newDocument.setParagraph1(this.getParagraph1());
        newDocument.setParagraph2(this.getParagraph2());
        newDocument.setParagraph3(this.getParagraph3());

        return newDocument;
    }
}
