package com.example.projectcrud.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projectcrud.R
import com.example.projectcrud.model.BarangModel
import com.squareup.picasso.Picasso
import kotlin.collections.ArrayList

class AdapterBarang(var activity: Activity, var data: ArrayList<BarangModel>): RecyclerView.Adapter<AdapterBarang.Holder>(){
    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNamaBarang = view.findViewById<TextView>(R.id.tvnamabarang)
        val tvHarga = view.findViewById<TextView>(R.id.tvharga)
        val tvDeskripsi = view.findViewById<TextView>(R.id.tvdeskripsi)
        val tvKategori = view.findViewById<TextView>(R.id.tvkategori)
        val tvimgProduk = view.findViewById<ImageView>(R.id.img_produk)
    }
}

    lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterBarang.Holder {
        context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product, parent, false)
        return AdapterBarang.Holder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: AdapterBarang.Holder, position: Int) {
        val a = data[position]

        holder.tvNamaBarang.text = a.nama
        holder.tvHarga.text = a.hara
        holder.tvDeskripsi.text = a.deskripsi
        holder.tvKategori.text = a.category

        val image = "http://192.168.45.207/lat2.public.storage/image/" + a.image
        Picasso.get()
            .load(image)
            .into(holder.tvimgProduk)
    }

    override fun getItemCount(): Int {
        return data.size
    }