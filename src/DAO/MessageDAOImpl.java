package DAO;

import Model.Message;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Gvozd on 15.06.2016.
 */
public class MessageDAOImpl implements MessageDAO {
    LinkedList<Message> messagesData = new LinkedList<>();

    @Override
    public boolean addMessage(Message message) {
        return false;
    }

    @Override
    public List getMessageList() {
        return null;
    }

    @Override
    public int getMessageCount() {
        return 0;
    }
}
