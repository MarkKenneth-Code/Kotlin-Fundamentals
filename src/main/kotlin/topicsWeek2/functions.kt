fun main() {
    //function for ATMs
    // check balance -> your balance is ___
    // deposit -> you just deposited ___. Your new balance is: ___
    // withdrawal -> Your new balance is: ___

    //Deposit
    //you cannot deposit more than 5000
    //you cannot deposit an amount not divisible by 100
    // you cannot deposit negative amount

    //withdraw
    //you cannot withdraw more than half of the current balance amount
    //you cannot withdraw negative amount

    val account = mutableMapOf<String, Any>(
        "username" to "Brandon",
        "balance" to 0
    )

    println(checkBalance(account))
    println(deposit(account, 5000))
//    println(withdrawal(account, 1000))
}

fun checkBalance(account: MutableMap<String, Any>):String {
    return ("Your new balance is: ${account.getValue("balance")}")
}

//kapag walang nirereturn UNIT ung type
fun deposit(account: MutableMap<String, Any>, depositAmount: Int): String {
    return if (depositAmount > 5000){
        ("You cannot deposit more than 5000")
    } else if (depositAmount % 100 == 0) {
        ("You cannot deposit an amount not divisible by 100")
    } else if (depositAmount < 0) {
        ("You cannot deposit negative amount")
    } else {
        val newBalance= account.getValue("balance").toString().toInt() + depositAmount
        account["balance"] = newBalance
        "You just deposited: $depositAmount. Your new balance is: $newBalance"
    }
}

fun withdrawal(account: MutableMap<String, Any>, depositAmount: Int): String {
    val halfAmount =  account.getValue("balance").toString().toInt() / 2
    return if(depositAmount > halfAmount) {
        ("You cannot withdraw more than half of the current balance amount")
    } else if(depositAmount < 0) {
        ("you cannot withdraw negative amount")
    } else {
        val newBalance= account.getValue("balance").toString().toInt() - depositAmount
        account["balance"] = newBalance
        return "You just withdraw: $depositAmount. Your new balance is: $newBalance"
    }
}


//fun deposit(account: MutableMap<String, out Any>, amount:Int): Unit {
//  var newBalance =  account.getValue("balance") + amount
//    account.put("balance", newBalance)
//    println("You just deposited: $amount. Your new balance is $newBalance")
//}
