package tomato.backend.data;

import packets.incoming.MapInfoPacket;
import packets.incoming.NotificationPacket;

import java.util.ArrayList;
import java.util.HashMap;

public class DpsData {

    public MapInfoPacket map;
    public HashMap<Integer, Entity> hitList;
    public ArrayList<NotificationPacket> deathNotifications;

    public DpsData(MapInfoPacket m, HashMap<Integer, Entity> entityHitList, ArrayList<NotificationPacket> deathNotifications) {
        this.map = m;
        this.hitList = entityHitList;
        this.deathNotifications = deathNotifications;
    }
}
