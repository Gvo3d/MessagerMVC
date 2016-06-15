package Structure;

import Model.Message;

import java.util.List;

/**
 * Created by Gvozd on 15.06.2016.
 */
public class Queue implements MessageQueue{
    private static int messageCounter=0;

    @Override
    public void addMessage() {

    }

    @Override
    public List<Message> getMessageList() {
        return null;
    }

    @Override
    public void clearMessageList() {

    }

    private void pollMessage() {

    }
}
