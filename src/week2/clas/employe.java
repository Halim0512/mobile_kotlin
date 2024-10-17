package week2.clas;

import kotlin.reflect.KClass;

public class employe (val nama : String) {
    fun sayhalo(nama : String){
        println("hello $nama myname is ${this.nama}")
    }
}
class manager (nama: String) : employe(nama)

class member (nama: String) : employe(nama)
