package cl.malditosnakamas.briska.utils.extensions

import androidx.appcompat.widget.AppCompatEditText
import cl.talentodigital.ejemplologinfirebase.utils.validator.EmailValidator
import cl.talentodigital.ejemplologinfirebase.utils.validator.NameValidator
import cl.talentodigital.ejemplologinfirebase.utils.validator.PassValidator
import cl.talentodigital.ejemplologinfirebase.utils.validator.RutValidator


fun AppCompatEditText.isValidNameInput(message: String) : Boolean{
    val result = NameValidator.validate(text.toString())
    if(!result){
        this.error = message
        requestFocus()
    }
    return result
}

fun AppCompatEditText.isValidRutInput(message: String) : Boolean{
    val result = RutValidator.validate(text.toString())
    if(!result){
        error = message
        requestFocus()
    }
    return result
}

fun AppCompatEditText.isValidEmailInput(message: String) : Boolean{
    val result = EmailValidator.validate(text.toString())
    if(!result){
        error = message
        requestFocus()
    }
    return result
}

fun AppCompatEditText.isValidPassInput(message: String) : Boolean{
    val result = PassValidator.validate(text.toString())
    if(!result){
        error = message
        requestFocus()
    }
    return result
}