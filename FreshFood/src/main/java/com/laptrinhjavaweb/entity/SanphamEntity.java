package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Sanpham")
public class SanphamEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "tensp")
	private String TenSP;
	
	@Column(name = "soluong")
	private int soLuong;
	
	@Column(name = "gia")
	private int gia;
	
	@Column(name = "hinhanh")
	private String hinhanh;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nsx_id")
    private NsxEntity nsx;

	
	
	public NsxEntity getNsx() {
		return nsx;
	}

	public void setNsx(NsxEntity nsx) {
		this.nsx = nsx;
	}


	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "loaisp_id")
    private LoaispEntity loaisp;
	
	public String getTenSP() {
		return TenSP;
	}

	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public LoaispEntity getLoaisp() {
		return loaisp;
	}

	public void setLoaisp(LoaispEntity loaisp) {
		this.loaisp = loaisp;
	}

	public int getId() {
		return id;
	}


	
	
}


