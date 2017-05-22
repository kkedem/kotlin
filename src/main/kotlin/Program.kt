package main.kotlin

import main.kotlin.com.rsk.Providers

/**
 * Created by kiredem on 5/16/17.
 */


fun main(args : Array<String>) {

    val providers = Providers()

    val allProviders = providers.getProviders()
    val it = allProviders.iterator()

    while(it.hasNext()) {
        val provider = it.next()
        println(provider.name)
        provider.forEach { key, value -> println("\t$key: $value") }
    }

}

fun listProviders() {
    val providers = getProviders();

    val it = providers.iterator()

    while(it.hasNext()) {
        val provider = it.next()
        println(provider.name)
        provider.forEach { key, value -> println("\t$key: $value") }
    }
}