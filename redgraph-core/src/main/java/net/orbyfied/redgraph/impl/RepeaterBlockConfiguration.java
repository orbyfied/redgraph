package net.orbyfied.redgraph.impl;

import net.orbyfied.redgraph.CircuitNodeType;
import net.orbyfied.redgraph.world.BlockConfiguration;
import net.orbyfied.redgraph.world.BlockPosition;
import net.orbyfied.redgraph.world.Facing;
import net.orbyfied.redgraph.world.WorldBlock;

import java.util.List;

public class RepeaterBlockConfiguration extends BlockConfiguration {

    // the direction it is facing
    Facing facing;
    // the tick delay
    int delay;

    public RepeaterBlockConfiguration(WorldBlock block, Facing facing, int delay) {
        super(block);
        this.facing = facing;
        this.delay = delay;
    }

    public int getDelay() {
        return delay;
    }

    public Facing getFacing() {
        return facing;
    }

    @Override
    public CircuitNodeType<?> getNodeType() {
        return RepeaterNodeType.INSTANCE;
    }

    @Override
    public void generateOutputs(List<BlockPosition> list) {
        //
        list.add(getBlock().getPosition().face(facing));
    }

}
