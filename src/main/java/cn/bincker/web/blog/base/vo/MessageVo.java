package cn.bincker.web.blog.base.vo;

import cn.bincker.web.blog.base.entity.Message;
import lombok.Data;

import java.util.Date;

@Data
public class MessageVo {
    private Long id;
    private String content;
    private Date createdDate;
    private BaseUserVo fromUser;
    private BaseUserVo toUser;
    private Boolean isRead;
    private String additionInfo;
    private Long relatedTargetId;
    private Long originalTargetId;
    private Long targetId;
    private Message.Type type;

    public MessageVo() {
    }

    public MessageVo(Message message) {
        this.id = message.getId();
        this.content = message.getContent();
        this.createdDate = message.getCreatedDate();
        if(message.getFromUser() != null) this.fromUser = new BaseUserVo(message.getFromUser());
        this.toUser = new BaseUserVo(message.getToUser());
        this.isRead = message.getIsRead();
        this.relatedTargetId = message.getRelatedTargetId();
        this.originalTargetId = message.getOriginalTargetId();
        this.targetId = message.getTargetId();
        this.type = message.getType();
    }
}
