package com.example.demo;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MessageBundle {
    public enum MessageType {

        CODE("CODE"), DESC("DESC");

        private String value;

        MessageType(String value) {
            this.value = value;
        }
    }

    @Resource(name = "messageSourceDesc")
    private MessageSource messageSourceDesc;

    @Resource(name = "messageSourceCode")
    private MessageSource messageSourceCode;

    public String getMessage(String key, Object[] args) {
        return getMessage(MessageType.CODE, key, args);
    }

    public String getMessage(String key) {
        return getMessage(MessageType.DESC, key, null);
    }

    public String getMessage(MessageType type, String key, Object[] args) {
        return getMessage(type, key, "Default Message", args);
    }

    public String getMessage(MessageType type, String key, String defaultMessage, Object[] args) {
        if (type.equals(MessageType.DESC))
            return messageSourceDesc.getMessage(key, args, defaultMessage, LocaleContextHolder.getLocale());
        else if (type.equals(MessageType.CODE))
            return messageSourceCode.getMessage(key, args, defaultMessage, LocaleContextHolder.getLocale());
        else
            return messageSourceCode.getMessage(key, args, defaultMessage, LocaleContextHolder.getLocale());
    }

}