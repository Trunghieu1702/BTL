package com.laptrinhjavaweb.dto;

import java.util.ArrayList;
import java.util.List;

public class SanphamDTO {
		private int id,	loaisp_id,nsx_id,gia,soluong;
		private String tensp,hinhanh;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getLoaisp_id() {
			return loaisp_id;
		}
		public void setLoaisp_id(int loaisp_id) {
			this.loaisp_id = loaisp_id;
		}
		public int getNsx_id() {
			return nsx_id;
		}
		public void setNsx_id(int nsx_id) {
			this.nsx_id = nsx_id;
		}
		public int getGia() {
			return gia;
		}
		public void setGia(int gia) {
			this.gia = gia;
		}
		public int getSoluong() {
			return soluong;
		}
		public void setSoluong(int soluong) {
			this.soluong = soluong;
		}
		public String getTensp() {
			return tensp;
		}
		public void setTensp(String tensp) {
			this.tensp = tensp;
		}
		public String getHinhanh() {
			return hinhanh;
		}
		public void setHinhanh(String hinhanh) {
			this.hinhanh = hinhanh;
		}
		
		private List<SanphamDTO> listResult = new ArrayList<>();
		public List<SanphamDTO> getListResult() {
			return listResult;
		}
		public void setListResult(List<SanphamDTO> listResult) {
			this.listResult = listResult;
		}
}
