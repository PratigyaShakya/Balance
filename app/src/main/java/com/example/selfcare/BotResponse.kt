package com.example.selfcare

import com.example.selfcare.Constants.OPEN_GOOGLE
import com.example.selfcare.Constants.OPEN_SEARCH

object BotResponse {

    fun basicResponses(_message:String) : String{

        val random = (0..2).random()
        val message = _message.toLowerCase()


        return when {
            message.contains("hello")-> {
                when(random){
                    0 -> "Hello there! How are you doing today?"
                    1 -> "Welcome back, I am so happy to see you."
                    2 -> "Hey! How's your day?"
                    else -> "error"
                }
            }

            message.contains("how are you") -> {
                when(random){
                    0 -> "I'm doing fine. Thanks for asking."
                    1 -> "I might just be hungry"
                    2 -> "It's been a good day."
                    else -> "error"
                }
            }

            message.contains("stressed") -> {
                when(random){
                    0 -> "Remember, you don't have to be perfect. Having a bad day is okay. Small steps are also progress!"
                    1 -> "I think you are doing a beautiful job figuring out some heavy shit!"
                    2 -> "Stressed spelled backwards is desserts. Coincidence? I think not!"
                    else -> "error"
                }
            }


            message.contains("open") && message.contains("google") -> {
                OPEN_GOOGLE
            }
            message.contains("search") -> {
                OPEN_SEARCH
            }


            else -> {
                when(random){
                    0 -> "I don't understand."
                    1 -> "I am here to help you."
                    2 -> "I am here for you."
                    else -> "error"
                }
            }
        }

    }
}