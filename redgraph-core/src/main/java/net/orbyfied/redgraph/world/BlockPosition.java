package net.orbyfied.redgraph.world;

public class BlockPosition {

    // the x, y and z
    final long x;
    final long y;
    final long z;

    public BlockPosition(long x,
                         long y,
                         long z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long getZ() {
        return z;
    }

    /* Operations */

    public BlockPosition add(long dx, long dy, long dz) {
        return new BlockPosition(dx + x, dy + y, dz + z);
    }

    public BlockPosition sub(long dx, long dy, long dz) {
        return add(-dx, -dy, -dz);
    }

    public BlockPosition mul(double dx, double dy, double dz) {
        return new BlockPosition((long)(dx * x), (long)(dy * y), (long)(dz * z));
    }

    public BlockPosition div(double dx, double dy, double dz) {
        return new BlockPosition((long)(dx / x), (long)(dy / y), (long)(dz / z));
    }

    public BlockPosition face(Facing facing) {
        return add(facing.offX, facing.offY, facing.offZ);
    }

    public BlockPosition face(Facing facing, long magnitude) {
        return add(facing.offX * magnitude, facing.offY * magnitude, facing.offZ * magnitude);
    }

}
