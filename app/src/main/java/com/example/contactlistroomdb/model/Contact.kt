package com.example.contactlistroomdb.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact_table")
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String,
    val email: String,
    val phoneNumber: String
)
