package com.nukkitx.protocol.bedrock.v313.serializer;

import com.nukkitx.network.VarInts;
import com.nukkitx.protocol.bedrock.packet.ChunkRadiusUpdatedPacket;
import com.nukkitx.protocol.serializer.PacketSerializer;
import io.netty.buffer.ByteBuf;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ChunkRadiusUpdatedSerializer_v313 implements PacketSerializer<ChunkRadiusUpdatedPacket> {
    public static final ChunkRadiusUpdatedSerializer_v313 INSTANCE = new ChunkRadiusUpdatedSerializer_v313();

    @Override
    public void serialize(ByteBuf buffer, ChunkRadiusUpdatedPacket packet) {
        VarInts.writeInt(buffer, packet.getRadius());
    }

    @Override
    public void deserialize(ByteBuf buffer, ChunkRadiusUpdatedPacket packet) {
        packet.setRadius(VarInts.readInt(buffer));
    }
}
