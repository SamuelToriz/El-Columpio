package com.example.elcolumpio.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.elcolumpio.Entity.EntityProduct
import com.example.elcolumpio.R
import com.example.elcolumpio.databinding.ItemProductBinding

class PedidosAdapter(val prodList : ArrayList<EntityProduct>, val context: Context): RecyclerView.Adapter<PedidosHolder>() {


    override fun getItemCount(): Int {

    }


    override fun onBindViewHolder(holder: PedidosHolder, position: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PedidosHolder {
        val inflater = LayoutInflater.from(parent.context)
    }
}
class PedidosHolder (view: View): RecyclerView.ViewHolder(view)
{
    val binding = ItemProductBinding.bind(view)

    var imgProd = binding.imgProd
    var nombreProd = binding.txtvProdName
    var precioProd = binding.txtPrecio


}