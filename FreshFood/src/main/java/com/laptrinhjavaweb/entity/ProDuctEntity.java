package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProDuct")
public class ProDuctEntity {
	
	@Id
	private String MaSP;
	
	@Column(name = "tensp")
	private String TenSP;
	
	public String getMaSP() {
		return MaSP;
	}

	public void setMaSP(String maSP) {
		MaSP = maSP;
	}

	public String getTenSP() {
		return TenSP;
	}

	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public String getDanhGia() {
		return DanhGia;
	}

	public void setDanhGia(String danhGia) {
		DanhGia = danhGia;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Column(name = "gia")
	private int gia;
	
	@Column(name = "danhgia",columnDefinition = "nvarchar(MAX)")
	private String DanhGia;
	
	@Column(name = "img",columnDefinition = "nvarchar(MAX)")
	private String img;
}
