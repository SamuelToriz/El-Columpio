package com.example.elcolumpio.Entity

class EntityPedido(
    var idProd : Int,
    var idUsuario : Int,
    var total : Double,
    var direccion:String,
    var tipoPedido:String,
    var metodoPago:String
)

{
    constructor():this(0,0,0.0,"","","")
}