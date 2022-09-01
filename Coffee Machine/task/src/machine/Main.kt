package machine

fun main() {

    val cofeeMachine = CoffeeMachine()
    cofeeMachine.interfaceMachine()

}


class CoffeeMachine(
    var water: Int = 400, var milk: Int = 540, var beans: Int = 120, var money: Int = 550, var discups: Int = 9
) {


    fun state() {
        val p: Pair<Boolean, String> = Pair(true, "apple")
        println(
            "The coffee machine has:\n" + "$water ml of water\n" + "$milk ml of milk\n" + "$beans of coffee beans\n" + "$discups disposable cups\n" + "$$money of money"
        )
    }

    fun interfaceMachine() {
        while (true) {
            println("Write action (buy, fill, take, remaining, exit):")
            var act = readln()
            when (act) {
                "buy" -> getCoffe()
                "fill" -> getResourses()
                "take" -> takeMoney()
                "remaining" -> state()
                "exit" -> return
                else -> return
            }
        }
    }

    fun takeMoney() {
        println("I gave you $$money")
        money = 0
    }
/*
 For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
 For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
 And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
 */

    fun getCoffe() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
        val kind = readln()
        when (kind) {
            "1" -> getEspresso()
            "2" -> getLatte()
            "3" -> getCappuccino()
            else -> println("Wrong kind")
        }
    }

    fun getEspresso() {
        // needs 250 ml of water and 16 g of coffee beans. It costs $4.
        val mess = checkResources(250, 0, 16)
        if (mess.first) {
            println(mess.second)
            decrementResources(250, 0, 16)
            money += 4
        } else {
            println(mess.second)
        }
    }

    fun getLatte() {
        //  350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
        val mess = checkResources(350, 75, 20)
        if (mess.first) {
            println(mess.second)
            decrementResources(350, 75, 20)
            money += 7
        } else {
            println(mess.second)
        }
    }

    fun getCappuccino() {
        // 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6
        val mess: Pair<Boolean, String> = checkResources(200, 100, 12)
        if (mess.first) {
            println(mess.second)
            decrementResources(200, 100, 12)
            money += 6
        }
    }

    fun decrementResources(_water: Int, _milk: Int, _beans: Int) {
        water -= _water
        milk -= _milk
        beans -= _beans
        discups--
    }

    fun checkResources(_water: Int, _milk: Int, _beans: Int): Pair<Boolean, String> {
        var mess: Pair<Boolean, String>
        if (water < _water) {
            mess = Pair(false, "Sorry, not enough water!")
        } else if (milk < _milk) {
            mess = Pair(false, "Sorry, not enough milk!")
        } else if (beans < _beans) {
            mess = Pair(false, "Sorry, not enough coffee beans!")
        } else if (discups == 0) {
            mess = Pair(false, "Sorry, not enough disposable cups!")
        } else {
            mess = Pair(true, "I have enough resources, making you a coffee!")
        }

        return mess
    }

    fun getResourses() {
        println("Write how many ml of water the coffee machine has:")
        water += readln().toInt()
        println("Write how many ml of milk the coffee machine has:")
        milk += readln().toInt()
        println("Write how many grams of coffee beans the coffee machine has:")
        beans += readln().toInt()
        println("Write how many disposable cups of coffee do you want to add:")
        discups += readln().toInt()
    }


}
