package com.example.learningjetpackcompose

import kotlinx.serialization.Serializable


sealed class routes{
@Serializable
    object login
@Serializable
   data class details (
       val name: String,
       val email: String
   )
}