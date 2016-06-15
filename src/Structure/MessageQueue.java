package Structure;

import Model.Message;

import java.util.List;

/**
 * Created by Gvozd on 15.06.2016.
 */
public interface MessageQueue {

    public void addMessage();

    public List<Message>getMessageList();

    public void clearMessageList();

}
