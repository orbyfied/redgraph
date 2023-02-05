package net.orbyfied.redgraph.world;

public enum Facing {

    NORTH(0, 0, 1),
    SOUTH(0, 0, -1),

    EAST(1, 0, 0),
    WEST(-1, 0, 0),

    UP(0, 1, 0),
    DOWN(0, -1, 0)

    ;

    // the offsets
    final int offX;
    final int offY;
    final int offZ;

    // the opposite
    Facing opposite;

    Facing(int offX, int offY, int offZ) {
        this.offX = offX;
        this.offY = offY;
        this.offZ = offZ;

        this.opposite = null;
    }

    public int getOffX() {
        return offX;
    }

    public int getOffY() {
        return offY;
    }

    public int getOffZ() {
        return offZ;
    }

}
