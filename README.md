#redgraph
####🥶 Epic redstone graph compiler for analyzation.

Redgraph analyzes a redstone circuit and generates a
graph-like structure that can be analyzed or simulated.

### Internal Working
#### World Access
World access is abstracted away to allow other sources
of block data, like from schematic files or manual
input.  

The world access implementation will read block data
at the position given to it and construct the appropriate `NodeConfiguration`
based on that data.

#### Compilation
The `GraphCompiler` instance is responsible for compilation
of the circuit. 

It receives one block to start with. From there it will look
for the possible inputs and outputs of that block through the
support methods of the
