package com.AshesKaiser.AshesPlugin

import org.bukkit.Bukkit
import org.bukkit.scoreboard.Score


class Scoreboard {
    @SuppressWarnings("Deprecated")
    private val manager = Bukkit.getScoreboardManager()
    private val board = manager!!.newScoreboard

    private val o = board.registerNewObjective("lives", "dummy")

    fun setScore(){
        for (online in Bukkit.getOnlinePlayers()) {
            val score: Score = o.getScore(online)
            score.score = Vars.money[online]!!
        }

        for (online in Bukkit.getOnlinePlayers()) {
            online.scoreboard = board
        }
    }

}