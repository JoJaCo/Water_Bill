package com.calivera.andriod.waterbill
//for git purposes all info in this section is made up no account info is real i will
// be using made up numbers and names
object AccountInfo {
    const val USER_ACC: String = "user_num"
    const val USER_NAME: String = "user_name"

    fun getInfo():ArrayList<FakeAccounts>{
        val accountList = ArrayList<FakeAccounts>()

        val acct1 = FakeAccounts(
            "Smith12",
            "Mr.Smith",

        )
        accountList.add(acct1)

        return accountList
    }


}