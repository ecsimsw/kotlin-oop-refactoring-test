package racingcar

import racingcar.controller.RacingGame
import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val racingGame = RacingGame(scanner)
    racingGame.playGame()
}