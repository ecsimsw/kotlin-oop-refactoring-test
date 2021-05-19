package racingcar.domain.car

import java.util.*
import kotlin.streams.toList

class Cars(cars: List<Car>) {
    private val random = Random()
    private val cars: List<Car> = cars

    fun moveCars() {
        cars.stream()
            .forEach { it.tryToMove(random.nextInt(10)) }
    }

    fun findWinners(): Cars {
        val maxPosition = findMaxPosition()
        return Cars(cars.stream()
            .filter { it.isIn(maxPosition) }
            .toList())
    }

    private fun findMaxPosition(): Int {
        return cars.stream()
            .mapToInt { it.position() }
            .max()
            .orElseGet { 0 }
    }

    fun cars(): List<Car> {
        return cars
    }
}

