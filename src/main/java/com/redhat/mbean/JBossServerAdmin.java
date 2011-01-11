package com.redhat.mbean;

import org.jboss.bootstrap.microcontainer.ServerImpl;
import org.jboss.bootstrap.spi.Server;

/**
 * Created by IntelliJ IDEA.
 * User: torben
 * Date: 1/11/11
 * Time: 10:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class JBossServerAdmin implements JBossServerAdminMBean {
    private Server server;

    public int killServer() {
        ((ServerImpl) server).halt();
        return 1;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }
}
