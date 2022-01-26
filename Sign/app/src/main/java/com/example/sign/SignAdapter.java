package com.example.sign;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SignAdapter extends RecyclerView.Adapter<SignAdapter.SignViewHolder> {

    List<SignData> signDataList;
    private Context context;

    public SignAdapter(Context context, List<SignData> signDataList) {
        this.context = context;
        this.signDataList = signDataList;
    }

    @NonNull
    @Override
    public SignAdapter.SignViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sign_list_row, parent, false);
        return new SignViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SignAdapter.SignViewHolder holder, int position) {
        SignData signData = signDataList.get(position);
        holder.signName.setText(signData.signName);
        int resId = context.getResources().getIdentifier(signData.signImageName, "drawable", "com.example.sign");
        holder.imageView.setBackgroundResource(resId);

    }

    @Override
    public int getItemCount() {
        return signDataList.size();
    }

    class SignViewHolder extends RecyclerView.ViewHolder{
        LinearLayout parent;
        TextView signName;
        ImageView imageView;

        public SignViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            signName = itemView.findViewById(R.id.signName);
            imageView = itemView.findViewById(R.id.imageView);

            // signName.getText().toString();

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(signName.getText().toString().equals("PISCES") == true) {
                            Intent intent = new Intent (itemView.getContext(), PiscesActivity.class);
                            itemView.getContext().startActivity(intent);
                       }
                        else if(signName.getText().toString().equals("CANCER") == true) {
                            Intent intent = new Intent (itemView.getContext(), CancerActivity.class);
                            itemView.getContext().startActivity(intent);
                        }

                        else if(signName.getText().toString().equals("ARIES") == true) {
                            Intent intent = new Intent (itemView.getContext(), AriesActivity.class);
                            itemView.getContext().startActivity(intent);
                        }

                        else if(signName.getText().toString().equals("TAURUS") == true) {
                            Intent intent = new Intent (itemView.getContext(), TaurusActivity.class);
                            itemView.getContext().startActivity(intent);
                        }

                        else if(signName.getText().toString().equals("GEMINI") == true) {
                            Intent intent = new Intent (itemView.getContext(), GeminiActivity.class);
                            itemView.getContext().startActivity(intent);
                        }

                        else if(signName.getText().toString().equals("LEO") == true) {
                            Intent intent = new Intent (itemView.getContext(), LeoActivity.class);
                            itemView.getContext().startActivity(intent);
                        }

                        else if(signName.getText().toString().equals("VIRGO") == true) {
                            Intent intent = new Intent (itemView.getContext(), VirgoActivity.class);
                            itemView.getContext().startActivity(intent);
                        }

                        else if(signName.getText().toString().equals("LIBRA") == true) {
                            Intent intent = new Intent (itemView.getContext(), LibraActivity.class);
                            itemView.getContext().startActivity(intent);
                        }

                        else if(signName.getText().toString().equals("SCORPIO") == true) {
                            Intent intent = new Intent (itemView.getContext(), ScorpioActivity.class);
                            itemView.getContext().startActivity(intent);
                        }

                        else if(signName.getText().toString().equals("SAGITTARIUS") == true) {
                            Intent intent = new Intent (itemView.getContext(), SagittariusActivity.class);
                            itemView.getContext().startActivity(intent);
                        }

                        else if(signName.getText().toString().equals("CAPRICORN") == true) {
                            Intent intent = new Intent (itemView.getContext(), CapricornActivity.class);
                            itemView.getContext().startActivity(intent);
                        }

                        else if(signName.getText().toString().equals("AQUARIUS") == true) {
                            Intent intent = new Intent (itemView.getContext(), AquariusActivity.class);
                            itemView.getContext().startActivity(intent);
                        }

                    }
               });

        }
    }
}
