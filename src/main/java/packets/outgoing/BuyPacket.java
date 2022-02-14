package packets.outgoing;

import packets.Packet;
import packets.buffer.PBuffer;

/**
 * Sent to buy an item.
 */
public class BuyPacket extends Packet {
    /**
     * The object id of the item being purchased.
     */
    public int objectId;
    /**
     * The number of items being purchased.
     */
    public int quantity;

    @Override
    public void deserialize(PBuffer buffer) throws Exception {
        objectId = buffer.readInt();
        quantity = buffer.readInt();
    }
}
