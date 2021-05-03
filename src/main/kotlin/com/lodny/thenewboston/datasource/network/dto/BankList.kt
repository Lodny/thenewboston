package com.lodny.thenewboston.datasource.network.dto

import com.lodny.thenewboston.model.Bank

data class BankList(
    val results: Collection<Bank>
)