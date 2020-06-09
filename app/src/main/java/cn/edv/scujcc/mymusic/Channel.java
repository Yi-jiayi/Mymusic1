package cn.edv.scujcc.mymusic;

import java.util.Objects;

/**
 * 模型对象
 */

public class Channel {
    private String title;
    private String time;
    private int head;
    private String comments;
    private String quantity;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Channel channel = (Channel) o;
        return head == channel.head &&
                Objects.equals(title, channel.title) &&
                Objects.equals(time, channel.time) &&
                Objects.equals(comments, channel.comments) &&
                Objects.equals(quantity, channel.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, time, head, comments, quantity);
    }

    @Override
    public String toString() {
        return "Channel{" +
                "title='" + title + '\'' +
                ", time='" + time + '\'' +
                ", head=" + head +
                ", comments='" + comments + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
