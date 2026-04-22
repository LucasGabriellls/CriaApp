package com.app.Cria.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class Chat {

    private Long id;

    private String from;
    private String message;
    private LocalDateTime sendDate;
    private Boolean isRead;

    public Chat() {}

    public Chat(Long id, String from, String message, LocalDateTime sendDate, Boolean isRead) {
        this.id = id;
        this.from = from;
        this.message = message;
        this.sendDate = sendDate;
        this.isRead = isRead;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = sendDate;
    }

    public Boolean isRead() {
        return isRead;
    }

    public void setRead(Boolean read) {
        isRead = read;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return isRead == chat.isRead && Objects.equals(id, chat.id) && Objects.equals(from, chat.from) && Objects.equals(message, chat.message) && Objects.equals(sendDate, chat.sendDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, message, sendDate, isRead);
    }
}
