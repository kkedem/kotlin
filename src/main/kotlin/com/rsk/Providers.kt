package main.kotlin.com.rsk

/**
 * Created by kiredem on 5/18/17.
 */
class Providers {

    fun getProviders() : List<java.security.Provider> {
        val providers = java.security.Security.getProviders()
        val listProviders:List<java.security.Provider> = providers.asList()
        return listProviders
    }

}