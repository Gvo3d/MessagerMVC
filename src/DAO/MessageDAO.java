package DAO;

import Model.Message;

import java.util.List;

/**
 * Created by Gvozd on 15.06.2016.
 */
public interface MessageDAO {

    public void addMessage(Message message);

    public List getMessageList();

    public int getMessageCount();
}
