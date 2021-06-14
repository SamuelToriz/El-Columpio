package com.example.elcolumpio.Entity

class EntityProduct (
    var idProd : Int,
    var nameProduct:String,
    var descripcion:String,
    var precio:Double,
    var extras:String)
{
    constructor():this(0,"","",0.0,"")
}