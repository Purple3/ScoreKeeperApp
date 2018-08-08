package com.purple3.scorekeeperapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_score_keeper_main.*

class ScoreKeeperMainActivity : AppCompatActivity() {

    companion object {
       var teamAScore : Int = 0
        var teamBScore : Int = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score_keeper_main)

    }

    fun scoreIncTeamA(view:View){
        teamAScore ++
        tv_teamAScore.setText(teamAScore.toString())
    }

    fun scoreIncTeamB(view:View){
        teamBScore ++
        tv_teamBScore.setText(teamBScore.toString())
    }

    fun onRestartGame(view:View){

        teamAScore = 0
        teamBScore  = 0
        tv_teamAScore.setText(teamAScore.toString())
        tv_teamBScore.setText(teamBScore.toString())

    }
}
