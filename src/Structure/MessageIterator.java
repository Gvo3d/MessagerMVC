package Structure;

import java.util.Iterator;

public class MessageIterator implements Iterator<MessageNode> {
    private MessageNode iterableNode;

    public MessageIterator(MessageNode firstNode) {
        iterableNode = firstNode;
    }

    @Override
    public boolean hasNext() {
        return (iterableNode!=null);
    }

    @Override
    public MessageNode next() {
        MessageNode tempNode = iterableNode;
        iterableNode = iterableNode.getNext();
        return tempNode;
    }
}