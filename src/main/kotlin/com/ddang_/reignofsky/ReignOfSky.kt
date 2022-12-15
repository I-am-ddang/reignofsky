package com.ddang_.reignofsky

import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.plugin.Plugin
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.scheduler.BukkitScheduler

class ReignOfSky : JavaPlugin() {

    companion object {
        /**
         * String 리시버이며, 버킷에 info 로 로그를 남깁니다.
         */
        fun String.info() = Bukkit.getLogger().info(this)

        /**
         * String 리시버이며, 버킷에 warning 으로 로그를 남깁니다.
         */
        fun String.warn() = Bukkit.getLogger().warning(this)

        /**
         * String 리시버이며, 모든 플레이어에게 메시지를 제공합니다.
         */
        fun String.broad() = Bukkit.broadcastMessage(this)

        /**
         * String 리시버이며, 버킷에 메시지를 보냅니다.
         */
        fun String.bukkitSend() = Bukkit.getConsoleSender().sendMessage(this)

        /**
         * Long 리시버이며, 주기적으로 동기 작업을 실행합니다.
         */
        fun Long.rt(delay: Long = 1, run: Runnable) = scheduler.runTaskTimer(instance, run, delay, this)

        /**
         * Long 리시버이며, 주기적으로 비동기 작업을 실행합니다.
         */
        fun Long.rtAsync(delay: Long = 1, run: Runnable) = scheduler
            .runTaskTimerAsynchronously(instance, run, delay, this)

        /**
         * Long 리시버이며, 작업을 비동기로 실행합니다.
         */
        fun rAsync(run: Runnable) = scheduler.runTaskAsynchronously(instance, run)

        /**
         * Long 리시버이며, 작업을 동기로 실행합니다.
         */
        fun r(run: Runnable) = scheduler.runTask(instance, run)

        /**
         * Long 리시버이며, 작업을 입력한 Long 값 뒤에 실행합니다.
         */
        fun Long.rl(run: Runnable) = scheduler.runTaskLater(instance, run, this)

        /**
         * Long 리시버이며, 작업을 입력한 Long 값 뒤에 비동기로 실행합니다.
         */
        fun Long.rlAsync(run: Runnable) = scheduler.runTaskLaterAsynchronously(instance, run, this)

        /**
         * 해당 플러그인의 인스턴스를 반환합니다.
         */
        lateinit var instance: Plugin

        /**
         * 해당 플러그인의 스케쥴러를 반환합니다.
         */
        lateinit var scheduler: BukkitScheduler

        /**
         * 해당 플러그인의 온라인 플레이어를 반환합니다.
         */
        lateinit var players: MutableCollection<out Player>

        /**
         * reignOfSkyCore 를 나타내는 변수입니다.
         */
        val reignOfSkyCore = ReignOfSkyCore()
    }

    override fun onLoad() {

    }

    override fun onEnable() {
    }

    override fun onDisable() {
    }
}