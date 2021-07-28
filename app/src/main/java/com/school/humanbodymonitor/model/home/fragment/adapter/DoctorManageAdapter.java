package com.school.humanbodymonitor.model.home.fragment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;
import com.school.humanbodymonitor.R;

import java.util.List;

/**
 * @Author
 * @cerate 2021/7/28 10:52
 **/
public class DoctorManageAdapter extends RecyclerView.Adapter<DoctorManageAdapter.ViewHolder> {

    private List<String> diagnoseReportList;

    public void setDeviceList(List<String> diagnoseReportList) {
        this.diagnoseReportList = diagnoseReportList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DoctorManageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doctor_manage, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull DoctorManageAdapter.ViewHolder holder, int position) {

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return diagnoseReportList == null ? 0 : diagnoseReportList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName,tvWorkNo;
        MaterialButton butDetail;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_work_no);
            tvWorkNo = itemView.findViewById(R.id.tv_name);
            butDetail = itemView.findViewById(R.id.but_detail);
        }
    }

}
