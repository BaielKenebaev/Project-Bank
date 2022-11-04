import jdk.jfr.DataAmount

fun main() {
    var person = Person("Baiel","Kenenbaev","87715755252")
    var account = Account(Bill(10.0),person)

    var payment = Payment(account.bill)
    var paymentService = PaymentService(account,payment)
    paymentService.makePayment(account,Bill(200.0))
    println(account.bill.amount)

    var person1 = Person("admin","admin","87715755252")
    var account1 = Account(Bill(20.0),person1)

    var payment1 = Payment(account.bill)
    var paymentService1 = PaymentService(account1,payment1)
    paymentService.makePayment(account1,Bill(200.0))
    println(account1.bill.amount)

    var transfer = TransferService()
    transfer.transferCash(account,account1,Bill(10.0))
    println("${account.bill.amount} account ")
    println("${account1.bill.amount} account1 ")

}

class Person(var firstName: String,lastName: String,var number: String ){

}

class Account(var bill: Bill,person: Person){

}

class Bill(var amount: Double) {

}
class Payment(var bill: Bill){

}

class Adjustment(var bill: Bill){

}


class PaymentService(var account: Account,var payment: Payment){
    fun makePayment(account: Account,bill: Bill){

        account.bill.amount=account.bill.amount+bill.amount
    }

    fun makeDePayment(account: Account,bill: Bill){
        account.bill.amount=account.bill.amount-bill.amount
    }
}

class DepositService(var account: Account,var adjustment: Adjustment){
    fun makePayment(account: Account,bill: Bill){

        account.bill.amount=account.bill.amount+bill.amount
    }
}

class TransferService(){
    fun transferCash(accountSend: Account,accountGet: Account, bill: Bill){
        accountSend.bill.amount = accountSend.bill.amount-bill.amount
        accountGet.bill.amount = accountGet.bill.amount+bill.amount
    }

}
