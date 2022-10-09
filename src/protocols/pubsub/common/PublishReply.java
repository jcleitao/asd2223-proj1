package protocols.pubsub.common;

import java.util.UUID;

import pt.unl.fct.di.novasys.babel.generic.ProtoReply;

public class PublishReply extends ProtoReply {

    public static final short REQUEST_ID = 203;

    private final String topic;
    private final UUID msgId;

    public PublishReply(String topic, UUID id) {
        super(REQUEST_ID);
        this.topic = topic;
        this.msgId = id;
    }

    public String getTopic() {
        return this.topic;
    }
    
    public UUID getMsgID() {
    	return this.msgId;
    }

}
