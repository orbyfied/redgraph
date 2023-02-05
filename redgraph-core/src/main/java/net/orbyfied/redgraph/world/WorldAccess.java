package net.orbyfied.redgraph.world;

import net.orbyfied.redgraph.Redgraph;

/**
 * Abstracts away all world access, so you
 * can simplify graphs from any source.
 */
public interface WorldAccess {

    /**
     * Get a default {@link WorldBlock} instance at
     * the given position in this world.
     *
     * @param position The position.
     * @return The block instance.
     */
    default WorldBlock getBlock(BlockPosition position) {
        return new WorldBlock(this, position);
    }

    /**
     * Get or create the node configuration at the given
     * position.
     *
     * This expects the configuration to include the appropriate
     * node type, found by ID or otherwise through the provider
     * instance given.
     *
     * @see BlockConfiguration
     *
     * Should produce null if no configuration is available
     * for the block at the given position.
     *
     * @param provider The Redgraph instance.
     * @param position The position.
     * @return The configuration or null if absent.
     */
    BlockConfiguration getConfiguration(Redgraph provider,
                                        BlockPosition position);

}
