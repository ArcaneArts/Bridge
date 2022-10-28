package art.arcane.bridge.api;

import com.sun.istack.internal.NotNull;

public interface Server {
    /**
     * Gets the name of this server implementation.
     *
     * @return name of this server implementation
     */
    @NotNull
    String getName();

    /**
     * Gets the version string of this server implementation.
     *
     * @return version of this server implementation
     */
    @NotNull
    String getVersion();

    /**
     * Get the maximum amount of players which can login to this server.
     *
     * @return the amount of players this server allows
     */
    int getMaxPlayers();

    /**
     * Get the game port that the server runs on.
     *
     * @return the port number of this server
     */
    int getPort();

    /**
     * Get the view distance from this server.
     *
     * @return the view distance from this server.
     */
    int getViewDistance();

    /**
     * Get the simulation distance from this server.
     *
     * @return the simulation distance from this server.
     */
    int getSimulationDistance();

    /**
     * Get the IP that this server is bound to, or empty string if not
     * specified.
     *
     * @return the IP string that this server is bound to, otherwise empty
     *     string
     */
    @NotNull
    String getIp();
}
