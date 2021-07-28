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
public class DiagnoseDoctorAdapter extends RecyclerView.Adapter<DiagnoseDoctorAdapter.ViewHolder> {

    private List<String> diagnoseReportList;

    public void setDeviceList(List<String> diagnoseReportList) {
        this.diagnoseReportList = diagnoseReportList;
    }

    @NonNull
    @Override
    public DiagnoseDoctorAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_diagnose_doctor, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull DiagnoseDoctorAdapter.ViewHolder holder, int position) {
        holder.tvUser.setText(diagnoseReportList.get(position));
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
        TextView tvUser,tvCaseNo,tvPatientAge,tvSex,tvSymptom,tvDiagnose;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUser = itemView.findViewById(R.id.tv_user);
            tvCaseNo = itemView.findViewById(R.id.tv_case_no);
            tvPatientAge = itemView.findViewById(R.id.tv_patient_age);
            tvSex=itemView.findViewById(R.id.tv_sex);
            tvSymptom =  itemView.findViewById(R.id.tv_symptom);
            tvDiagnose = itemView.findViewById(R.id.tv_diagnose);
        }
    }

}
