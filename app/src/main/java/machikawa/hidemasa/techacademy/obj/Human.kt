package machikawa.hidemasa.techacademy.obj

import android.util.Log

class Human : Animal,Thinkable {
    var name : String
    var age : Int
    var hobby : String = "日本"

    constructor(name:String, age:Int){
        this.name = name
        this.age = age
    }

    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }

    override fun say() {
        super.say()
        Log.d("kotlintest","私の名前は"+ this.name + "です。年は" + this.age + "歳です。")

    }

}