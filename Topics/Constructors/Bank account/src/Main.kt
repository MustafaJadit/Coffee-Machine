// write the BankAccount class here
class BankAccount constructor(var deposited: Long, var withdrawn: Long) {
    //    val deposited = deposited_
//    val withdrawn = withdrawn_
    var balance = deposited - withdrawn
}