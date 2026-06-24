package dev.kaldiroglu.fpj.ch02.domain;

public class Message {
    private String text;

    public Message() {
        this.text = "(empty)";
    }

    public Message(String text) {
        this.text = text;
    }

    public Message(String prefix, String body, int n) {
        this.text = (prefix + body).repeat(n);
    }

    public void show() {
        System.out.println("Message: " + text);
    }

    public void setText(String t) {
        this.text = t;
    }

    @Override
    public String toString() {
        return "Message[" + text + "]";
    }
}