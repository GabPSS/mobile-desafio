package com.example.catlogodefilmes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.catlogodefilmes.R
import com.example.catlogodefilmes.model.Filme

class FilmeAdapter(private val listaFilmes: List<Filme>) : RecyclerView.Adapter<FilmeAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val txvTitulo = itemView.findViewById<TextView>(R.id.txv_card_titulo)
        val txvGenero = itemView.findViewById<TextView>(R.id.txv_card_genero)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_filme, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listaFilmes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val filme = listaFilmes[position]

        holder.txvTitulo.text = filme.titulo
        holder.txvGenero.text = filme.genero
    }

}