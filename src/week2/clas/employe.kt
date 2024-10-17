package week2.clas

open class employe(val nama : String){
    fun sayhalo(nama : String){
        println("hello $nama myname is ${this.nama}")
    }
}
class Manager (nama: String) : employe(nama)
class Member (nama: String) : employe(nama)