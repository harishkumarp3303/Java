package Reflection;

import java.time.LocalDate;

public class Message {

    private String content;

    private LocalDate localDate;

    private String status;

    public String send(){
        return content;
    }

    public String messageStatus(){
        return status;
    }

    public Message() {
    }

    public Message(String content, LocalDate localDate, String status) {
        this.content = content;
        this.localDate = localDate;
        this.status = status;
    }

    
    
}
