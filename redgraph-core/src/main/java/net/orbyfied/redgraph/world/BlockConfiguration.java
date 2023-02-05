package net.orbyfied.redgraph.world;

import net.orbyfied.redgraph.CircuitNodeType;

import java.util.List;

/**
 * Represents the persistent, descriptive state of
 * a node. This includes facing, connections, contents, etc.
 * But excludes powered state and other reactive elements.
 */
public abstract class BlockConfiguration {

    /**
     * The block this node covers.
     */
    final WorldBlock block;

    public BlockConfiguration(WorldBlock block) {
        this.block = block;
    }

    public WorldBlock getBlock() {
        return block;
    }

    /**
     * Get the node type of this block configuration.
     *
     * @return The node type or null if absent.
     */
    public abstract CircuitNodeType<?> getNodeType();

    /**
     * Generate the possible outputs of from this block
     * into the given list.
     *
     * @param list The list.
     */
    public abstract void generateOutputs(List<BlockPosition> list);

}
