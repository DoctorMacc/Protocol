package com.nukkitx.protocol.bedrock.v354.serializer;

import com.nukkitx.network.VarInts;
import com.nukkitx.protocol.bedrock.packet.MapInfoRequestPacket;
import com.nukkitx.protocol.serializer.PacketSerializer;
import io.netty.buffer.ByteBuf;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MapInfoRequestSerializer_v354 implements PacketSerializer<MapInfoRequestPacket> {
    public static final MapInfoRequestSerializer_v354 INSTANCE = new MapInfoRequestSerializer_v354();


    @Override
    public void serialize(ByteBuf buffer, MapInfoRequestPacket packet) {
        VarInts.writeLong(buffer, packet.getUniqueMapId());
    }

    @Override
    public void deserialize(ByteBuf buffer, MapInfoRequestPacket packet) {
        packet.setUniqueMapId(VarInts.readLong(buffer));
    }
}
