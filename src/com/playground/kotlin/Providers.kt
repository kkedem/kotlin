package com.playground.kotlin

import java.security.Provider
import java.security.Security

/**
 * Created by kiredem on 5/16/17.
 */


fun getProviders() : List<Provider> {
    val providers = Security.getProviders()
    val listProviders:List<Provider> = providers.asList()
    return listProviders
}