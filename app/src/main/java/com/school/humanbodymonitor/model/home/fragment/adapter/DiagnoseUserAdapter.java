package com.school.humanbodymonitor.model.home.fragment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.school.humanbodymonitor.R;

import java.util.List;

/**
 * @Author
 * @cerate 2021/7/28 10:52
 **/
public class DiagnoseUserAdapter extends RecyclerView.Adapter<DiagnoseUserAdapter.ViewHolder> {

    private List<String> diagnoseReportList;

    public void setDeviceList(List<String> diagnoseReportList) {
        this.diagnoseReportList = diagnoseReportList;
    }

    @NonNull
    @Override
    public DiagnoseUserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_diagnose_user, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull DiagnoseUserAdapter.ViewHolder holder, int position) {
        holder.tvReport.setText(diagnoseReportList.get(position));
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
        TextView tvReport;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvReport = itemView.findViewById(R.id.tv_report);
        }
    }

}
