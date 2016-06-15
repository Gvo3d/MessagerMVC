package DAO;

import Model.Message;
import Structure.MessageQueueImpl;

import java.util.List;

/**
 * Created by Gvozd on 15.06.2016.
 */
public class MessageDAOImpl implements MessageDAO {
    MessageQueueImpl messages = new MessageQueueImpl();
    private int messagesCount=0;

    @Override
    public void addMessage(Message message) {
        messages.addMessage(message);
        messagesCount++;
    }

    @Override
    public List getMessageList() {
        return messages.getMessageList();
    }

    @Override
    public int getMessageCount() {
        return messagesCount;
    }
}
