package fiskfille.tf.common.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import fiskfille.tf.common.energon.power.IEnergyTransmitter;
import fiskfille.tf.common.energon.power.TargetReceiver;
import fiskfille.tf.common.energon.power.TransmissionHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.HashSet;
import java.util.Set;

public class MessageSetReceivers implements IMessage
{
    private int x;
    private int y;
    private int z;
    private Set<TargetReceiver> receivers = new HashSet<TargetReceiver>();

    public MessageSetReceivers()
    {

    }

    public MessageSetReceivers(int x, int y, int z, Set<TargetReceiver> receivers)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.receivers = receivers;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        x = buf.readInt();
        y = buf.readInt();
        z = buf.readInt();
        int count = buf.readInt();

        for (int i = 0; i < count; ++i)
        {
            receivers.add(TargetReceiver.fromBytes(buf));
        }
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
        buf.writeInt(receivers.size());

        for (TargetReceiver receiver : receivers)
        {
            receiver.toBytes(buf);
        }
    }

    public static class Handler implements IMessageHandler<MessageSetReceivers, IMessage>
    {
        @Override
        public IMessage onMessage(MessageSetReceivers message, MessageContext ctx)
        {
            if (ctx.side.isServer())
            {
                EntityPlayer player = ctx.getServerHandler().playerEntity;
                World world = player.worldObj;

                TileEntity tile = world.getTileEntity(message.x, message.y, message.z);

                if (tile instanceof IEnergyTransmitter && (!(tile instanceof ISidedInventory) || ((ISidedInventory) tile).isUseableByPlayer(player)))
                {
                    IEnergyTransmitter transmitter = (IEnergyTransmitter) tile;
                    TransmissionHandler transmissionHandler = transmitter.getTransmissionHandler();

                    transmissionHandler.reset(world, message.receivers);
                }
            }

            return null;
        }
    }
}