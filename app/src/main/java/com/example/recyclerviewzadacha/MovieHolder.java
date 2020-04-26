package com.example.recyclerviewzadacha;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

    public class MovieHolder extends RecyclerView.Adapter<MovieHolder.MovieViewHolder> {
    private Movie[] mMovies;
    private Context mContext;

        public MovieHolder(Movie[] mMovies, Context context)
        {
            this.mMovies = mMovies;
            this.mContext = context;
        }

        static class MovieViewHolder extends RecyclerView.ViewHolder {

        private TextView zaglavie;
        private TextView janr;
        private TextView godina;

        MovieViewHolder(View v) {
            super(v);
            zaglavie = v.findViewById(R.id.TextViewMname);
            janr = v.findViewById(R.id.TextViewMJanr);
            godina = v.findViewById(R.id.TextViewMgodina);
        }
    }
     @NonNull
      public MovieViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, int viewType) {
         View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.movielayout, parent, false);
         return new MovieViewHolder(v);
     }

    public void onBindViewHolder(@NonNull MovieViewHolder holder, final int position) {
        holder.zaglavie.setText(this.mMovies[position].getZaglavie());
        holder.janr.setText(this.mMovies[position].getJanr());
        holder.godina.setText(String.valueOf(this.mMovies[position].getGodinaIzdavane()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Item " + position + " selected: " + MovieHolder.this.mMovies[position].getZaglavie() , Toast.LENGTH_SHORT).show();
            }
        });
    }

        @Override
        public int getItemCount() {
            return this.mMovies.length;
        }


    }

