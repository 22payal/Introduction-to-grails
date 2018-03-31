package graile_begin

import grails.util.Holders

class BootStrap
{
    def init = { servletContext ->
        log.info("**********************************************")
        println(Holders.grailsApplication.config.server.contextPath)
    }
    def destroy = {
    }

    @Override
    String toString() {
        println("name :")
    }
}
