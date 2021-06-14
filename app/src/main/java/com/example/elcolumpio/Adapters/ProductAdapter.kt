package com.example.elcolumpio.Adapters

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.elcolumpio.Entity.EntityProduct
import com.example.elcolumpio.R
import com.example.elcolumpio.databinding.ItemProductBinding
import com.google.android.material.snackbar.Snackbar
import java.text.FieldPosition

class ProductAdapter(val prodList : ArrayList<EntityProduct>, val context: Context):RecyclerView.Adapter<ProductHolder>() {


    override fun onCreatedViewHolder(parent:ViewGroup, viewType:Int):ProductHolder{
        val inflater = LayoutInflater.from(parent.context)
    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {

        holder.imgProd.setImageResource(R.drawable.alitas)
        holder.nombreProd.text =
    }
}
class ProductHolder (view: View):RecyclerView.ViewHolder(view)
{
    val binding = ItemProductBinding.bind(view)

    var imgProd = binding.imgProd
    var nombreProd = binding.txtvProdName
    var precioProd = binding.txtPrecio


}