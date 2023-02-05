package net.orbyfied.redgraph.world;

public class WorldBlock {

    // the world
    final WorldAccess world;
    // the position in the world
    final BlockPosition position;

    public WorldBlock(WorldAccess world,
                      BlockPosition position) {
        this.world = world;
        this.position = position;
    }

    public WorldAccess getWorld() {
        return world;
    }

    public BlockPosition getPosition() {
        return position;
    }

}
